let number=0;

let todos = [
    {
        id: ++number,
        title: "Làm bài tập",
        status: true,
    },
    {
        id: ++number,
        title: "Xem phim",
        status: true,
    },
    {
        id: ++number,
        title: "Thể dục",
        status: false,
    },
    {
        id: ++number,
        title: "Tắm",
        status: false,
    },
    {
        id: ++number,
        title: "Học",
        status: true,
    },
];

const todo_list = document.querySelector(".todo-list");

function renderUI(arr) {
    todo_list.innerHTML = "";

    if (arr.length == 0) {
        todo_list.innerHTML =
            '<p class="todos-empty">Không có công việc nào trong danh sách</p>';
        return;
    }

    arr.forEach(
        (e) =>
            {
                todo_list.innerHTML += 
                `
                    <div class="todo-item ${e.status ? "active-todo" : ""}">
                        <div class="todo-item-title">
                            <input type="checkbox" ${e.status ? "checked" : ""} onclick="toggleStatus(${e.id})">
                            <p>${e.title}</p>
                        </div>
                        <div class="option">
                            <button class="btn btn-update" onclick="updateTodo(${e.id})">
                                <img src="https://buihien0109.github.io/HTML5-Games/DOM-project/todo/img/pencil.svg"
                                    alt="icon">
                            </button>
                            <button class="btn btn-delete" onclick="deleteTodo(${e.id})">
                                <img src="https://buihien0109.github.io/HTML5-Games/DOM-project/todo/img/remove.svg"
                                    alt="icon">
                            </button>
                        </div>
                    </div>
                `
            }
    );
}

renderUI(todos);

const btn_add = document.querySelector("#btn-add");
const todo_input = document.querySelector("#todo-input");

let isUpdate = false;
let indexUpdate;

btn_add.addEventListener("click", () => {
    let str = todo_input.value;
     if (str === "") {
         alert("Công việc không được để trống");
         return;
     }
     if (isUpdate) {
         todos[indexUpdate].title = str;
         isUpdate = false;
         btn_add.innerText = "Thêm";
     } else {
         todos.push({
             id: ++number,
             title: str,
             status: false,
         });
     }

     renderUI(todos);
     todo_input.value = "";
});

function toggleStatus(id) {
    todos.forEach((v, index) => {
        if (v.id === id) {
            v.status = !v.status;
        }
    });
    renderUI(todos);
    all.checked = true;
}

function deleteTodo(id) {
    todos.forEach((v, index) => {
        if (v.id === id) {
            todos.splice(index, 1);
        }
    });
    renderUI(todos);
}

function updateTodo(id) {
    btn_add.innerText = "Cập nhập";
    isUpdate = true;
    todos.forEach((v, index) => {
        if (v.id === id) {
            // https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/focus
            todo_input.value = v.title;
            todo_input.focus();
            indexUpdate = index;
        }
    });
}

const all = document.querySelector("#all")
all.addEventListener("click",()=>{
    renderUI(todos)
})

const unactive = document.querySelector("#unactive");
unactive.addEventListener("click", () => {
    renderUI(todos.filter((e) => e.status == false));
})

const active = document.querySelector("#active");
active.addEventListener("click", () => {
    renderUI(todos.filter((e) => e.status == true));
})