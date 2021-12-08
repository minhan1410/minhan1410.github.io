// Yêu cầu: Sử dụng Javascript để thực hiện các công việc sau

// 1. Thêm 3 job bổ sung vào phần 'job' của trang bằng cách sao chép 'job-card' ban đầu.
const jobs = document.querySelector(".jobs");
const job1 = document.querySelector(".job-card");

jobs.appendChild(job1.cloneNode(true));
jobs.appendChild(job1.cloneNode(true));
jobs.appendChild(job1.cloneNode(true));

// 2. Cập nhật tiêu đề của các job mới thành : JavaScript Developer, Java Developer, Python Developer
const titles = document.querySelectorAll(".job-card-inner");

titles[1].querySelector("h3").innerText = "JavaScript Developer";
titles[2].querySelector("h3").innerText = "Java Developer";
titles[3].querySelector("h3").innerText = "Python Developer";

// 3. Cập nhật Jobs listed thành tổng số công việc hiện có trong trang
const jobsListed = document.querySelector("#jobs-listed");
jobsListed.querySelector("span").innerText = jobs.children.length;

// 4. Nhập tên công việc vào ô tìm kiếm để lọc các công việc (lọc theo tên công việc).
// Những công việc được tìm thấy sẽ hiển thị ra, còn lại sẽ bị ẩn đi
const search = document.querySelector("#search");

search.addEventListener("keyup", () => {
    Array.from(titles).forEach(title => {
        if (title.querySelector("h3").innerText.toLowerCase().includes(search.value.toLowerCase())) {
            title.style.display = "block";
        } else {
            title.style.display = "none";
        }
    })
});

// 5. Bấm vào Nút "All jobs" để reset ô tìm kiếm và hiển thị ra tất cả các công việc
const showAll = document.querySelector("#show-all");
showAll.addEventListener("click",()=>{
    Array.from(titles).forEach(title => {
        if(title.style.display=="none"){
            title.style.display = "block";
        }
    })
})
