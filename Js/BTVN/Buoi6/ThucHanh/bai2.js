let arr = [
    {
        name: "name 1",
        text: "text 1",
        color: "red",
    },
    {
        name: "name 2",
        text: "text 2",
        color: "blue",
    },
    {
        name: "name 3",
        text: "text 3",
        color: "gray",
    },
    {
        name: "name 4",
        text: "text 4",
        color: "green",
    },
    {
        name: "name 5",
        text: "text 5",
        color: "pink",
    },
];

const imgAll = document.querySelectorAll("img");
const authorsAll = document.querySelectorAll(".author");

for (let i = 0; i < imgAll.length; i++) {
    imgAll[i].addEventListener("click", function () {
        const text = document.querySelector(".text");
        const name = document.querySelector(".name");
        const testimonialsContainer = document.querySelector(
            ".testimonials-container"
        );

        text.innerHTML = arr[i].text;
        name.innerHTML = arr[i].name;
        testimonialsContainer.style.backgroundColor = arr[i].color;
        authorsAll[i].classList.add("selected");

        Array.from(authorsAll).map((author) => {
            if (author != authorsAll[i]) {
                author.classList.remove("selected");
            }
        });
        console.log("🚀 ~ authorsAll[i]", authorsAll[i]);
    });
}
