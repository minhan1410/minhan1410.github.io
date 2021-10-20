// Khai báo Object
let student = {
    name: "Nguyễn Văn A",
    age: 19,
    sayHello: function () {
        console.log("Xin chào ", this.name);
    },
    printAge: () => {
        console.log(this);
        console.log(`Age - ${this.age}`);
    },
};

// Gọi phương thức
student.sayHello();

// Bind this đến object => bind, call, apply
// Note : Tại sao bind lại không được
// student.printAge.bind(student)

// Bổ sung thêm thuộc tính
student.email = "abc@gmail.com";
console.log(student);

// Xóa thuộc tính
delete student.email;
console.log(student);

// Khai báo object = const => không thể gán object cho một object khác, nhưng có thể thay đổi giá trị từng thuộc tính của object
let person = {
    name: "Ngô Văn B",
    age: 15,
};

// person.name = "Nguyễn Thị C"

// Object là kiểu tham chiếu. Nên khi thay đổi giá trị của 1 object sẽ ảnh hưởng đến object còn lại
let person2 = person;
person2.name = "Trần C";

console.log(person);
console.log(person2);

// Function constructor
function Student(name, age) {
    this.name = name;
    this.age = age;
    // this.class = "Java Spring Boot"

    this.hello = function () {
        console.log(`Name : ${this.name} - Age : ${this.age}`);
    };

    this.changeClass = function () {
        Student.prototype.class = "Front End";
    };
}

Student.prototype.class = "Java Spring Boot";

let std = new Student("Bùi Hiên", 25);
console.log(std.class);

let std1 = new Student("Bùi Hiên", 25);
console.log(std1.class);

std1.changeClass();

let std2 = new Student("Bùi Hiên", 25);
console.log(std2.class);

// Phương thức
// Lấy danh sách key của object
console.log(Object.keys(std));

// Lấy danh sách value của object
console.log(Object.values(std));

// Kiểm tra 1 key có nằm trong object hay không
console.log(student.hasOwnProperty("email"));
console.log(student.hasOwnProperty("name"));

// Vòng lặp for ... in
for (const key in std) {
    console.log(std[key]);
}

console.log(std.name);
console.log(std["name"]);

// HOC - Higher Order Function
// Nó nhận function khác vào làm tham số
// Nó trả về một function

function funA(a, b) {
    return function funB(c) {
        return a + b + c;
    };
}

// Gọi function lần lượt
data = funA(3, 4); // => data ở đây là 1 fucntion được trả về từ funcA
console.log(data);
console.log(data(5));

// Gọi nối 2 lần
console.log(funA(4, 5)(6));

// Ví dụ về cachs HOC nhận 1 hàm khác vào làm tham số
let arr = [1, 2, 3, 4, 5, 6, 7];
let filterNumber = function (ele) {
    return ele % 2 == 1;
};

let newArr = arr.filter(filterNumber);
console.log(newArr);

let grades = [
    { name: "John", grade: 8, sex: "M" },
    { name: "Sarah", grade: 12, sex: "F" },
    { name: "Bob", grade: 16, sex: "M" },
    { name: "Johnny", grade: 2, sex: "M" },
    { name: "Ethan", grade: 4, sex: "M" },
    { name: "Paula", grade: 18, sex: "F" },
    { name: "Donald", grade: 5, sex: "M" },
    { name: "Jennifer", grade: 13, sex: "F" },
    { name: "Courtney", grade: 15, sex: "F" },
    { name: "Jane", grade: 9, sex: "F" },
];

// 1. Tìm thứ hạng trung bình của cả lớp
// 2. Tìm thứ hạng trung bình của nam trong lớp
// 3. Tìm thứ hạng trung bình của Nữ trong lớp
// 4. Tìm thứ hạng cao nhất của Nam trong lớp
// 5. Tìm thứ hạng cao nhất của Nữ trong lớp
// 6. Tìm thứ hạng thấp nhất của Nam trong lớp
// 7. Tìm thứ hạng thấp nhất của Nữ trong lớp
// 8. Tìm thứ hạng cao nhất của cả lớp
// 9. Tìm thứ hạng thấp nhất của cả lớp
// 10. Lấy ra danh sách tất cả học viên nữ trong lớp
// 11. Sắp xếp tên học viên theo chiều tăng dần của bảng chữ cái
// 12. Sắp xếp thứ hạng học viên theo chiều giảm dần
// 13. Lấy ra học viên nữ có tên bắt đầu bằng "J"
// 14. Lấy ra top 5 người có thứ hạng cao nhất

// Lọc ra các học sinh là nam
const isMale = (grades) => {
    return grades.filter((ele) => ele.sex === "M");
};

// Lọc ra các học sinh là nữ
const isFemale = (grades) => {
    return grades.filter((ele) => ele.sex === "F");
};

// Tính trung bình grade của 1 mảng bất kỳ
const avgGrade = (grades) => {
    return grades.reduce((sum, ele) => sum + ele.grade, 0) / grades.length;
};

// Lấy giá trị grade lớn nhất trong mảng grades
const isMax = (grades) => {
    return Math.max(...grades.map((std) => std.grade));
};

// Lấy giá trị grade nhỏ nhất trong mảng grades
const isMin = (grades) => {
    return Math.min(...grades.map((std) => std.grade));
};

// 1. Tìm thứ hạng trung bình của cả lớp
console.log("Trung bình cả lớp: ", avgGrade(grades));

// 2. Tìm thứ hạng trung bình của nam trong lớp
console.log("Trung bình Nam:", avgGrade(isMale(grades)));

// 3. Tìm thứ hạng trung bình của nữ trong lớp
console.log("Trung bình Nam:", avgGrade(isFemale(grades)));

// 4. Tìm thứ hạng của nam cao nhất trong lớp
console.log(isMax(isMale(grades)));

// 5. Tìm thứ hạng của nữ cao nhất trong lớp
console.log(isMax(isFemale(grades)));
