# **Tìm hiểu cơ bản về ES6**

## ECMAScript ES6 là gì?

`ES6 là chữ viết tắt của ECMAScript 6`, là phiên bản mới nhất của chuẩn ECMAScript.

ES6 ra đời vào năm 2015 nên cái tên ES2015 được lấy làm tên chính thức với nhiều tính năng mới học hỏi các ngôn ngữ cấp cao khác, `hy vọng dần theo thời gian Javascript trở thành một ngôn ngữ lập trình hướng đối tượng`.

## Các chức năng mới của ES6

-   **Arrow function**: Bạn có thể tạo hàm bằng cách sử dụng dấu mũi tên =>.

-   **Block Scoped**: Định nghĩa biến với từ khóa let, cách định nghĩa này thì biến chỉ tồn tại trong phạm vi khối của nó (Block Scope)

-   **Destructuring Assignments**: Bạn có thể khởi tạo các biến từ một mảng bằng một dòng code đơn giản.

-   **Default Parameters**: Bạn có thể gán giá trị mặc định cho các tham số.

-   **Rest Parameters**: Bạn có thể khai báo một hàm với số lượng tham số không xác định.

-   **Template String**: Tạo templaet HTML cực kì đơn giản.

-   **Tagged Template Literals**: Kiểm soát nhiều hơn đối với thao tác và trả về chuỗi động.

-   **Weak, Set**: Các kiểu dữ liệu phức tạp mới.

-   **Module**: Một tập hợp, một gói, một packet, chứa data.

-   **Optional chaining(?.)**: Giúp giảm thiểu lỗi khi giá trị của object hoặc function không tồn tại.

### **Arrow function**

`Arrow là một dạng viết tắt của các function sử dụng dấu =>, tương tự như trong C#, Java 8,…`

Cú pháp căn bản nhất của arrow function như sau:

```js
var functionName = (var1, var2) => {
    // Nội dung function
};
```

ví dụ

```js
var hello = () => {
    console.log("Hello Bạn");
};
hello();
```

### **Block Scoped**

`Block Scoped là phạm vi trong một khối, nghĩa là chỉ hoạt động trong phạm vi được khai báo bời cặp {}.Ở Es6 người ta sử dụng biến let để khai báo cho biến trong cặp {}`

xét ví dụ sau:

```js
for (let i = 0; i < 5; i++) {
    setTimeout(function () {
        console.log("hello ", i);
    }, 1000);
}
```

Kết quả trả về sẽ là:

```
hello 1

hello 2

hello 3

hello 4

hello 5
```

**Vậy biến `let` so với `var` có gì khác biệt ?**

-   `let` tạo ra một biến **chỉ có thể truy cập được trong block bao quanh nó**.

-   `var` tạo ra một biến **có phạm vi truy cập xuyên suốt function chứa nó**.

Cũng cùng ví dụ về biến let ở trên nay ta sử dụng biến var:

```js
for (var i = 0; i < 5; i++) {
    setTimeout(function () {
        console.log("hello ", i);
    }, 1000);
}
```

Nhưng ở biến var kết quả trả về sẽ là :

```
hello 5

hello 5

hello 5

hello 5

hello 5
```

**Biến const : `dùng để khai báo một hằng số` là một giá trị không thay đổi được trong suốt quá trình chạy.**

Ví dụ:

```js
const A = 5;
A = 6; // sẽ xảy ra lỗi
```

**Chú ý:**

-   Trong ES6 hạn chế dùng biến var thay vào đó là ta dùng biến let

-   Nếu bạn sử dụng Jquery trong Es6 thì $(this) trong ES6 sẽ được hiểu là (window)

-   Để sửa chữa khi bạn sử dụng $(this) sẽ thay bằng $(e.currentTarget)

### **Destructuring Assignments**

Tính năng này khá giống với hàm list trong PHP nhé!

Nghĩa là nó sẽ phân các giá trị trong mảng vào các biến theo thứ tự hay nói cách khác nó sẽ `Tách các phần tử của Array hoặc Object thành nhiều biến chỉ bằng một đoạn code duy nhất.`

Một ví dụ hàm list trong PHP:

```php
$arr = array("1","2");

// Gán phần tử trong mảng vào 2 biến $a, $b
list($a,$b) = $arr;

echo "a= ",$a,", b= ",$b;
```

```
a= 1, b= 2
```

ES6:

```js
let fullName = ["Nguyễn", "Minh", "An"];

let [surname, middleName, name] = fullName;

console.log(surname + " " + middleName + " " + name);
```

```
Nguyễn Minh An
```

```js
let birthday = { day: 14, month: 10, year: 2001 };

let { day: d, month: m, year: y } = birthday;

console.log(d + " / " + m + " / " + y);
```

```
14 / 10 / 2001
```

**`Nếu bạn muốn lấy một phần tử thôi thì hãy bỏ trống các phần tử không muốn lấy`**

```js
let fullName = ["Nguyễn", "Minh", "An"];

let [, , name] = fullName;

console.log("name: " + name);
```

```
name: An
```

```js
let birthday = { day: 14, month: 10, year: 2001 };

let { month: m } = birthday;

console.log("month: " + m);
```

```
month: 10
```

### **Default Parameters**

**`Default Parameter` là giá trị mặc định của tham số khi truyền vào các function.**

Đối với Javascript thì có nhiều bạn chưa biết chức năng này mặc dù trong ES5 đã cung cấp săn cho chúng ta, tuy nhiên người ta cảm thấy cách tạo giá trị mặc định trong ES5 vẫn không hay nên họ đã bổ sung một cách khác mới hơn và đơn giản hơn rất nhiều trong ES6.

**ES5:**

```js
function sayHi(mess) {
    return mess || "Hi An 😘😘";
}

console.log("Không truyền tham số: " + sayHi());
console.log("Truyền tham số: " + sayHi("Em iuu anh An😍😍"));
```

```
Không truyền tham số: Hi An 😘😘
Truyền tham số: Em iuu anh An😍😍
```

**ES6:**

```js
function sayHi(mess = "Hi An 😘😘") {
    return mess;
}

console.log("Không truyền tham số: " + sayHi());
console.log("Truyền tham số: " + sayHi("Em iuu anh An😍😍"));
```

```
Không truyền tham số: Hi An 😘😘
Truyền tham số: Em iuu anh An😍😍
```

### **Rest Parameters**

**Rest Parameters** dịch theo tiếng Anh chuyên ngành công nghệ thông tin có nghĩa là tham số còn lại

`Điều này có nghĩa là bạn có thể khai báo một hàm với số lượng tham số không xác định`, đây là một tính năng mới khiến Javascript ngày càng trở nên mạnh mẽ hơn.

Để khai báo các tham số còn lại của một function thì bạn đặt 3 dấu chấm `.` trước biến đại diện.

```js
function friendGirl(name, ...girls) {
    return name + " có " + girls.length + " ny: " + girls;
}

console.log(friendGirl("An", "Ngọc", " Nga", " Hương", " Quỳnh", " Hà"));
```

```
An có 5 ny: Ngọc, Nga, Hương, Quỳnh, Hà
```

### **Template String**

**ES6 `Template String tạm gọi là một cú pháp`, cho phép bạn viết biểu thức ngay bên trong string.**

Trong đó, thay vì sử dụng cặp dấu nháy đơn `''` hay nháy kép `""`, bạn sử dụng cặp dấu backtick hay backqoute, để biểu diễn string.

Ví dụ biểu diễn string sử dụng dấu backtick:

```js
`string`;
```

**Vd: Thay vì sử dụng toán tử `+` ta dùng template string**

```js
let fullName = ["Nguyễn", "Minh", "An"];

let [surname, middleName, name] = fullName;

console.log(`${surname} ${middleName} ${name}`);
```

```
Nguyễn Minh An
```

### **Tagged Template Literals**

Tính năng nâng cao của Template Literals là sử dụng Tagged Template Literals, đôi khi được gọi là templae tags (thẻ mẫu).

Template tags bắt đầu bằng chức năng phân tích cú pháp template, cho phép bạn kiểm soát nhiều hơn đối với thao tác và trả về chuỗi động.

Vd:

```js
function highlight([a1, ...arrs], ...values) {
    return values
        .reduce((a, b) => [...a, `<span>${b}</span>`, arrs.shift()], [a1])
        .join("");
}

var a = "ES6";
var b = "JavaScript";
const html = highlight`Tìm hiểu cơ bản về ${a} trong ${b} 😄😄`;
console.log(html);
```

```js
let highLight = ([a, ...a1], ...b) => {
    console.log("a = ", a);
    console.log("a1 = ", a1);
    console.log("b= ", b);

    return b.reduce((c, d) => `${c}<span>${d}</span>${a1.shift()}`, a);
};

let text = highLight`Họ và tên: ${"Nguyễn Minh An"}, tuổi: ${21}, địa chỉ: Xã ${"Tự Nhiên"} - Huyện ${"Thường Tín"} - TP: ${"Hà Nội"}"}!`;
console.log(text);
```

```
Tìm hiểu cơ bản về <span>ES6</span> trong <span>JavaScript</span> 😄😄
```

**[Tagged Template Literals](https://viblo.asia/p/tim-hieu-ve-template-literals-trong-javascript-XL6lA9MDlek#_5-tagged-template-literals-4)**

### **Weak, Set**

#### **Set**

`Set là tập hợp các phần tử khác nhau và không có key, vì vậy nếu bạn thêm 2 giá trị giống nhau vào set thì nó chỉ lưu 1 lần thôi. `

Dễ hiểu hơn thì phần tử trong set là **unique** nhé

#### **WeakMap**

`WeakMap là một loại kiểu dữ liệu giống như Map`, **chỉ khác là với `WeakMap thì key truyền vào phải là một biến và biến này phải là một Object (class, function, json object)`, còn với `Map thì bạn có thể thiết lập key là string, number, NAN được`.**

#### **WeakSet**

`WeakSet thì lại giống như Set`, **tuy nhiên với `WeakSet thì dữ liệu truyền vào luôn phải là một đối tượng (object, class, function) và bạn phải tạo một biến trước khi lưu vào`, điều này khác hoàn toàn với Set là `Set có thể lưu trữ mọi dữ liệu kể cả number và string`.**

**[Es6 Collection Map, Set, WeakMap, WeakSet](https://viblo.asia/p/es6-collection-map-set-weakmap-weakset-oOVlYqnQl8W#_weakmap-18)**

### **Module**

`Một module là một file`. Hay là "One script is one module". Những module có thể load nhiều function bởi hai keywords đặc biệt đó là Import và Export. Và đặc biệt module này có thể gọi và sử dụng một module khác.

**Import**: Cho phép import các functionality từ các module khác.

**Export**: Khai báo những variables hoặc function cho phép những module khác truy cập và sử dụng

#### **`Export`**

Có 2 loại export đó là **named** và **default**:

**`Named Export`:**
Trong JavaScript ES6, `named export được sử dụng để xuất nhiều thứ từ một module` bằng cách thêm keyword export vào khai báo của chúng. Những thứ được export sẽ được phân biệt bằng tên. Sau đó import những thứ chúng ta cần sử dụng bằng cách bao quanh chúng cặp dấu ngoặc nhọn { }. Tên của module đã nhập phải giống với tên của module đã xuất.

```js
//-------util.js------
export function addTwoNumbers(x, y) {
    return x + y;
}
export let students = ["wisdom", "bill", "fred", "grim"];
```

**`Note: Không thể export khi không định nghĩa tên:`**

```js
export 'value';
import { };
```

**`Default Export:`**
Trong Javascript ES6 chỉ cho phép xuất một mặc định cho mỗi file. `Default Export có thể cho một function, class hoặc một object.`

```js
//----myFunction.js ----
export default function () {
    alert("Hello Default Export");
}
```

**`Note: Không thể export khi định nghĩa tên:`**

```js
export default const name = 'value';
```

**`Default + Named export:`**
Bạn có thể cùng lúc sử dụng default export và named export trong 1 file

```js
export const name1 = "value1";
export const name2 = "value2";
export default "value2";

import anyName, { name1, name2 } from "/modules/my-module.js";
console.log(anyName); // 'value2'
console.log(name); // 'value1'
```

**`Đổi tên Export`**
Nếu không thích tên được export, bạn có thể đổi tên nó bằng cách sử dụng từ khóa as

```js
const name = "value";
export { name as newName };

import { newName } from "/modules/my-module.js";
console.log(newName); // 'value'
// Tên gốc (name) không còn truy cập được
console.log(name); // undefined
```

#### **`Import`**

Để import một module vào một script thì bạn có thể sử dụng import. Ví dụ chúng ta có những module dùng named export thì bạn có thể import như thế này.

```js
//----main.js---
import { addTwoNumbers, students } from "util";
```

**`Importing with alias:`**

```js
import * as util from "util";

console.log(util.addTwoNumbers(2, 13));
console.log(util.students);
```

Ngoài ra bạn cũng có thể sử dụng alias "as" để định danh lại nếu chưa quen thuộc hoặc tuỳ theo dự án của mình:

```js
import { sayHi as hi, sayBye as bye } from "./say.js";
```

[Import và Export trong JavaScript](https://viblo.asia/p/import-va-export-trong-javascript-maGK7bxM5j2#_2-import-6)

[Imports và Exports trong JavaScript ES6](https://viblo.asia/p/imports-va-exports-trong-javascript-es6-6J3ZgjyAKmB#_gioi-thieu-0)

### **Optional chaining(?.)**

Toán tử optional chaining giúp chúng ta giảm thiểu lỗi khi giá trị của object hoặc function không tồn tại.

**`Optional chaining với object`**

```js
let possibleNull = null;
let value = 0;
let result = possibleNull?.[value++];
console.log(value); // 0 as value was not incremented
```

Mặc dù biến `possibleNull` đang là `null`, nhưng kết quả vẫn không trả về lỗi bởi vì toán tử `?.` đã giúp bạn xử lý nó. Nó sẽ bỏ qua đoạn đó và tiếp tục thực hiện chương trình, vì vậy mà biến value lúc này sẽ không tăng giá trị, vẫn giữ nguyên là 0.

**`Optional chaining với thuộc tính của object`**

Dưới đây là ví dụ của optional chanining khi truy cập thuộc tính của object

```js
const adventurer = {
    name: "Alice",
    cat: {
        name: "Dinah",
    },
};

const dogName = adventurer.dog?.name;
console.log(dogName);
// expected output: undefined
```

Nếu toán hạng bên trái của `?.` là null hoặc undefined, biểu thức tính toán sẽ có giá trị là `undefined`.

Bạn cũng có thể sử dụng toán tử optional chaining khi truy cập vào thuộc tính là biểu thức sử dụng dấu ngoặc vuông như trường hợp dưới đây:

```js
let nestedProp = myObj?.["prop" + "Name"];
```

**`Optional chaining với gọi hàm`**

Bạn có thể sử dụng nó trong trường hợp gọi một hàm chưa chắc đã tồn tại.

```js
let response = someInterface.customFunction?.();
```

Bằng việc sử dụng optional chaining với function call, biểu thức sẽ ngay lập tức trả về `undefined` thay vì ném ra một exception nếu method không được tìm thấy. Nó sẽ vô cùng hữu ích khi bạn sử dụng API với phương thức không có sẵn, do version hoặc do phương thức đó không hỗ trợ trên thiết bị người dùng...

**`Truy cập phần tử của mảng với optional chaining`**

Mảng với optional chaining cũng khá thú vị, bạn có thể truy cập phần tử bằng cách truyền vào index, và nếu index đó không tồn tại trong mạng, chương trình cũng sẽ không bị lỗi.

```js
let arr = [1, 2, 3];
let arrayItem = arr?.[3];
console.log(arrayItem); // prints: undefined
```

**`Stacked optional chaining`**

Một điều cực cool nữa là bạn có thể sử dụng optional chaining nhiều lần với cùng một nested object

```js
let customer = {
    name: "Sean",
    details: {
        age: 43,
        location: "Trinidad", // detailed address and subscription service frequency is unknown
    },
};

let customerSubscription = customer.details?.subscription?.frequency;
console.log(customerSubscription); // prints: undefined
let customerCity = customer.details?.address?.city;
console.log(customerCity); // prints: undefined
```

Cả 2 biến `customerSubscription` và `customerCity` đều cho kết quả cuối cùng là `undefined` bởi vì chúng không được định nghĩa ở object `customer`.

Và bạn cũng có thể làm tương tự với function.Ví dụ như:

```js
let duration = vacations.trip?.getTime?.();
```

**`Kết hợp với toán tử nullish coalescing`**

Toán tử nullish coalescing (cũng trong đề xuất của Stage 4) được viết là `??` **là một toán tử logic trả về toán hạng bên phải khi toán hạng bên trái của nó là `null` hoặc `undefined`, các trường hợp khác thì trả về toán tử bên trái.** Ví dụ:

```js
const foo = null ?? "default string";
console.log(foo);
// expected output: "default string"

const baz = 0 ?? 42;
console.log(baz);
// expected output: 0
```

Giờ kết hợp 2 toán tử lại, bạn sẽ được như ở ví dụ này:

```js
let customer2 = {
    name: "Paige",
    details: {
        age: 30, // once again a city is not provided on this object
    },
};
const customerCity2 = customer2?.city ?? "City not provided";
console.log(customerCity2); // prints: "City not provided"
```

Khi không tồn tại thuộc tính city, trước hết nhờ ?. nó trở thành undefined, tiếp theo, toán tử ?? sẽ set nó thành toán hạng bên phải "City not provided".

[Toán tử optional chaining trong JavaScript](https://viblo.asia/p/toan-tu-optional-chaining-trong-javascript-1VgZv8Wr5Aw#_optional-chaining-voi-object-2)
