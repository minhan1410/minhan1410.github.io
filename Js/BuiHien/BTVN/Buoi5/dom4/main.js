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
for (let i = 0; i < student_warning.students.length; i++) {
    let student = student_warning.students[i];
    let length = student.detailInfo.length;

    for (let j = 0; j < student.detailInfo.length; j++) {
        const tr = document.createElement("tr");

        if (j == 0) {
            tr.innerHTML = `
            <td rowspan="${length}">${i + 1}</td>
            <td rowspan="${length}">${student.name}</td>
            <td rowspan="${length}">${student.email}</td>
            <td rowspan="${length}">${student.phone}</td>
            <td rowspan="${length}">${student.totalOff}/${student.sessions}</td>
            <td>${student.detailInfo[j].date}</td>
            <td>${student.detailInfo[j].note}</td>
            <td>${student.detailInfo[j].teacher_name}</td>
            `;
        } else {
            tr.innerHTML = `
            <td>${student.detailInfo[j].date}</td>
            <td>${student.detailInfo[j].note}</td>
            <td>${student.detailInfo[j].teacher_name}</td>
            `;
        }

        tbody.appendChild(tr);
    }
}

const classInner = document.querySelector(".class-inner");
for (let i = 0; i < 4; i++) {
    const span = document.createElement("span");
    let content, textContent;
    switch (i) {
        case 0:
            content = "Lớp học";
            textContent = student_warning.class;
            span.innerHTML = `<b>${content}</b> : ${textContent}</br>`;
            classInner.appendChild(span);
            break;
        case 1:
            content = "Thuộc khóa học";
            textContent = student_warning.course;
            span.innerHTML = `<b>${content}</b> : ${textContent}</br>`;
            classInner.appendChild(span);
            break;
        case 2:
            content = "Danh sách giảng viên";
            span.innerHTML = `<b>${content}</b> : </br>`;
            const ul = document.createElement("ul");
            for (let j = 0; j < student_warning.teachers.length; j++) {
                const li = document.createElement("li");
                li.innerHTML = `${student_warning.teachers[j].name} - ${student_warning.teachers[j].email} - ${student_warning.teachers[j].phone}`;
                ul.appendChild(li);
            }
            span.appendChild(ul);
            classInner.appendChild(span);
            break;
        case 3:
            content = "Tổng số buổi";
            textContent = student_warning.sessions;
            span.innerHTML = `<b>${content}</b> : ${textContent}</br>`;
            classInner.appendChild(span);
            break;
    }
}
