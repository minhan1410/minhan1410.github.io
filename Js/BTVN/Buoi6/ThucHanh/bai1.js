/*
 Bấm vào nút cộng thì số cộng thêm 1
Bấm vào nút trừ thì số giảm đi 1
Khi số > 0 thì số có màu xanh
Khi số < 0 thì số có màu đỏ
Khi số = 0 thì có màu #333333 */

const btnPlus = document.querySelector(".nextBtn"),
    btnMinus = document.querySelector(".prevBtn"),
    counter = document.querySelector("#counter");
btnPlus.addEventListener("click", () => {
    counter.textContent = Number(counter.textContent) + 1;
    if (counter.textContent > 0) {
        counter.style.color = "green";
    } else if (counter.textContent < 0) {
        counter.style.color = "red";
    } else {
        counter.style.color = "#333333";
    }
});

btnMinus.addEventListener("click", () => {
    counter.textContent = Number(counter.textContent) - 1;
    if (counter.textContent > 0) {
        counter.style.color = "green";
    } else if (counter.textContent < 0) {
        counter.style.color = "red";
    } else {
        counter.style.color = "#333333";
    }
});
