"use strict"; // Chế độ nghiêm ngặt

var fullName = "An";

function a() {
    age = 21;
}

a();
console.log(fullName);
console.log(age);

/* 
Strict Mode - Chế độ nghiêm ngặt, hay hiểu đơn giản thì "use strict" là chế độ giúp các bạn viết code Javascript trở nên an toàn hơn. Khi sử dụng strict mode thì trong một số trường hợp các bạn sẽ tránh được những cách viết code được coi là chưa an toàn như:
- Quên sử dụng từ khóa khai báo biến
- Tránh đặt nhầm trùng tên các tham số
- Báo lỗi trong một số được hợp không được phép
- Không sử dụng được một số từ khóa dễ gây nhầm lẫn hoặc được coi là có thể được thêm vào ngôn ngữ trong tương lai 
*/

// https://viblo.asia/p/use-strict-la-gi-va-cach-su-dung-trong-javascript-3P0lPz2mKox