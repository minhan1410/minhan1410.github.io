const ul = document.createElement('ul');
document.body.appendChild(ul);

const input = document.querySelector("input");
const add = document.querySelector("#add");
const remove = document.querySelector("#remove");
const hide = document.querySelector("#hide");

add.addEventListener("click",()=>{
    const li = document.createElement('li');
    li.textContent = input.value;
    ul.appendChild(li);
})

remove.addEventListener("click",()=>{
    ul.removeChild(ul.lastElementChild);
})

hide.addEventListener("click",()=>{
    if(hide.innerHTML === "Hide"){
        ul.style.display = "none";
        hide.innerHTML = "Show";
    }else{
        ul.style.display = "block";
        hide.innerHTML = "Hide";
    }
})