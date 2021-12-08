// DOMContentLoaded: Sự kiện DOMContentLoaded kích hoạt khi tài liệu HTML ban đầu đã được tải và phân tích cú pháp hoàn toàn mà không cần đợi những file như stylesheets, images và subframes cho đến khi hoàn tất tải file đó.
document.addEventListener("DOMContentLoaded", () => {
    const body = document.querySelector("body"),
        dark_mode_btn = document.querySelector(".dark_mode_btn"),
        history = document.querySelector("#history"),
        result = document.querySelector("#result"),
        clear = document.querySelector("#clear"),
        delete_single_num = document.querySelector("#delete_single_num"),
        equalTo = document.querySelector("#equalTo");

    const Normal_btn = document.querySelectorAll("#Normal_btn");
    Normal_btn.forEach((button) => {
        button.addEventListener("click", () => {
            result.innerText += button.innerText;
        });
    });

    equalTo.addEventListener("click", () => {
        if (result.innerText !== "") {
            console.log(
                "🚀 result.innerText",
                result.innerText,
                " = ",
                eval(result.innerText)
            );
            history.innerText = result.innerText;
            result.innerText = eval(result.innerText);
        } else {
            alert("Chưa nhập số") ;
        }
    });

    clear.addEventListener("click",()=>{
        result.innerText ="";
    })

    delete_single_num.addEventListener("click",()=>{
        let str = result.innerText
        result.innerText = str.substring(0,str.length-1);
    })

    dark_mode_btn.addEventListener("click", function () {
        body.classList.toggle("dark_mode_active");
        dark_mode_btn.innerHTML = body.classList.contains("dark_mode_active")
            ? '<i class="fa fa-sun-o" aria-hidden="true"></i>'
            : '<i class="fa fa-moon-o" aria-hidden="true"></i>';
    });
});
