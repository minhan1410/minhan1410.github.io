const data = [
    {
        title: "Chỉ số BMI dưới 18,5 là thiếu cân",
        content: "Bạn cần áp dụng chế độ ăn và thể thao để tăng cân.",
        image: "https://media.tamdiem247.com/media/image/s/tdtp/id/610caea50df9386c464622ea_640x",
    },
    {
        title: "Chỉ số BMI từ 18,5 đến 24,9 là bình thường",
        content: "Bạn có một cơ thể tốt.",
        image: "https://tiemgamenet.ewr1.vultrobjects.com/2021/03/xem-bo-anh-khoe-dang-nuot-cua-hot-girl-vo-ngoc-tran-nguoi-xem-muon-thoat-vi-dia-dem-1.jpg",
    },
    {
        title: "Chỉ số BMI ở giữa 25,0 và 29,9 được coi là thừa cân",
        content:
            "Tuy nhiên, tình trạng chưa quá trầm trọng nên bạn có thể tìm ngay các phương pháp giảm cân hiệu quả tự nhiên và kết hợp luyện tập. Nếu áp dụng điều độ và kiên trì, chỉ cần tốn khoảng vài tháng là bạn có ngay vóc dáng rất ưng ý rồi đó.",
        image: "https://afamilycdn.com/150157425591193600/2021/8/27/2770b8a2da020db3b50dd5db243dfedd-1630065534130672701551.jpg",
    },
    {
        title: "Chỉ số BMI bằng hoặc trên 30 được xem là béo phì",
        content:
            "Với mức cân nặng này, cơ thể của bạn phải gặp rất nhiều áp lực hàng ngày, đặc biệt trọng lượng mỡ tạo áp lực lên cơ xương và các cơ quan làm ảnh hưởng đến sinh hoạt và sức khỏe của bạn.",
        image: "https://danviet.mediacdn.vn/upload/3-2019/images/2019-09-26/Ly-do-Tru-Bat-Gioi-sau-khi-danh-chet-Ngoc-Dien-Ho-Ly-lai-phai-lot-quan-ao-ra-xem-788-1569510208-width583height358.jpg",
    },
];

const input_height = document.querySelector("#height");
const input_weight = document.querySelector("#weight");
const btn_submit = document.querySelector("#btn-submit");
const inputs = document.querySelectorAll(".input");

let height, weight;
let isValid;

function setErrorFor(input, message) {
    const parent = input.parentElement;
    parent.classList.add("error");
    const small = parent.querySelector("small");
    small.innerText = message;
}

function setSuccessFor(input) {
    const parent = input.parentElement;
    parent.classList.add("success");
}

function checkInput() {
    height = input_height.value.trim();
    weight = input_weight.value.trim();

    isValid = true;

    if (height == "") {
        isValid = false;
        setErrorFor(input_height, "Chiều cao không được để trống.");
    } else if (isNaN(height)) {
        isValid = false;
        setErrorFor(input_height, "Chiều cao không phải là số.");
    } else {
        setSuccessFor(input_height);
    }

    if (weight == "") {
        isValid = false;
        setErrorFor(input_weight, "Cân nặng không được để trống.");
    } else if (isNaN(weight)) {
        isValid = false;
        setErrorFor(input_weight, "Cân nặng không phải là số.");
    } else {
        setSuccessFor(input_weight);
    }
    return isValid;
}

btn_submit.addEventListener("click", () => {
    Array.from(inputs).map((e) => e.classList.remove("error"));
    Array.from(inputs).map((e) => e.classList.remove("success"));

    if (checkInput()) {
        let bmi = (weight / (height / 100) ** 2).toFixed(2);

        document.querySelector(".say-hello").classList.add("hide");
        document.querySelector(".result-container").classList.remove("hide");
        document.querySelector(
            ".result-num"
        ).innerText = `Chỉ số BMI của bạn : ${bmi}`;


        if (bmi < 18.5) {
            renderUI(data[0]);
        } else if ((bmi >= 18, 5 && bmi <= 24.9)) {
            renderUI(data[1]);
        } else if (bmi >= 25 && bmi <= 29.9) {
            renderUI(data[2]);
        } else {
            renderUI(data[3]);
        }
    }
});

function renderUI(data) {
    console.log(data);
    document.querySelector(".image-box").style.backgroundImage = `url(${data.image})`;
    document.querySelector(".result-title").innerText = `👉 ${data.title}`;
    document.querySelector(".result-content").innerText = `👉 ${data.content}`;
}
