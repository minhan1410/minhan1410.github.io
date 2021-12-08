// Bài 1: Thêm label cho các trường username, password, confirm password
const formInput = document.querySelectorAll(".form-input");

for (let i = 1; i <= 3; i++) {
    const label = document.createElement("label");
    if (i == 1) {
        label.textContent = "username";
    } else if (i == 2) {
        label.textContent = "password";
    } else {
        label.textContent = "confirm password";
    }

    formInput[i - 1].insertAdjacentElement("beforebegin", label);
}

// Bài 2: Kiểm tra xem password và confirm pass có trùng nhau hay không
// Bài 3: Đảm bảo nút ‘Đăng ký’ bị disable cho đến khi người dùng nhập dữ liệu hợp lệ vào tất cả các trường đầu vào.
// Sau khi nhập đầy đủ thì ‘Đăng ký’ được enable.
// Bài 4: Khi user nhập đủ thông tin và bấm vào nút submit thì tạo 1 hộp thoại thông báo đăng ký thành công

const username = document.querySelector("#username");
const password = document.querySelector("#password");
const confirmPassword = document.querySelector("#confirmPassword");
const button = document.querySelector("#btn");

password.disabled = true;
confirmPassword.disabled = true;
button.disabled = true;

username.addEventListener("input", () => {
    if (username.value !== "") {
        password.disabled = false;
    }
    password.addEventListener("input", () => {
        if (password.value !== "") {
            confirmPassword.disabled = false;
        }
        confirmPassword.addEventListener("input", () => {
            let check = password.value === confirmPassword.value ? true : false;
            if (check) {
                button.disabled = false;
                alert("Đăng ký thành công")
            }
        });
    });
});


