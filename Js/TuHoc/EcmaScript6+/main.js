/* let fullName = ["Nguyễn", "Minh", "An"];

let [surname, middleName, name] = fullName;

console.log(`${surname} ${middleName} ${name}`); */

// ----------------------------------------------------------------

/* function Car(name, color) {
    this.name = name;
    this.color = color;

    this.getName = () => {
        return this.name;
    };
}

const mazda = new Car("mazda6", "black");
console.log(mazda, " - ", mazda.getName());

const bmw = new Car("bmw", "white");
console.log(bmw, " - ", bmw.getName()); */

/* class Car1 {
    constructor(name, color) {
        this.name = name;
        this.color = color;
    }

    getName() {
        return this.name;
    }
}

const mazda1 = new Car1("mazda6", "black");
console.log(mazda1, " - ", mazda1.getName());

const bmw1 = new Car1("bmw", "white");
console.log(bmw1, " - ", bmw1.getName()); */

// ----------------------------------------------------------------

/* const sum = (...arr) => arr.reduce((a, b) => a + b);

console.log(sum(1, 2, 3, 4, 5)); */

// ----------------------------------------------------------------

/* const message = (type = "log", data) => {
    console[type](data);
};

message(undefined, "An đã ở đây");
message("error", "An đã ở đây"); */

// ----------------------------------------------------------------

/* let arr = ["tôm", "cua", "cá"];

let [a, b, c] = arr;
console.log(a, " ", b, " ", c);

let [a1,...arr2] = arr;
console.log(a1," ",arr2); */

/* let obj = { name: "An", age: 21, gender: "Male" };

let { name, age, a1 = 'Khong co'} = obj;
console.log(name, age, a1);

let { name: name2, ...obj2 } = obj;
console.log(name2, obj2); */

// ----------------------------------------------------------------

/* let arr1 = [1, 2, 3];
let arr2 = [4, 5, 6, 7, 8];

console.log([...arr1, ...arr2], [...arr2, ...arr1]);
 */

/* let obj1 = { name: "An", age: 21 };
let obj2 = {
    wear: "black",
    brand: "kappa",
    name: "222 Banda Balima T-Shirt - Black White",
};

// Nếu key trùng thì lấy obj cuối

console.log({ ...obj1, ...obj2 }, "\n", { ...obj2, ...obj1 });
 */

// ----------------------------------------------------------------

function highlight([arr1, ...arrs], ...values) {
    return values
        .reduce((a, b) => [...a, `<span>${b}</span>`, arrs.shift()], [arr1])
        .join("");
}

var a = "ES6";
var b = "JavaScript";
const html = highlight`Tìm hiểu cơ bản về ${a} trong ${b} 😄😄`;
console.log(html);
