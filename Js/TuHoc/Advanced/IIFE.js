const app = (function () {
    console.log("start app");
    const cars = [];
    console.log("cars = ", cars);
    return {
        add(newCar) {
            cars.push(newCar);
            console.log("=> cars = ", cars);
        },
        getAll() {
            console.log(cars);
        },
    };
})();

app.add("audi");
console.log(1+9);
app.add("bmw");
app.add("mercedes");
app.getAll();

const app1 = {
    cars: [],

    add(newCar) {
        this.cars.push(newCar);
    },
    getAll() {
        console.log(this.cars);
    },
};

app1.add("audi");
app1.add("bmw");
app1.cars = null;
app1.add("mercedes");
app1.getAll();

// https://viblo.asia/p/closures-iifes-module-pattern-trong-javascript-4P856jYG5Y3