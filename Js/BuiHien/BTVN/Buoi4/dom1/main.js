const p = document.createElement("p");
p.id = "text";
p.style.color = "#777";
p.style.fontSize = "2rem";
p.innerHTML =
    "Tôi có thể làm <em> bất cứ điều gì </em> tôi muốn với JavaScript.";

document.body.appendChild(p);

const ul = document.createElement("ul");
ul.innerHTML = "<li>Item 1</li> <li>Item 2</li> <li>Item 3</li>";
document.body.appendChild(ul);

for (let li of ul.children) {
    li.style.color = "blue";
}

const list = document.getElementById("list");
for (let index = 7; index <= 10; index++) {
    const li = document.createElement("li");
    li.innerHTML = `Item ${index}`;
    list.appendChild(li);
}

const li1 = document.querySelector("#list li");
li1.style.color = "red";
const li3 = document.querySelector("#list li:nth-child(3)");
li3.style.backgroundColor = "blue";
list.removeChild(document.querySelector("#list li:nth-child(4)"));

const li4New = document.createElement("li");
li4New.innerText = "Item 4 new";
li3.insertAdjacentElement("afterend", li4New);
