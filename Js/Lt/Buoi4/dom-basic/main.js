// Truy cập thông qua ID
const heading = document.getElementById("heading")
console.log(heading);

// Truy cập thông qua tag name
const paras = document.getElementsByTagName("p")
console.log(paras);

console.log(paras[1]);
console.log(paras.length);

// Truy cập thông qua class name
const parasClass = document.getElementsByClassName("para")
console.log(parasClass);

// Truy cập thông qua CSS selector
// Trả về phần tử đầu tiên mà nó tìm thấy
const headingSelector = document.querySelector("#heading")
console.log(headingSelector);

const paraSelector = document.querySelector(".para")
console.log(paraSelector);

// Làm sao thấy ra được thẻ para 3

// p + p + p
// .para + .para
// body > p:nth-child(4)
const para3Selector = document.querySelector("body > p:nth-child(4)")
console.log(para3Selector);

// Lấy tập hợp thông qua CSS Selector
const parasQuery = document.querySelectorAll("p.para")
console.log(parasQuery);

//
const ul2 = document.querySelector("body > ul")
console.log(ul2);

const li4 = document.querySelector("ul > li:last-child")
console.log(li4);

// Truy cập gián tiếp
const li3 = li4.previousElementSibling
console.log(li3);

const parentLi4 = li4.parentElement.parentElement
console.log(parentLi4);

// Lấy nội dung phần tử
console.log(heading.innerHTML);
console.log(heading.innerText);
console.log(heading.textContent);

const box = document.querySelector(".box")
console.log(box.innerHTML);
console.log(box.innerText);
console.log(box.textContent);

// Thay đổi nội dung phần tử
heading.innerHTML = "<span style='color : red'>Xin chào</span>"

heading.innerText = "<span style='color : red'>Xin chào</span>"

heading.textContent = "<span style='color : red'>Xin chào</span>"

// Tạo thẻ
const paraNew = document.createElement("p")
paraNew.innerText = "Thẻ para new"
paraNew.id = "para"
paraNew.className = "para-new"

console.log(paraNew);

// Insert vào đầu của body
// document.body.prepend(paraNew)

// document.body.append(paraNew)

document.body.insertBefore(paraNew, box)

// Bước 1: Tạo thẻ, chèn nội dung cho thẻ
const liNew = document.createElement("li")
liNew.innerText = "Li new"

// Bước 2: Xác định node cha, và node reference
// liParent = document.querySelector(".box ul")


// Bước 3: Sử dụng insertBefore
// liParent.insertBefore(liNew, li4)

// Sử dụng insertAdjacentHTML
// li4.insertAdjacentHTML("beforebegin", "<li>Li new</li>")

// li3.insertAdjacentHTML("afterend", "<li>Li new</li>")

// Sử dụng insertAdjacentElement
// li4.insertAdjacentElement("beforebegin", liNew)

// Tạo thẻ button có nội dung là "click me"
// Có backgrounf-color : red
// color : white
// const btn = document.createElement("button")
// btn.innerText = "click me"
// // btn.className = "btn"
// btn.style.backgroundColor = 'red'
// btn.style.color = 'white'

// box.insertAdjacentElement("afterend", btn)

// box.insertAdjacentHTML("afterend", "<button style='background-color: red; color:white;'>click me</button>")


// Xóa phần tử
// Xóa h1
document.body.removeChild(heading)

// Cách 2
// Xóa thẻ para 2
paraSelector.parentElement.removeChild(paraSelector)

// Thay thế phần tử
const link = document.createElement('a')
link.innerText = "google.com"
link.href = "https://google.com"
link.target = "_blank"

const para1 = document.querySelector("p")

document.body.replaceChild(link, para1)

// Sao chép phần tử
const boxCopy = box.cloneNode(false)
document.body.prepend(boxCopy)
