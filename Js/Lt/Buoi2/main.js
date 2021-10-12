// let a = [];
// a[0] = 0;
// a[1] = 1;
// a[2] = 2;
// a[3] = 3;
// a[4] = 4;

// let b = a;
// // console.log("a:");
// // console.table(a);
// // console.log("b:");
// // console.table(b);

// // b[0] = 1;b[1]=2
// // console.log("a:");
// // console.table(a);
// // console.log("b:");
// // console.table(b);

// // console.log(typeof (a+b)," : ",a+b)

// // push: them cuoi
// console.log(a.push(1), " : ", a);

// // pop: xoa cuoi
// console.log(a.pop(1), " : ", a);

// // shift : xoa dau
// console.log(a.shift(), " : ", a);

// // unshift : them dau
// console.log(a.unshift(-2, -1, 0), " : ", a);

// // splice : them or xoa
// // them
// a.splice(1,0,-1.9,-1.8)
// console.log(a)
// //  xoa
// a.splice(6,8)
// console.log(a);

function checkTang(arr) {
    let a = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (a - arr[i] > 0) {
            return false;
        }
        a = arr[i];
    }
    return true;
}
// console.log(checkTang([1, 2, 3, 4]));
// console.log(checkTang([1, 2, 4, 3]));

function checkGiam(arr) {
    let a = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (a - arr[i] < 0) {
            return false;
        }
        a = arr[i];
    }
    return true;
}
// console.log(checkGiam([1, 2, 3, 4]));
// console.log(checkGiam([4,3,2,1]));

function chan(arr) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] % 2 != 0) {
            return false;
        }
    }
    return true;
}
function chanTang(arr) {
    return checkTang(arr) && chan(arr);
}
// console.log(chanTang([1, 2, 3, 4]));
// console.log(chanTang([0, 2, 4, 6]));

// function max(arr) {
//     return Math.max(...arr);
// }
// // console.log(max([1, 20, 3, 4]));

// function du(arr) {
//     let a= [...arr];
//     // let a= Array.from(arr)
//     return a.map((i) => i % 2);
// }

// function du2(arr) {
//     for (let i = 0; i < arr.length; i++) {
//         arr[i] %= 2;
//     }
//     return arr;
// }
// let a = [4, 2, 5, 6, 2, 7];
// // console.log(du2(a)," ",a);
// console.log(du(a)," ",a);

function majorityElement(nums) {
    let a = nums.length / 2,
        max = nums[0];
    for (let i = 0; i < nums.length; i++) {
        let count = 1;
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] === nums[j]) {
                count++;
            }
        }
        if (count > a) {
            max = nums[i];
        }
    }
    return max;
}

console.log(majorityElement([2, 2, 1, 1, 1, 2, 2]));
console.log(majorityElement([3, 2, 3]));
console.log(majorityElement([3, 3, 3, 4, 4, 4, 4, 4, 3, 3, 3]));
