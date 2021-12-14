let set = (arr) => [...new Set(arr)];
console.log(set(["a", "b", "c", "d", "a", "a", "c"]));

//----------------------------------------------------------------

let recursive1 = (arr) => {
    let newArr = [arr[0]];

    let recursiveFor = (arr, index1, newArr, index2, flag) => {
        if (index1 == arr.length) return newArr;

        if (index2 == newArr.length) {
            if (flag) newArr.push(arr[index1]);
            return recursiveFor(arr, ++index1, newArr, 0, true);
        }

        let f = (arr[index1] == newArr[index2] ? false : true) && flag;

        return recursiveFor(arr, index1, newArr, ++index2, f);
    };

    return recursiveFor(arr, 0, newArr, 0, true);
};

let arr = ["a", "b", "c", "d", "a", "a", "c"];
console.log(recursive1(arr, 0, arr.length));

//----------------------------------------------------------------

let loop = (arr, start, callback) => {
    if (start < arr.length) {
        callback(arr[start], start);
        return loop(arr, ++start, callback);
    }
};

let recursive2 = (arr) => {
    let newArr = [arr[0]];

    loop(arr, 0, (i) => {
        let flag = true;
        loop(newArr, 0, (j) => {
            if (i == j) flag = false;
        });
        if (flag) newArr.push(i);
    });

    return newArr;
};

console.log(recursive2(["a", "b", "c", "d", "a", "a", "c"]));

//----------------------------------------------------------------

function countDown(number) {
    if (number < 0) return;
    process.stdout.write(number + ", ");
    return countDown(--number);
}

countDown(10);

//----------------------------------------------------------------

let giaiThua = (number) => {
    if (number < 0) return undefined;

    return number == 0 ? 1 : number * giaiThua(--number);
};

console.log(giaiThua(10));

//----------------------------------------------------------------
function run(x, y) {
    return x + 1 < y ? [x + 1].concat(run(x + 1, y)) : [];
}

console.log(run(4, 10));
