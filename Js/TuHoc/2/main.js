// Sử dụng javascript để thực hiện những công việc sau

// 1. Thêm 3 thẻ < li > có nội dung Item 8, Item 9, Item 10 vào cuối danh sách
const ul = document.getElementById("list")
for (let index = 1; index <= 3; index++) {
    let li = document.createElement("li")
    li.innerText = `Item ${index + 7}`
    ul.appendChild(li)
}
// 2. Sửa nội dung cho thẻ < li > 1 thành màu đỏ(color)
ul.children[0].style.color = "red"

// 3. Sửa background cho thẻ < li > 3 thành màu xanh(background - color)
ul.children[2].style.backgroundColor = "green"

// 4. Remove thẻ < li > 4
ul.children[3].remove()

// 5. Thêm thẻ < li > mới thay thế cho thẻ < li > 4 bị xóa ở bước trước, thẻ < li > mới có nội dung bất kỳ
const li = document.createElement("li");
li.innerText = "New li 4";
ul.children[2].insertAdjacentElement("afterend", li);
// 6. Thêm 1 nút "add" + 1 ô input để nhập text.
// Mỗi khi bấm nút thêm 1 thẻ < li > có nội dung là nội dung trong ô input vào cuối danh sách
const input = document.createElement('input')
input.placeholder = "Nhap"

const button = document.createElement('button')
button.innerText = "Add"

document.body.appendChild(input)
document.body.appendChild(button)

button.addEventListener("click", ()=> {
        const li = document.createElement('li');
    li.innerText = input.value; ul.appendChild(li); input.value = ""
})

// 7. Thêm 1 nút "remove".Chức năng để xóa thẻ < li > cuối cùng của danh sách
const remove = document.createElement("button")
remove.innerText = "Remove"
document.body.appendChild(remove)

remove.addEventListener("click",()=>{
    let ulChild = ul.children;
    if(ulChild.length>0){
        ulChild[ulChild.length-1].remove();
    }
})

// 8. Thêm 1 nút "Hide" trên đầu của danh sách < ul >.Khi bấm vào "Hide" thì < ul > sẽ ẩn.Đồng thời label của nút "Hide" 
// => "Show"Và ngược lại Khi bấm vào "Show" thì < ul > sẽ hiện.Đồng thời label của nút "Show" => "Hide"
const hide = document.createElement("button")
hide.innerText = "Hide"
document.body.insertBefore(hide,ul)

hide.addEventListener("click",()=> {
    ul.classList.toggle("hide");
    if(ul.classList.contains("hide")){
        hide.innerText = "Show"
    }else{
        hide.innerText = "Hide"
    }
})
