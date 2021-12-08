document.write("<h1>Câu lệnh rẽ nhánh</h1>");
function bai1_1(mark) {
    if (mark >= 0 && mark <= 100) {
        if (mark >= 85) {
            return "A";
        } else if (mark >= 70 && mark < 85) {
            return "B";
        } else if (mark >= 40 && mark < 70) {
            return "C";
        } else {
            return "D";
        }
    } else {
        return "Đi chỗ khác chơi";
    }
}

alert(
    "Bài 1: Viết function với tham số đầu vào là mark có giá trị từ 0 -> 100. Kiểm tra giá trị của biến mark và in ra nội dung sau"
);
let mark = parseInt(prompt("Nhập mark: "));
document.write(`<h3>Bài 1(${mark}): ${bai1_1(mark)}</h3>`);

function bai1_2(day) {
    if (day >= 0 && day <= 6) {
        switch (day) {
            case 0:
                return "Chủ nhật";
            default:
                return `Thứ ${day + 1}`;
        }
    } else {
        return "Đi chỗ khác chơi";
    }
}

alert(
    "Bài 2: Viết function có tham số đầu vào là day có giá trị từ 0 -> 6. In ra các ngày trong tuần tương ứng với giá trị day."
);
let day = parseInt(prompt("Nhập day: "));
document.write(`<h3>Bài 2(${day}): ${bai1_2(day)}</h3>`);

function bai1_3(min, max) {
    if (isNaN(min) || isNaN(max)) return "Đi chỗ khác chơi";
    return `Random(${min},${max}): ${Math.round(
        Math.random() * (max - min) + min
    )}`;
}

alert(
    "Bài 3: Viết function với 2 tham số là min và max. Trả về kết quả là 1 số nguyên được random nằm trong khoảng từ min -> max"
);
let min = parseInt(prompt("Nhập min: "));
let max = parseInt(prompt("Nhập max: "));
document.write(`<h3>Bài 3: ${bai1_3(min, max)}</h3>`);

document.write("<h1>Vòng lặp</h1>");

let bai2_1 = function () {
    let sum = 1;
    for (let i = 2; i <= 100; i++) {
        sum += i;
    }
    return sum;
};

document.write(
    `<h3>Bài 1: Viết function tính tổng các số lẻ từ 1 -> 100: ${bai2_1.apply()}</h3>`
);

let bai2_2 = function () {
    let sum = 0;
    for (let i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            sum++;
        }
    }
    return sum;
};

document.write(
    `<h3>Bài 2: Viết function tính tổng các số chia hết cho 3 và 5 trong khoảng từ 0 -> 100: ${bai2_2.apply()}</h3>`
);
