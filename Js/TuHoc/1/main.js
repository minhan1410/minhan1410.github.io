// var name = "Tao tên An"
// var age = 20

// alert(name)
// alert(age)

// console.log(name)
// console.lod(age)

// var name = "An"
// var age = 20

// var number = 6

// // alert(name)
// // console.log(name)
// // console.log(age)

// console.log(number++ + --number)
// console.log(1==1)

// function run(bookCoin, userCoin) {
//     if (bookCoin == userCoin ) {
//         console.log('Bạn có thể mua cuốn sách này!');
//     } else {
//         console.log('Bạn không thể mua cuốn sách này!');
//     }
// }
// run(2,2)

// console.log("14-10-2001")

// var arr = ["an","An1","An2"]
// console.log(arr)

// console.log(typeof "")

// function run(input){
// 	var output = typeof input == 'string' ? true : false
// 	return output
// }

// console.log(run("An"))

// console.log("1"==1)
// console.log("1"===1)
// console.log(1===1)
// console.log(2===1)

// var fisrtName = 'nguyen', lastName = 'an'
// console.log(`An la: ${fisrtName}-${lastName}`)

// console.log("An".indexOf())

// function run(title) {
// 	var language = title.slice(4, 14);
// 	var rest = title.slice(15);
// 	return `Language is ${language} and rest is ${rest}`;
// }
// console.log(run('Học Javascript tại F8').toLowerCase());
// console.log(run('Học Aavascript tại F9').toUpperCase());

// var arr = ["an", "nguyen", 14, 10, 2001]
// console.log(arr)
// console.log(arr[arr.length -1])
// console.log(arr.toString())
// console.log(arr.join(" - "))
// console.log(arr.pop()+" - "+arr)
// console.log(arr.push("nam sinh: ","14/10/2001")+" - "+arr)
// console.log(arr.splice(4,2,"An")+" - "+arr)
// console.log(arr.slice(2))

// function sum(){
// 	var sum = 0;
// 	for(var i of arguments){
// 		if (typeof i == 'number') {
// 			sum += i;
// 		}
// 	}
// 	return sum;
// }

// console.log(sum(2,8,8,"a",10,15,20))

// console.log(isNaN("3"), typeof("3"))
// console.log(isNaN(true), typeof(true))

// function check(idol,name){
// 	if(typeof name == 'string'){
// 		return idol.indexOf(name)==-1 ? false : true;
// 	}
// 	return false;
// }
// console.log(check(["a","b"],"c"))

// var a= function(){
// 	console.log("an")
// 	// return "an"
// }
// console.log(a)

// console.log(Date.now());

// function check(number){

// 	if(number%15==0){
// 		return "f8"
// 	}else if(number%5==0){
// 		return 8;
// 	}else if(number%3==0){
// 		return f;
// 	}
// }
// console.log(check(15));

// function getRequestBodyFromValues(formValues) {
//     var result = {}
//     formValues.forEach(function(obj) {
//         result[obj.field]=obj.value;
//     })
//     return result
// }
// console.log(getRequestBodyFromValues([
//     { field: 'name', value: 'Sơn Đặng' },
//     { field: 'age', value: 18 },
//     { field: 'address', value: 'Hà Nội' },
//     // ...
// ]))

// function checkPositiveNumbers(numbers) {
//     return numbers.every(function (number) {
//         return number > 0 && Number(number)
//     })
// }

// console.log(checkPositiveNumbers([1,2,3]))
// console.log(checkPositiveNumbers([1,2,-3]))

// function findAMonsterByAttack(monsters) {
//     return monsters.find(i => i.attack ===150) || null;
// }

// console.log(findAMonsterByAttack([
//     {
//         name: 'Cá heo',
//         attack: 50,
//         speed: 100,
//         hitpoint: 100,
//     },
//     {
//         name: 'Khủng long',
//         attack: 150,
//         speed: 80,
//         hitpoint: 180,
//     },
// ]))

// function findStringsInArrayByKeyword(keyword, strings) {
//     return strings.filter(s => {
//         if (s.includes(keyword)) {
//             return s;
//         }
//     })
// }
// console.log(findStringsInArrayByKeyword('PHP', ['Javascript', 'PHP', 'Học PHP']))

// function convertToBoolean(inputs) {
//     return inputs.map(i => Boolean(i));
// }
// console.log(convertToBoolean([1, 'hi', false, 8, undefined, '', NaN]))

// function sum(numbers){
//     return numbers.reduce((a,b) => a+b , 0);
// }
// console.log(sum([1, 2, 0, 6]))

// function sumNumbers(inputs) {
//     return inputs.reduce((sum, i) => sum + (Number.isInteger(i) ? i : 0),0)
// }
// console.log(sumNumbers([{}, 1, [], 2, 'hi', 0, 6]))

/* Array.prototype.forEach2 = function (callback) {
    for (let i = 0; i < this.length; i++) {
        callback(this[i], i, this);
    }
}

Array.prototype.find2 = function (callback) {
    for (let i = 0; i < this.length; i++) {
        if (callback(this[i], i, this)) {
            return this[i];
        }
    }
}

Array.prototype.filter2 = function (callback) {
    var arr = []
    for (let i = 0; i < this.length; i++) {
        if (callback(this[i], i, this)) {
            arr.push(this[i]);
        }
    }
    return arr;
}

Array.prototype.some2 = function (callback) {
    for (let i = 0; i < this.length; i++) {
        if (callback(this[i], i, this)) {
            return true;
        }
    }
    return false;
}

Array.prototype.every2 = function (callback) {
    for (let i = 0; i < this.length; i++) {
        if (!callback(this[i], i, this)) {
            return false;
        }
    }
    return true;
}

Array.prototype.reduce2 = function (callback, sum) {
    let i = 0
    if (arguments.length < 2) {
        sum = this[0]; i = 1;
    }
    for (; i < this.length; i++) {
        sum = callback(sum, this[i], i, this)
    }
    return sum
}

var arr = [1, 2, 3, 4]
arr.forEach2(i=> console.log(i))
console.log(arr.find(i => i > 10))
console.log(arr.filter2(word => word.length > 6))
console.log(arr.some2((element) => element % 2 === 0))
console.log(arr.every2((currentValue) => currentValue < 40))
console.log(arr.reduce2((a, b) => a + b)) */

// let h1Element = document.getElementsByTagName("h1")[0]
// h1Element.classList.add("first-heading")
// console.log(h1Element)

// let h2Element = document.getElementsByTagName("h2")[0]
// h2Element.classList.add("second-heading")
// h2Element.classList.remove('test')
// console.log(h2Element)

/* // Bai1
let pElement = document.querySelector('p')
pElement.style.color = "#777"
pElement.style.fontSize = "32px"
pElement.innerHTML = "Tôi có thể làm <em> bất cứ điều gì </em> tôi muốn với JavaScript." */

/* // Bai2
let liElements = document.querySelectorAll("ul>li")
Array.from(liElements).map(li => li.style.color = "blue") */

/* // Bai3
const pElement = document.createElement("p");
pElement.innerHTML = "bai3";

const p = document.getElementById("text");

document.getElementById("btn").addEventListener("click", () => {
    if (!document.body.contains(pElement)) {
        p.appendChild(pElement);
    } else {
        p.removeChild(pElement);
    }
}); */

/* // Bai 4
const selectElement = document.getElementById("texture-selector")
const divElement = document.getElementById("texture-background")
let img = document.createElement("img");
divElement.appendChild(img)
selectElement.addEventListener("change",(event) => {
    img.setAttribute("src", event.target.value)
    console.log(divElement)
}) */

/* // Thuc hanh 2
const h1Element = document.getElementById("heading")
h1Element.style.color = "red"
h1Element.style.textTransform = "uppercase"

const paras = document.getElementsByClassName("para")
Array.from(paras).map(e => {e.style.color = "blue";e.style.fontSize="20px"})

const fb = document.createElement("a")
fb.href = "#"
fb.innerHTML="Goi xg"


const para3 = document.getElementsByClassName("para-3")[0]
const br = document.createElement("br")

para3.appendChild(br);
para3.appendChild(fb)

const title = document.getElementById("title")
title.innerHTML = "Đây là thẻ tiêu đề"

const description = document.getElementsByClassName("description")[0]
description.classList.add("text-bold")
const textBold = document.getElementsByClassName("text-bold")[0]
textBold.style.fontWeight = "bold"


const button= document.createElement("button")
button.innerHTML = "Click me"
para3.replaceWith(button)

const para2 = document.getElementsByClassName("para-2")[0]
const clone = para2.cloneNode(true)
para2.insertAdjacentElement("afterend",clone)

paras[0].remove() */

// console.log(document.getElementById("t1").childNodes)

// Bài 1: Highlight tất cả các từ có độ dài lớn hơn hoặc bằng 8 ký tự trong đoạn văn (background = "yellow")
const p = document.querySelector("p");
let strs = p.innerText.split(" ")
    
p.innerHTML = strs.map((e) =>
    e.replace(/[,\.!?]/g, "").length >= 8
        ? `<span style="background-color : yellow">${e}</span>` : e
).join(" ");

// bài 2: Thêm link hiển thị text "facebook" link đến trang facebook.com ở sau thẻ p
const facebook = document.createElement("a")
facebook.href="#"
facebook.innerText="facebook"
p.insertAdjacentElement("afterend",facebook)

// bài 3. Đếm số từ có trong đoạn văn. Tạo 1 thẻ div để hiển thị số từ
const div = document.createElement("div")
div.innerText = `So tu: ${strs.length}`
document.body.appendChild(div)
// Bài 4: thay thế ? => 🤔, ! => 😲
p.innerHTML = p.innerHTML.replace(/!/g,"🤔")
p.innerHTML = p.innerHTML.replace(/\?/g,"🤔")
p.innerHTML = p.innerHTML.replace(/\./g,"😍")
p.innerHTML = p.innerHTML.replace(/,/g,"🤣")