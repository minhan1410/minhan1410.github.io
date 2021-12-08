let student_warning = {
    students: [
        {
            name: "Lê Hoài Nam",
            email: "namlehoai@gmail.com",
            phone: "123456789",
            totalOff: 2,
            sessions: 14,
            detailInfo: [
                {
                    date: "01-09-2020",
                    note: "Xin nghỉ ốm",
                    teacher_name: "Bùi Hiên",
                },
                {
                    date: "05-09-2020",
                    note: "Buồn vì thất tình",
                    teacher_name: "Nguyễn Hàn Duy",
                },
            ],
        },
        {
            name: "Đỗ Đăng Nguyên",
            email: "nguyen@gmail.com",
            phone: "0123987654",
            totalOff: 2,
            sessions: 14,
            detailInfo: [
                {
                    date: "01-09-2020",
                    note: "Mưa to nên ngại đi học",
                    teacher_name: "Bùi Hiên",
                },
                {
                    date: "05-09-2020",
                    note: "Trượt lô, nên rút học phí để đánh",
                    teacher_name: "Nguyễn Hàn Duy",
                },
            ],
        },
        {
            name: "Nguyễn Xuân Ba",
            email: "3nx92nd@gmail.com",
            phone: "0344005987",
            totalOff: 3,
            sessions: 14,
            detailInfo: [
                {
                    date: "01-09-2020",
                    note: "Đang training không đi học được",
                    teacher_name: "Bùi Hiên",
                },
                {
                    date: "07-09-2020",
                    note: "Soạn giáo án đặc vụ 0175",
                    teacher_name: "Nguyễn Hàn Duy",
                },
                {
                    date: "10-09-2020",
                    note: "Ganks team còng lưng nên chưa đi học được",
                    teacher_name: "Nguyễn Hàn Duy",
                },
            ],
        },
    ],
    class: "Lập trình Game 2D Canvas",
    course: "Lập trình Game",
    sessions: 14,
    teachers: [
        {
            name: "Bùi Hiên",
            email: "hien@techmaster.vn",
            phone: "0123456789",
        },
        {
            name: "Nguyễn Hàn Duy",
            email: "duy@techmaster.vn",
            phone: "0987654321",
        },
    ],
};

const tbody = document.querySelector("tbody");
student_warning.students.forEach((student, index) => {
    let tr = document.createElement("tr");

    let id = document.createElement("td");
    id.innerText = index + 1;
    tr.appendChild(id);

    for (let key in student) {
        if (key != "sessions" && key != "detailInfo") {
            let td = document.createElement("td");

            if (key == "totalOff") {
                td.innerText = `${student[key]}/${student.sessions}`;
            } else {
                td.innerText = student[key];
            }

            tr.appendChild(td);
        }
    }

    student["detailInfo"].forEach((values) => {
        let trDetail = document.createElement("tr");
        for (let keyDetail in values) {
            let tdDetail = document.createElement("td");
            tdDetail.innerHTML = values[keyDetail];
            trDetail.appendChild(tdDetail);
        }
        tr.appendChild(trDetail);
    });

    tbody.appendChild(tr);
});

const inner = document.querySelector(".class-inner");

let clas = document.createElement("p");
clas.innerHTML = `<b>Lớp học</b> : ${student_warning.class}`;
inner.appendChild(clas);

let course = document.createElement("p");
course.innerHTML = `<b>Thuộc tính khóa học</b> : ${student_warning.course}`;
inner.appendChild(course);

let teachers = document.createElement("p")
teachers.innerHTML = `<b>Danh sách giảng viên</b> : </br>`;
let ul = document.createElement("ul")
student_warning.teachers.forEach(i => {
    let li = document.createElement("li")
    li.innerText = `${i.name} (${i.email} - ${i.phone})`
    ul.appendChild(li)
})
teachers.appendChild(ul)
inner.appendChild(teachers);

let sessions = document.createElement("p");
sessions.innerHTML = `<b>Tổng số buổi học</b> : ${student_warning.sessions}`;
inner.appendChild(sessions);