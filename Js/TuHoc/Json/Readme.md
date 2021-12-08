# **JSON là gì?**

JSON là viết tắt của JavaScript Object Notation, `là một kiểu định dạng dữ liệu(chuỗi)` tuân theo một quy luật nhất định mà hầu hết các ngôn ngữ lập trình hiện nay đều có thể đọc được. JSON là một tiêu chuẩn mở để trao đổi dữ liệu trên web.

![alt](https://topdev.vn/blog/wp-content/uploads/2019/04/json-vs-xml.png)

# **Định nghĩa**

Định dạng JSON sử dụng các cặp `key` – `value` để dữ liệu sử dụng. Nó hỗ trợ các cấu trúc dữ liệu như đối tượng và mảng. Ví dụ một tập tin có tên `topdev_info.json` với nội dung như ở dưới đây sử dụng format kiểu JSON để lưu trữ thông tin:

```json
{
    "name": "TopDev",
    "title": "Việc làm IT cho Top Developers",
    "description": "là hệ sinh thái bao gồm cộng đồng các Top Developers."
}
```

Ta có thể thấy cú pháp của JSON có 2 phần đó là `key` và `value`:

-   Chuỗi JSON được bao lại bởi dấu ngoặc nhọn {}
-   Các `key`, `value`của JSON bắt buộc phải đặt trong dấu nháy kép {“}, nếu bạn đặt nó trong dấu nháy đơn thì đây không phải là một chuỗi JSON đúng chuẩn. Nếu trường hợp trong `value` của bạn có chứa dấu nháy kép " thì hãy dùng dấu (\) để đặt trước nó, ví dụ \"json là gì\".
-   Nếu có nhiều dữ liệu thì dùng dấu phẩy , để ngăn cách.
-   Các `key` của JSON bạn nên đặt chữ cái không dấu hoặc số, dấu \_ và không có khoảng trắng., ký tự đầu tiên không nên đặt là số.

File json có thể được lưu với bất kỳ phần mở rộng nào, tuy nhiên thông thường thì nó được lưu dưới phần mở rộng là `.json hoặc .js`.

`JSON ban đầu được phát triển để dành phục vụ cho ứng dụng viết bằng JavaScript. Tuy nhiên vì JSON là một định dạng dữ liệu nên nó có thể được sử dụng bởi bất cứ ngôn ngữ nào mà không bị giới hạn.`

`Giá trị key trong JSON có thể là chuỗi (string), số (numner), rỗng (null), mảng (array), hoặc đối tượng (object).`

# **Cấu trúc chuỗi JSON**

## **Object là gì?**

Object trong Json được thể hiện bằng dấu ngoặc nhọn {}. Khái niệm Object trong Json cũng khá tương đồng với Object trong Javascript. Tuy nhiên, Object trong Json vẫn có những giới hạn như:

-   `key`: phải luôn nằm trong dấu ngoặc kép, không được phép là biến số.
-   `value`: Chỉ cho phép các kiểu dữ liệu cơ bản: numbers, String, Booleans, arrays, objects, null. Không cho phép function, date, undefined.
-   Không cho phép dấy phẩy cuối cùng như Object trong Javascript.

## **Kiểu OBJECT**

```js
var nhat = {
    firstName: "Nhat",
    lastName: "Nguyen",
    age: "34",
};
```

## **Kiểu OBJECT IN ARRAY**

```js
var employees = [
    {
        name: "Binh",
        age: "38",
        gender: "male",
    },
    {
        name: "Nhat",
        age: "34",
        gender: "male",
    },
    {
        name: "Nhu",
        age: "25",
        gender: "female",
    },
];
```

## **Kiểu NEST OBJECT**

```js
var employees = {
    hieu: {
        name: "Hieu",
        age: "29",
        gender: "male",
    },

    nhat: {
        name: "Nhat",
        age: "34",
        gender: "male",
    },

    nhu: {
        name: "Nhu",
        age: "25",
        gender: "female",
    },
};
```

# **Nên sử dụng JSON khi nào**

Đó là khi bạn muốn lưu trữ dữ liệu đơn thuần dưới dạng metadata ở phía server. Chuỗi JSON sẽ được lưu vào database và sau đó khi cần dữ liệu thì sẽ được giải mã. Ví dụ với PHP, nó cung cấp các hàm liên quan đến JSON để mã hóa hoặc giải mã là `json_encode và json_decode`.

Một trường hợp khá phổ biến trong JavaScript mà dữ liệu được định dạng theo format JSON xuất hiện đó là trong các AJAX request.

Ví dụ bạn tạo tập tin `topdev_info.json` ở thư mục gốc của server (để khi request vào URL `http://localhost/topdev_info.json` thì server trả về nội dung của tập tin này) và sau đó bạn tạo một tập tin `topdev_ajax.html` với nội dung như sau:

```html
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.2/jquery.min.js"></script>
    </head>
    <body>
        <script type="text/javascript">
            $.ajax(
                type: 'GET',
                url: "http://localhost/topdev_info.json",
                success: function(response) {
                    console.log("Data type: " + (typeof response));
                    console.log("Application name: " + response.name);
                },
            );
        </script>
    </body>
</html>
```

Đoạn code trên sử dụng `$.ajax()` để gửi AJAX request lên server lấy về nội dung file `topdev_info.json`. Sau khi lấy về nội dung tập tin này thành công, dữ liệu sẽ được chuyển vào biến `response`.

Nếu bạn mở developer console của trình duyệt lên (nhấn phím F12) bạn sẽ thấy kiểu dữ liệu của biến `response` này được JavaScript `object` với các thuộc tính như `name`, `title`, `decription`.

[**Hiểu rõ về JSON là gì?**](https://topdev.vn/blog/json-la-gi/#json-la-gi)

# **`JSON.stringify()` : chuyển từ JavaScript sang JSON**

```js
a = 1;
console.log(JSON.stringify(a), " - ", typeof JSON.stringify(a)); // chuyển từ JavaScript sang Json

a = null;
console.log(JSON.stringify(a), " - ", typeof JSON.stringify(a)); // chuyển từ JavaScript sang Json

a = true;
console.log(JSON.stringify(a), " - ", typeof JSON.stringify(a)); // chuyển từ JavaScript sang Json

a = "abc";
console.log(JSON.stringify(a), " - ", typeof JSON.stringify(a)); // chuyển từ JavaScript sang Json

a = [1, 2, 3];
console.log(JSON.stringify(a), " - ", typeof JSON.stringify(a)); // chuyển từ JavaScript sang Json

a = { name: "abc", age: 20 };
console.log(JSON.stringify(a), " - ", typeof JSON.stringify(a)); // chuyển từ JavaScript sang Json
```

# **`JSON.parse()` : chuyển từ JSON sang JavaScript**

```js
var a = "1";
console.log(JSON.parse(a), " - ", typeof JSON.parse(a)); // chuyển từ Json sang JavaScript

a = "null";
console.log(JSON.parse(a), " - ", typeof JSON.parse(a)); // chuyển từ Json sang JavaScript

a = "true";
console.log(JSON.parse(a), " - ", typeof JSON.parse(a)); // chuyển từ Json sang JavaScript

a = '"abc"';
console.log(JSON.parse(a), " - ", typeof JSON.parse(a)); // chuyển từ Json sang JavaScript

a = "[1,2,3]";
console.log(JSON.parse(a), " - ", typeof JSON.parse(a)); // chuyển từ Json sang JavaScript

a = '{"name":"abc","age":20}';
console.log(JSON.parse(a), " - ", typeof JSON.parse(a)); // chuyển từ Json sang JavaScript
```

# **`Sync` (Đồng bộ) vs `Async` (Bất đồng bộ)**

Trong bài có sử dụng từ viết tắt: `Sync => Synchronous` và `Async => Asynchronous `

## **Synchronous là gì?**

Synchronous có nghĩa là `xử lý đồng bộ`, chương trình sẽ chạy theo từng bước và chỉ khi nào bước 1 thực hiện xong thì mới nhảy sang bước 2, khi nào chương trình này chạy xong mới nhảy qua chương trình khác. Đây là nguyên tắc cơ bản trong lập trình mà bạn đã được học đó là khi biên dịch các đoạn mã thì trình biên dịch sẽ biên dịch theo thứ tự từ trên xuống dưới, từ trái qua phải và chỉ khi nào biên dịch xong dòng thứ nhât mới nhảy sang dòng thứ hai, điều này sẽ sinh ra một trạng thái ta hay gọi là trạng thái chờ.

### **Mặt tốt của Synchronous**

Chương trình sẽ chạy theo đúng thứ tự và có nguyên tắc nên sẽ không mắc phải các lỗi về tiến trình không cần thiết.

### **Mặt xấu của Synchronous**

Chương trình chạy theo thứ tự đồng bộ nên sẽ sinh ra trạng thái chờ và là không cần thiết trong một số trường hợp, lúc này bộ nhớ sẽ dễ bị tràn vì phải lưu trữ các trạng thái chờ vô duyên đó.

Khi bạn viết một chương trình quản lý và trong đó có thao tác lưu, mỗi khi lưu bạn yêu cầu người dùng có muốn lưu hay không? Nếu muốn lưu thì click Yes, ngược lại click No. Trường hợp nay gây tai họa nếu người dùng vô tình chỉ click Lưu mà không chú ý đến câu hỏi mà hệ thống đưa ra nên ngồi nhâm nhi cafe, đột nhiên cúp điện thế là cứ tưởng đã lưu rồi 😃 Vậy quy trình xử lý nên đưa ra chức năng lưu tự động, nghĩa là thao tác lưu sẽ bỏ qua bước hỏi đáp kia đi, không nhất thiết phải chờ nó OK mới lưu.

## **Asynchronous là gì?**

Ngược lại với Synchronous thì Asynchronous là `xử lý bất động bộ`, nghĩa là chương trình có thể nhảy đi bỏ qua một bước nào đó, vì vậy Asynchronous được ví như một chương trình hoạt động không chặt chẽ và không có quy trình nên việc quản lý rất khó khăn. Nếu một hàm A phải bắt buộc chạy trước hàm B thì với Asynchronous sẽ không thể đảm bảo nguyên tắc này luôn đúng.

### **Mặt tốt của Asynchronous**

Có thể xử lý nhiều công việc một lúc mà không cần phải chờ đợi nên tạo cảm giác thoải mái cho người dùng.

### **Mặt xấu của Asynchronous**

Nếu một chương trình đòi hỏi phải có quy trình thì bạn không thể sử dụng Asynchronous được. Còn về chương trình trong lập trình thì sao? Một thao tác thêm dữ liệu phải thông qua hai công đoạn là validate dữ liệu và thêm dữ liệu, nếu thao tác validate xảy ra sau thao tác thêm thì còn gì tệ hại hơn nữa

## Ajax Asynchronous

Theo khái niệm của Ajax là gì thì `Ajax được viết tắt của các từ Asynchronous JavaScript` and XML, rõ ràng từ Asynchronous đã nói lên Ajax là một kỹ thuật xử lý bất đồng bộ. Nhiều bạn lập trình viên khi viết ứng dụng Ajax mà quên mất rằng đây là một chương trình bất đồng bộ, tức là thao tác gửi Ajax và các đoạn code bên dưới sẽ được chạy song song.

```js
// ĐOẠN 1
var message = 'Xin chào tấc cả các bạn!';

// ĐOẠN 2
$.ajax({
    url : "some-url",
    data : {}
    success : function(result){
        message = 'Giá trị đã được thay đổi';
    }
});

// ĐOẠN 3
alert(message); // Kết quả là 'Xin chào tấc cả các bạn!'
```

`Như vậy trong ĐOẠN 3 đã không nhận được giá trị của ĐOẠN 2, lý do tại sao?`

Theo quy trình xử lý thì chương trình hoạt động từ trên xuông dưới và từ trái qua phải (điều đương nhiên), nhưng do Ajax phải mất một khoảng thời gian rất lớn (so với tốc độ của trình biên dịch) để request đến URL nên nếu đưa nó vào xử lý đồng bộ thì quả thật trình duyệt phải mất một khoảng thời gian chờ, vì vậy nó sẽ tiếp tục chạy xuống phía dưới mặc kệ đoạn ajax khi nào xong thì xong => dẫn đến giá trị message không thay đổi.

### **setTimeout Async**

Nhưng nếu bạn tạm ngưng trong vòng 10 giây chẳng hạn (ta coi như 10 giây đủ để request thực hiện xong) thì biến message sẽ nhận được giá trị mới.

```js
// ĐOẠN 1
var message = 'Xin chào tấc cả các bạn!';

// ĐOẠN 2
$.ajax({
    url : "some-url",
    data : {}
    success : function(result){
        message = 'Giá trị đã được thay đổi';
    }
});

// ĐOẠN 3
setTimeout(function(){
    alert(message);
}, 10000);

//// Giá trị đã được thay đổi
```

`Tại sao lại như vậy? `

Bản chất **setTimeout** cũng là một Async đấy các bạn,` nghĩa là các đoạn code bên dưới sẽ hoạt động trước nội dung bên trong setTimeout()`.

```js
setTimeout(function () {
    alert("1");
}, 0);

alert("2");
// Kết quả sẽ xuất hiện 2 -> 1 chứ không phải là 1 - 2 như bạn đang nghĩ đâu 😃
```

[**Synchronous và Asynchronous trong JavaScript**](https://viblo.asia/p/synchronous-va-asynchronous-trong-javascript-WAyK8LqnKxX)
