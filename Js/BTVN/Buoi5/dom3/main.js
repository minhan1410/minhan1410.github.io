// Yêu cầu: Sử dụng Javascript để thực hiện các công việc sau
// 1. Thêm 3 job bổ sung vào phần 'job' của trang bằng cách sao chép 'job-card' ban đầu.
const jobs = document.querySelector(".jobs");
const jobCard = document.querySelector(".job-card");

for (let i = 1; i <= 3; i++) {
    jobs.appendChild(jobCard.cloneNode(true));
}

// 2. Cập nhật tiêu đề của các job mới thành : JavaScript Developer, Java Developer, Python Developer
const jobCardAll = document.querySelectorAll(".job-card");
for (let i = 1; i <= 3; i++) {
    switch (i) {
        case 1:
            jobCardAll[i].querySelector("h3").innerText =
                "JavaScript Developer";
            break;
        case 2:
            jobCardAll[i].querySelector("h3").innerText = "Java Developer";
            break;
        case 3:
            jobCardAll[i].querySelector("h3").innerText = "Python Developer";
            break;
    }
}

// 3. Cập nhật Jobs listed thành tổng số công việc hiện có trong trang
const jobsListed = document.querySelector("#jobs-listed");
jobsListed.childNodes[0].innerText = jobCardAll.length;

// 4. Nhập tên công việc vào ô tìm kiếm để lọc các công việc (lọc theo tên công việc). Những công việc được tìm thấy sẽ hiển thị ra, còn lại sẽ bị ẩn đi
const search = document.querySelector("#search");
search.addEventListener("keyup", (e) => {
    Array.from(jobCardAll).map((job) => {
        job
            .querySelector("h3")
            .innerText.toLowerCase()
            .includes(e.target.value.toLowerCase())
            ? (job.style.display = "block")
            : (job.style.display = "none");
    });
});

// 5. Bấm vào Nút "All jobs" để reset ô tìm kiếm và hiển thị ra tất cả các công việc
const allJobs = document.querySelector("#show-all");
allJobs.addEventListener("click", () => {
    search.value = "";
    Array.from(jobCardAll).map((job) => {
        job.style.display = "block";
    });
});