var msg = new SpeechSynthesisUtterance();
msg.lang = "vi-VN"
const number = document.querySelector("#counter");
console.log("🚀 ~ file: main.js ~ line 4 ~ number", number)
msg.text = number.innerText;
speechSynthesis.speak(msg); 


const prev = document.querySelector(".prevBtn");
prev.addEventListener("click", ()=> {
    number.innerText--;
    msg.text = number.innerText;
    speechSynthesis.speak(msg); 

    if(number.innerText<0){
        number.style.color = "red"
    }
    if (number.innerText == 0) {
        number.style.color = "#333333";
    }
})

const next = document.querySelector(".nextBtn");
next.addEventListener("click", () => {
    number.innerText++;
    msg.text = number.innerText;
    speechSynthesis.speak(msg); 

    if (number.innerText > 0) {
        number.style.color = "blue";
    }
    if (number.innerText == 0) {
        number.style.color = "#333333";
    }
});

