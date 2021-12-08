const points = document.querySelector(".points");
let colors = ["#3498db", "#9b59b6", "#e74c3c", "#2c3e50", "#d35400"];
const boxes = document.querySelector(".boxes");

function addBox() {
    for (let i = 1; i <= 5; i++) {
        const box = document.createElement("div");
        box.className = "box";
        box.style.backgroundColor = colors[i - 1];
        boxes.appendChild(box);
        points.innerText++;
    }
}

addBox();

boxes.addEventListener("click", (event) => {
    event.target.remove();
    points.innerText--;
});

btn.addEventListener("click", () => addBox());
// https://developer.mozilla.org/en-US/docs/Web/API/Event
