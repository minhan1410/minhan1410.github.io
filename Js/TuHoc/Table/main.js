// Yêu cầu: Sử dụng Javascript để thực hiện các công việc sau
// 1. Thêm class "table-bordered" cho <table>
const table = document.querySelector("table");
table.classList.add("table-bordered");

// 2. Thêm class "bg-dark" cho <tr> đầu tiên
let tableTr = table.querySelectorAll("tr");
tableTr[0].classList.add("bg-dark");

// 3. Thêm 1 hàng mới trong table với nội dung như sau : 'Sean Reyes' (@sreyes)
const clone = tableTr[1].cloneNode(true);
table.appendChild(clone);

const cloneTd = clone.querySelectorAll("td");
cloneTd[0].innerText = tableTr.length;
cloneTd[1].innerText = "Sean";
cloneTd[2].innerText = "Reyes";
cloneTd[3].innerText = "@sreyes";

// 4. Cập nhật "Leona Dixon's handle" thành "@dixonl" (hàng 3 - cột Handle)
const tr3 = tableTr[3];
tr3.querySelectorAll("td")[3].innerText = "@dixonl";

// 5. Di chuyển "Rosa Reed" lên đầu bảng và đảm bảo tất cả các mục nhập số trong cột đầu tiên được cập nhật tương ứng.
const tr4 = tableTr[4];
tr4.querySelectorAll("td")[0].innerText = 1;

for (let i = 2; i <= 4; i++) {
    tableTr[i-1].querySelectorAll("td")[0].innerText = i;
}

const tr4Clone = tr4.cloneNode(true);
tr4.remove();
tableTr[0].insertAdjacentElement("afterend",tr4Clone)


// 6. Đổi chỗ 2 cột "First" và "Handle" cho nhau
const tr0 = tableTr[0]
const th = tr0.querySelectorAll("th")

const thValue1 = th[1].innerText
th[1].innerText = th[3].innerText
th[3].innerText = thValue1

tableTr = table.querySelectorAll("tr");

for (let i = 1; i < tableTr.length; i++) {
    const td = tableTr[i].querySelectorAll("td");
    const tdValue1 = td[1].innerText;
    td[1].innerText = td[3].innerText;
    td[3].innerText = tdValue1;
}

// 7. Các row có index là số lẻ ( trừ hàng tiêu đề cột )thì có background = "#f2f2f2"
tableTr.forEach((tr,index)=> {
    if(index%2!=0){
        tr.style.background = "#f2f2f2";
    }
})