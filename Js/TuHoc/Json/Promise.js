// Sync(Đồng bộ) - ASync(Bất đồng bộ)
var promise = new Promise(function (resolve, reject) {
    /*
        resolve: thành công
        reject: thât bại
    */
    resolve("thành công");
});

promise
    .then(() => {
        return "Success";
    })
    .then((message) => {
        setTimeout(() => {
            console.log(message);
        }, 1000);
        return message + "❤❤";
    })
    .then((message) => {
        setTimeout(() => {
            console.log(message);
        }, 3000);
        return new Promise((resolve, reject) => {
            resolve(message + "🥰");
        });
    })
    .then((message) => {
        console.log(message);
    })
    .then(() => {
        return new Promise((resolve, reject) => {
            reject("Error😥😥");
        });
    })
    .catch((err) => {
        console.error(err);
    });

/*
    Success❤❤🥰
    Error😥😥
    Success
    Success❤❤
 */

var resolve = Promise.resolve("Promise.resolve()");
resolve.then((message) => {
    console.log(message);
});

var reject = Promise.reject("Promise.reject()");
reject.catch((err) => {
    console.error(err);
});

/* 
// Gộp mảng
var a= 1,b=2,c=3
console.log([a,b,c],' - ',typeof [a,b,c]);

// Duỗi mảng
var arr= [a,b,c]
console.log(...arr) 
*/

var all = Promise.all([
    Promise.resolve([1, 2, 3]),
    Promise.resolve([4, 5, 6]),
    Promise.resolve([7, 8, 9]),
]);
all.then(([mess1, mess2, mess3]) => {
    console.log("all ", mess1.concat(mess2).concat(mess3));
});

var all2 = Promise.all([
    Promise.resolve([1, 2, 3]),
    Promise.resolve([4, 5, 6]),
    Promise.resolve([7, 8, 9]),
    Promise.reject("Error😅"),
]);
all2.then(([mess1, mess2, mess3]) => {
    console.log("all2 ", mess1.concat(mess2).concat(mess3));
}).catch((err) => {
    console.log("all2 ", err);
});
