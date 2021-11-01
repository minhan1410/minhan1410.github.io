/*
Sự kiện keyboard
*/

document.addEventListener('keydown', function(event) {
    if(event.keyCode == 13) {
        console.log('Bạn thật đẹp trai');
    } else {
        console.log('Bấm phím Enter đi. Có điều bất ngờ đó');
    }
})

// document.addEventListener('keyup', function() {
//     console.log('keyup');
// })

// document.addEventListener('keypress', function() {
//     console.log('keypress');
// })

// THỰC HÀNH
// Mỗi khi bấm vào phím enter thì tạo 1 hình tròn ở vị trí bất kỳ trên màn hình
// Tại 1 thời điểm chỉ có 1 hình tròn


/*
Sự kiện scroll
*/
const btn = document.getElementById('btn')

// Window scroll đến khoảng nào đó => hiện button
window.addEventListener('scroll', function() {
    if(document.documentElement.scrollTop > 300) {
        btn.classList.remove('hide')
    } else {
        btn.classList.add('hide')
    }
})

// Bấm vào nút TOP thì quay về đầu trang
btn.addEventListener('click', function() {
    window.scrollTo({
        top: 0,
        behavior: 'smooth'
    })
})