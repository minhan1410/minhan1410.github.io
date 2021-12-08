/*
Các chức năng có trong ứng dụng todolist

1. Lấy danh sách cv hiện có
2. Thêm cv
3. Sửa cv
4. Xóa cv
5. Lọc cv theo trạng thái
6. Thay đổi trạng thái
*/

// Khai báo biến
let todos = [];

// ============== API ===============
// API lấy danh sách todo
function getTodosAPI() {
    return axios.get("/todos"); // => luôn trả về promise
}

const todoList = document.querySelector(".todo-list");

function renderUI(array){

}

// ============= Hàm xử lý =============
// Lấy danh sách todo
async function getTodos() {
    try {
        const res = await getTodosAPI();
        todos = res.data;

        // Render ra ngoài giao diện
        renderUI(todos);
    } catch (error) {
        console.log(error);
    }
}

window.onload = () => {
    getTodos();
};