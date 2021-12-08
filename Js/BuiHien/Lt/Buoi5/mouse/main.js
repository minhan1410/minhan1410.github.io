/*
Cách cách xử lý sự kiện

// -- Cách 1: Viết trực tiếp vào mã HTML
function sayHello(name) {
    alert(`Xin chào ${name}`)
}

// -- Cách 2
const btn = document.getElementById("btn")
btn.onclick = hello

function hello() {
    alert("Xin chào")
}

// -- Cách 3
const btn2 = document.getElementById("btn2")
btn2.addEventListener('click', function(event) {
    console.log(event);
})
*/


/*
Sự kiện chuột
*/

// Ví dụ: Mỗi khi click vào 1 vị trí trên trình duyệt, tạo 1 quả bóng màu đỏ ở vị trí đó
document.addEventListener('click', function(event) {
    // Xóa hết hình tròn đi
    let boxes = document.querySelectorAll('.box')
    Array.from(boxes).map(ele => document.body.removeChild(ele))

    // Tạo ra 1 hình tròn
    let box = document.createElement('div')
    box.classList.add('box')

    // Set vị trí
    box.style.top = `${event.offsetY - 50}px`
    box.style.left = `${event.offsetX - 50}px`

    // Gắn vào DOM
    document.body.appendChild(box)
})

document.addEventListener('mousedown', function() {
    console.log('mousedown');
})

document.addEventListener('mouseup', function() {
    console.log('mouseup');
})

document.addEventListener('mousemove', function() {
    console.log('mousemove');
})
