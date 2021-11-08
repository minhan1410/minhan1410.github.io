function KhoiTao(colors) {
    const boxes = document.querySelector(".boxes");
    const points = document.querySelector(".points");

    for (let i = 0; i < colors.length; i++) {
        let div = document.createElement("div");
        div.className = "box";
        div.style.backgroundColor = colors[i];
        boxes.appendChild(div);

        div.addEventListener("click", () => {
            div.classList.remove("box");
            points.innerHTML = document.querySelectorAll(".box").length;
        });
    }

    points.innerHTML = document.querySelectorAll(".box").length;
    console.log("🚀 ~ box", document.querySelectorAll(".box"));
}

let colors = ["#3498db", "#9b59b6", "#e74c3c", "#2c3e50", "#d35400"];
KhoiTao(colors);

const more = document.querySelector("#btn");
more.addEventListener("click", () => {
    KhoiTao(colors);
});
