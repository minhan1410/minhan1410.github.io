// Yêu cầu: Sử dụng Javascript để thực hiện các công việc sau

// 1. Một tính năng mới vào gói Pro: '24/7 Phone support'
const li = document.createElement("li");
li.innerText = "24/7 Phone support";

const ulPro = document.querySelector("#pro-plan ul");
ulPro.appendChild(li);

// 2. Đổi vị trí 2 card pricing (pro, basic) => (basic, pro)
const row = document.querySelector(".row");
const pro = row.children[0];

pro.remove();
row.appendChild(pro);

// 3. Trong gói Pro hãy cập nhật nút 'Get Started' hiện tại thành màu xanh có màu background: #0984e3, có chữ màu #fff và có dòng chữ 'Buy Now'
const button = document.querySelectorAll(".card-body button");
button[1].style.background = "#0984e3";
button[1].style.color = "#fff";
button[1].innerText = "Buy Now";

// 4. Tăng dung lượng lưu trữ của gói Pro thêm 25%, gói Basic thêm 50%
const storage = document.querySelectorAll(".storage-amount");
storage[0].innerHTML *= 1.5;
storage[1].innerHTML *= 1.25;
console.log(storage)
