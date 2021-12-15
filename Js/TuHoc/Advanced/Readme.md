# **`Javascript nâng cao`**

# **Closures**

## Định nghĩa

`Một closure là một hàm bên trong mà có thể truy cập biến của hàm bên ngoài (chứa nó). `

**Closure có 3 scope chain, đó là:**

    1. Có thể truy cập đến biến của chính nó (biến được định nghĩa trong dấu ngoặc nhọn của nó);

    2. Có thể truy cập biến của hàm bên ngoài;

    3. Có thể truy cập biến toàn cục (global).

```js
function a() {
    var name = "I'm a Copy";
    function b() {
        // Closure
        console.log(name);
    }
}
```

Hàm bên trong không chỉ truy cập được đến biến của hàm bên ngoài và còn sử dụng được các tham số của hàm bên ngoài nữa.

_Chú ý là hàm bên trong này không thể gọi object arguments của hàm bên ngoài, mặc dù nó có thể sử dụng các tham số của hàm bên ngoài một cách bình thường._

Ta có thể tạo một closure bằng cách thêm một hàm bên trong một hàm khác.

```js
function showName(firstName, lastName) {
    var nameIntro = "Your name is ";

    // Đây là hàm bên trong mà có thể truy cập đến biến của hàm bên ngoài, truy cập được tham số của hàm ngoài.
    function makeFullName() {
        return nameIntro + firstName + " " + lastName;
    }

    return makeFullName();
}

showName("Michael", "Jackson"); // Your name is Michael Jackson
```

Closures được sử dụng nhiều trong NodeJS; Nó có trong kiến trúc non-blocking, bất đồng bộ của NodeJS. Ngoài ra Closures cũng được sử dụng nhiều trong Jquery, ví dụ:

```js
$(function () {
    var selections = [];
    $(".niners").click(function () {
        // Closure này có thể truy cập đến biến selections
        selections.push(this.prop("name")); // cập nhật biến selections trong scope của hàm ngoài.
    });
});
```

[Tìm hiểu Closures trong Javascript đơn giản nhất](https://viblo.asia/p/tim-hieu-closures-trong-javascript-don-gian-nhat-Ljy5Vp2zZra#_closure-la-gi--0)

# **IIFE (Immediately Invoked Function Expression)**

## Định nghĩa

`IIFE (Immediately Invoked Function Expression) là một hàm javacript, nó được chạy ngay sau khi nó được định nghĩa.`

`IIFE như là một các hộp đóng gói code của chính nó. Do đó, sẽ không truy xuất hay thay đổi được biến toàn cục - Ngăn nhiễm Global Scope`

Cú pháp:

```js
(function () {
    //code here
})();
```

Khi ta muốn truyền tham số cho IIFEs

```js
(function(par1, par2, …, parn){
	//code here
})(arg1, arg2, …, argn);
```

## VD

Ví dụ khi in ra giá trị nguyên từ 0 đến 9

```js
for (var i = 0; i < 10; i++) {
    (function (i) {
        //IIFE tạo ra một scope khác cho từng i, nên giá trị của i là khác nhau
        console.log(i);
    })(i);
}
```

Để thấy rõ lợi ích khi dùng IIFEs thì mình có ví dụ sau:

1. Khi không dùng IIEFs

```js
function celebrityIDCreator(theCelebrities) {
    var i;
    var uniqueID = 100;
    for (i = 0; i < theCelebrities.length; i++) {
        theCelebrities[i]["id"] = function () {
            return uniqueID + i;
        };
    }
    return theCelebrities;
}

var actionCelebs = [
    { name: "Stallone", id: 0 },
    { name: "Cruise", id: 0 },
    { name: "Willis", id: 0 },
];

var createIdForActionCelebs = celebrityIDCreator(actionCelebs);

var stalloneID = createIdForActionCelebs[0];
console.log(stalloneID.id()); // 103
```

Output ở đây chính là 103 nhưng mà theo mong đợi kết quả là 100. Nhưng do về vấn đề thực thi ngữ cảnh ta nói ở trên nên kết quả đã ra sai lệch.

2. Ví dụ về kết hợp Closures và IIFEs cũng ở ví dụ trên

```js
function celebrityIDCreator(theCelebrities) {
    var i;
    var uniqueID = 100;
    for (i = 0; i < theCelebrities.length; i++) {
        theCelebrities[i]["id"] = (function (j) {
            return (function () {
                return uniqueID + j;
            })();
        })(i);
    }

    return theCelebrities;
}

var actionCelebs = [
    { name: "Stallone", id: 0 },
    { name: "Cruise", id: 0 },
    { name: "Willis", id: 0 },
];

var createIdForActionCelebs = celebrityIDCreator(actionCelebs);

var stalloneID = createIdForActionCelebs[0];
console.log(stalloneID); // 100
```

Với sự kết hợp hoàn hảo của bộ đôi nên ta đã thu được kết quả chính xác.

# **Module pattern**

## Định nghĩa

`Module pattern (là một design pattern) trong javascript là phương pháp implement source code theo các modules riêng biệt với các ưu điểm như dễ mở rộng, giảm thiểu conflict khi làm việc theo nhóm, quản lý các biến local dễ hơn…`

## VD

```js
function counter(initValue) {
    let currentValue = initValue;

    function increase(change) {
        currentValue += change;
    }

    function descrease(change) {
        currentValue -= change;
    }

    function getCurrentValue() {
        return currentValue;
    }

    return {
        current: currentValue,
        increase: increase,
        descrease: descrease,
        getCurrentValue: getCurrentValue,
    };
}

var c = counter(10);
console.log(c.current);
console.log(c.getCurrentValue()); // 10
c.increase(50);
console.log(c.getCurrentValue()); // 60
c.descrease(20);
console.log(c.getCurrentValue()); // 40
```

Ở trong đây ta cần chú ý một số điều:

```
Từ khóa let thì có ý nghĩa như khi ta đặt scope private cho một biến như trong các ngôn ngữ lập trình hướng đối tượng.

Khi ta muốn truy cập đến các function của module thì các function đó phải được public ra bằng cách sử dụng từ khóa return.
```

[Closures, IIFEs, module pattern trong Javascript](https://viblo.asia/p/closures-iifes-module-pattern-trong-javascript-4P856jYG5Y3)

# **Scope**

Javascript có các khái niệm liên quan tới `scope` và không khái niệm nào là `dễ ăn` đối với những newbie mới làm quen với Javascript (hay kể cả những dev lâu năm). Bài viết này hướng tới những bạn mong muốn tìm hiểu sâu hơn về scope sau khi đã "đối mặt" với các từ khóa như `scope, closure, this, namespace, function scope, global scope, lexical scope và public/private scope`

## Định nghĩa

Trong Javascript, `scope` hay `phạm vi truy cập`, đề cập đến ngữ cảnh của đoạn code. `Scope` có thể định nghĩa là toàn cục (`globally`) hoặc cục bộ (`locally`).

Nắm rõ `scope` trong Javascrip là chía khóa để viết những đoạn code rõ ràng, `sạch sẽ`, hiểu được các biến/hàm này có thể truy cập đến không hay giúp cho đoạn code của bạn dễ manitain, dễ debug hơn. Khi xét scope của variable/function, ta thường đặt câu hỏi: nó thuộc scope A hay scope B ???

## Global Scope

Trước khi bắt đầu viết một dòng code, chúng ta đang nằm trong cái mà được gọi là `phạm vi truy cập toàn cục(global scope)`. Nếu ta định nghĩa biến, biến đó là toàn cục:

```js
var name = "Nguyễn Minh An";
```

Global scope là bạn tốt nhất và cũng là cơn ác mộng tồi tệ nhất!!! Nếu không nắm rõ mình đang nằm trong scope nào, chắc chắn ta sẽ gặp vấn đề với global scope (thường là xung đột namespace). Người ta cứ nói rằng việc dùng Global scope là rất dở, nhưng không phải trong mọi trường hợp. Ta cần sử dụng nó để tạo ra các Modules/APIs được truy cập bởi các scope khác. Ví dụ: trong jQuery, ta select một element bằng class name như sau:

```js
jQuery(".myClass");
```

Ở đây, ta đang truy cập đến namespace jQuery trong global scope. Khái niệm `namespace` đôi khi có thể dùng thay thế cho `scope`, nhưng chủ yếu là đề cập đến `scope` có level cao nhất. Trong trường hợp này, jQuery nằm trong global `scope` đồng thời cũng là `namespace` cho thư viện jQuery.

## Local scope

Local scope đề cập tới bất kỳ scope nào được xác định qua `global scope`. Thường có một phạm vi truy cập toàn cục (global scope) duy nhất và mỗi function lại định nghĩa phạm vi truy cập cục bộ (`local scope`) của riêng nó. Nếu định nghĩa một function và tạo các biến bên trong nó, các biến này được gọi là biến cục bộ. Ví dụ:

```js
// Scope A: Global scope out here
var myFunction = function () {
    // Scope B: Local scope in here
    var name = "Nguyễn Minh An";
    console.log(name); // Nguyễn Minh An
};
// Uncaught ReferenceError: name is not defined
console.log(name);
```

Biến `name` có phạm vi truy cập là `local scope` và nó sẽ không thể được truy cập bởi scope cha, do đó dẫn đến kết quả là `undefined`

## Function scope

Tất cả các scope trong Js không được tạo bởi vòng lặp `for` hoặc `while`, hay các lệnh rẽ nhánh `if hoặc swi`tch mà bởi `function scope`. Công thức là: tạo functions = tạo scope mới. Ví dụ:

```js
// Scope A
var myFunction = function () {
    // Scope B
    var myOtherFunction = function () {
        // Scope C
    };
};
```

[Scope trong Javascript](https://viblo.asia/p/scope-trong-javascript-RQqKLnW6l7z)

# **Hoisting**

Bắt đầu với ví dụ 1 nào (len)

```js
#Ex1:
console.log(a);
```

Kết quả không có gì lạ: raise lỗi `a is not define`, bởi biến a chưa được khai báo ở đâu cả

```js
#Ex2:
console.log(a);
a = 'Hello Hoisting';
```

Ví dụ này có vẻ phức tạp hơn ví dụ trên "rất nhiều" nhưng kết quả vẫn chỉ có một: `a is not define`

```js
#Ex3:
var a;
console.log(a);
```

Output sẽ là `undefined` vì `a` đã được khai báo nhưng vẫn chưa được gán giá trị

```js
#Ex4:
console.log(a);
var a;
```

Thật tình cờ và thật bất ngờ, kết quả ra trùng với Ex3, đều là `undefined`

## Định nghĩa

Hoisting là hành động mặc định của Javascript, nó sẽ chuyển phần khai báo lên phía trên top. Trong Javascript, một biến (variable) có thể được khai báo sau khi được sử dụng

```js
#Ex5
console.log(a);
var a = 'Hello Hoisting'
```

Kết quả sẽ được diễn giải theo sơ đồ sau:

![img](https://images.viblo.asia/2bf79118-d9d7-4b49-b226-5c4395728c95.png)

Giải thích:

-   Cũng giống như với phần 1, phần bên trong của hàm `do_something` cũng được trình biên dịch sử dụng `hoisting`.

-   Nhưng **phần khai báo chỉ được chuyển lên trên top của hàm `do_something` chứ không phải của chương trình**

Vậy nên, Output sẽ là undefined

## Hoisting function vs Hoisting variable

### Định nghĩa:

Trình biên dịch Javascript sẽ chuyển phần đinh nghĩa của hàm trước phần khai báo của biến

```js
var show_me;
show_me();
function show_me() {
    console.log("Money");
}
show_me = function () {
    console.log("Diamond");
};
```

Theo định nghĩa trên, output sẽ là `Money` .Vì **`những hàm khai báo sau nếu trùng tên sẽ ghi đè lên hàm khai báo trước`**

```js
var show_me;
show_me();
function show_me() {
    console.log("Money");
}
show_me = function () {
    console.log("Diamond");
};
function show_me() {
    console.log("Gem");
}
```

Output sẽ là `Gem`

[Hoisting Javascript](https://viblo.asia/p/hoisting-javascript-WAyK8RmmlxX)

# **Strict Mode**

**`"use strict";`**

Chắc hẳn bạn đã bắt gặp dòng lệnh trên khi làm việc với JavaScript rồi chứ nhỉ? Đó là nội dung thường xuyên xuất hiện trong hầu hết các thư viện Javascript hiện đại.

**Vậy `"use strict";` là gì, nó có ảnh hưởng gì đến code của bạn, và liệu bạn có nên sử dụng nó?**

## Định nghĩa

**Strict** hiểu đơn giản theo nghĩa tiếng Việt là "nghiêm ngặt, nghiêm khắc".

Strict Mode là một **quy mẫu nghiêm khắc** của Javascript. Nếu như coi việc viết code bình thường là Normal Mode, thì Strict Mode sẽ có thêm nhiều quy định khác so với Normal Mode. Việc đó khiến cho một thao tác vốn bình thường có thể chạy ngon lành trở nên lỗi, và throw ra errors.

Nhìn chung, Strict được tạo ra nhằm:

-   Ngăn chặn sử dụng, và throw errors khi người lập trình thực hiện những xử lý được coi là **unsafe**, những xử lý mà có thể là ngoài ý muốn.
-   Vô hiệu hoá các tính năng có thể gây nhầm lẫn, hoặc không nên được sử dụng.
-   Ngăn chặn sử dụng một số từ mà có thể sẽ được sử dụng làm keywork trong tương lai.

## Sử dụng Strict Mode

Để sử dụng Strict Mode trong code của mình, bạn có thể dùng đoạn text là `"use strict";`.

Lúc đầu nhìn qua mình cũng thấy nó khá là dị. Bởi như bạn thấy, đó là một ... string. =))

Việc định nghĩa như vậy được gọi dưới một cái tên là `directive prologue.`

Bạn có thể đặt đoạn text đó ở đầu file, hay ở đầu phần thân của một hàm. Việc khai báo `"use strict";` ở đâu sẽ có quyết định phạm vi ảnh hưởng của Strict Mode.

Nếu bạn đặt `"use strict";` ở đầu file, phạm vi của Strict Mode sẽ là toàn bộ file đó.

```js
"use strict";
function foo() {
    var bar = 0;
    return bar;
}

// Uncaught ReferenceError: bar is not defined
bar = 1;
```

Nếu bạn đặt `"use strict";` ở đầu phần thân hàm của một function, Strict Mode sẽ được áp dụng cho chỉ mình function đó.

```js
function foo() {
    "use strict";
    // Uncaught ReferenceError: bar is not defined
    bar = 0;
    return bar;
}

// This will run normally
bar = 1;
```

[Tìm hiểu về Strict Mode trong Javascript](https://viblo.asia/p/tim-hieu-ve-strict-mode-trong-javascript-jaqG0QQevEKw)

# **"this" trong JavaScript**

## Định nghĩa

**Trong JavaScript, chúng ta dùng từ khóa `this` để đại diện cho một đối tượng. Đối tượng đó là chủ thế của ngữ cảnh, hoặc là chủ thế của code đang được chạy.**

```js
var person = {
    firstName: "Nguyễn",
    lastName: "An",
    fullName: function () {
        // Việc sử dụng "this" cũng tương tự như việc sử dụng "he"
        // trong câu tiếng Anh ở trên.
        console.log(this.firstName + " " + this.lastName);
        // Chúng ta cũng có thể viết thế này.
        console.log(person.firstName + " " + person.lastName);
    },
};
```

Nếu chúng ta sử dụng `person.firstName` và `person.lastName` như ví dụ ở trên, code của chúng ta có thể sẽ trở nên khó hiểu. Tất nhiên, nếu chỉ có code đơn giản như ví dụ trên thì nó sẽ chạy tốt.

## Đặc tính

    1. Trong phương thức, `this` tham chiếu tới đối tượng truy cập phương thức(đối tượng trước dấu `.`)

    2. Đứng ngoài phương thức, `this` tham chiếu tới đối tượng global

## Lưu ý

    1. this trong hàm tạo là đại diện cho đối tượng sẽ được tạo

    2. this trong một hàm là undefined khi ở stric mode

    3. Các phương thức bind(), call(), apply() có thể tham chiếu this tới đối tượng khác

["this" trong JavaScript](https://viblo.asia/p/this-trong-javascript-gAm5ywe8Zdb)

# **Bind()**

**`Bind được dùng để xác định tham số this cho một function.`**

Cú pháp:

```js
let boundFunc = func.bind(thisArg[, arg1[, arg2[, ...argN]]])
```

Trong đó:

-   `thisArg`: Giá trị của `this` được đưa ra để gọi `hàm`. Giá trị bị bỏ qua nếu hàm liên kết được xây dựng bằng toán tử new. Khi sử dụng bind để tạo ra một hàm dưới dạng callback trong hàm `setTimeout`, bất kỳ giá trị nào sơ khai được truyền dưới dạng `thisArg` sẽ được chuyển đổi thành đối tượng.

-   `arg1, arg2, ...argN`: Các đối số cho hàm.

VD:

```js
this.fullName = "Nguyễn Minh An";

const person = {
    fullName: "An Minh Nguyễn😄",
    getFullName: function () {
        return this.fullName;
    },
};

console.log(person.getFullName()); //An Minh Nguyễn😄

let a = person.getFullName;
console.log(a()); //Nguyễn Minh An

a = person.getFullName.bind(person);
console.log(a()); //An Minh Nguyễn😄

a = person.getFullName.bind(this);
console.log(a()); //Nguyễn Minh An
```
