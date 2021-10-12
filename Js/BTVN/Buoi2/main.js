function checkElementExist(arr, number) {
    return arr.includes(number);
}

// console.log(checkElementExist([1, 2, 3, 4], 4));
// console.log(checkElementExist([1, 2, 3, 4], 5));

function max2Numbers(arr) {
    let clone = [];

    arr.forEach((i) => {
        if (!checkElementExist(clone, i)) {
            clone.push(i);
        }
    });

    clone.sort();
    return clone[clone.length - 2];
}
// console.log(max2Numbers([2, 1, 3, 4]));
// console.log(max2Numbers([2, 1, 3, 4, 4]));

function findMaxLengthElement(arr) {
    let result = [],
        maxLength = arr.map((i) => i.length).sort()[arr.length - 1];

    arr.find((i) => {
        if (i.length === maxLength) {
            result.push(i);
        }
    });
    return result;
}
// console.log(findMaxLengthElement(["aba", "aa", "ad", "c", "vcl"]));

function capitalizeString(str) {
    let arr = str.toLowerCase().split(" ");
    return arr
        .map((i) => `${i.charAt(0).toUpperCase()}${i.substr(1)}`)
        .join(" ");
}
// console.log(capitalizeString("chÀo MừnG đẾn với techMaster"));

function reverseString(str) {
    return str.split("").reverse().join("");
}
// console.log(reverseString("Hello"));

function checkSymmetricString(str) {
    let a = str.toLowerCase().replace(" ", "");
    for (let i = 0; i < a.length / 2; i++) {
        if (a.charAt(i) !== a.charAt(a.length - 1 - i)) {
            return false;
        }
    }
    return true;
}
// console.log(checkSymmetricString("Race car"));
// console.log(checkSymmetricString("hello world"));
