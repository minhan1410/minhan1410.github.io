console.log(age); //undefined
var age = 23;

//------------------------------------------------------------

console.log(name); //Cannot access 'age' before initialization
const name = "An";

//------------------------------------------------------------

const counter1 = makeCounter();
console.log(counter1()); //1

function makeCounter() {
    let counter = 0;
    return increase;
    function increase() {
        return ++counter;
    }
}

/* 
Lưu ý: Biến được khai báo với var & function declaration được khai báo trong code block sẽ được hoisted phần hàm trong chính block đó và hoisted tên hàm ra ngoài block.

Hoisting là đặc tính của ngôn ngữ luôn tồn tại khi bạn code rồi, học để hiểu về cách hoạt động của ngôn ngữ. Với function declaration thì nó giúp bạn có thể sử dụng được trước khi khai báo đó. Với var, let, const thì học để hiểu cách hoạt động, khi code thì ko ai đi dùng biến trước khi khai báo cả (gây khó đọc code - người đọc khó hiểu).
*/

// https://viblo.asia/p/hoisting-javascript-WAyK8RmmlxX
