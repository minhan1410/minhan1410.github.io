// Truy cập vào các phần tử
const usernameEl = document.getElementById('username')
const passwordEl = document.getElementById('password')
const btnLogin = document.getElementById('btn-login')

/*
Xử lý sự kiện khi người dùng bấm vào nút login
*/
btnLogin.addEventListener('click', function() {
    // Lấy value trong ô input
    let usernameValue = usernameEl.value;
    let passwordValue = passwordEl.value;

    // Xóa class error và success trong thẻ input
    let inputs = document.querySelectorAll('input')
    Array.from(inputs).map(input => input.classList.remove('success', 'error'))

    // Xóa đi tất cả message error trong thẻ span
    let spans = document.querySelectorAll('span')
    Array.from(spans).map(span => span.innerText = "")

    // Kiểm tra validate
    checkValidate(usernameValue, passwordValue)
})

/*
Hàm check validate
*/
function checkValidate(usernameValue, passwordValue) {
    // Check username
    if(usernameValue == "") {
        setError(usernameEl, "Tên không được để trống")
    } else {
        setSuccess(usernameEl)
    }

    // Check password
    if(passwordValue == "") {
        setError(passwordEl, "Mật khẩu không được để trống")
    } else if(passwordValue.length < 8) {
        setError(passwordEl, "Mật khẩu phải lớn hơn hoặc bằng 8 ký tự")
    } else {
        setSuccess(passwordEl)
    }
}

/*
Hàm xử lý error

Bao gồm 2 công việc :
- Thêm class error
- Thêm message error
*/
function setError(ele, message) {
    ele.classList.add('error')
    let span = ele.parentElement.querySelector('span')
    span.innerText = message
}

/*
Hàm xử lý success

Bao gồm công việc :
- Thêm class success
*/
function setSuccess(ele) {
    ele.classList.add('success')
}