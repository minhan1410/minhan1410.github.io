// https://codelearn.io/sharing/bind-call-va-apply-trong-javascript

const $ = document.querySelector.bind(document);
const $$ = document.querySelectorAll.bind(document);

let tabItem = $$(".tab-item");
let tabPane = $$(".tab-pane");

tabItem.forEach(
    (item) =>
        (item.onclick = () => {
            $(".tab-item.active").classList.remove("active");
            $(".tab-pane.active")?.classList.remove("active");

            item.classList.add("active");
            console.log(item);

            let index = Array.from(tabItem).indexOf(item);

            tabPane[index].classList.add("active");
        })
);
