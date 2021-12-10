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

//----------------------------------------------------------------------------------------------------------------------

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