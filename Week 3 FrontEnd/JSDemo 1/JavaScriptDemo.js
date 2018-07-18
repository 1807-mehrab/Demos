// var can be used to declare variables
var x = 5;

//3 ways to make a string literal
var y = 'some string\nNext line';
y = "another string";
y = `yet another string
second line`;
y = "Mehrab";
z = "hello " + y;

//template literals
var c = `hello ${x + y + z}
one line
another
even more`;

console.log(c);

//JavaScript Object Notation (JSON)
var car = {
    "id": 1,
    "make": 'Honda',
    "model": 'Civic',
    "year": 2018,
    "passengers": ['Mehrab', 'Mehrab']
}

//functions
function sum (a, b) {
    return a + b;
}

var truesum = function(...num) {
    sum = 0;
    for (n of num) {
        sum += n;
    }
    return sum;
}

var anothersum = (a, b) => { return a + b };

function truthiness (test) {
    if (test) { return true }
    else { return false }
}

function equality (a, b) {
    (a == b) ? console.log("equal") : console.log("not equal");
}

// Don't use var, use let or const
function testVar() {
    var a = 30;
    console.log(a);
    if (true) {
        var a = 50;
        console.log(a);
    }
    console.log(a);
}

function testLet() {
    let a = 30;
    console.log(a);
    if (true) {
        let a = 50;
        console.log(a);
    }
    console.log(a);
}

//closure (encapsulation)
function outer() {
    let out = 5;
    function inner() {
        let inn = 'in';
        return inn;
    }
    return inner();
}

//const - constant
// for const with primitive, can't change value
// for objects/arrays, can change contents
const pi = 3.14;
const numArr = [];

//ES6 Classes
class Car {
    constructor(make, model) {
        this.make = make;
        this.model = model;
    }

    print() {
        console.log(this.make + ' ' + this.model);
    }
}

class SUV extends Car {
    constructor (make, model, mileage) {
        super(make, model);
        this.mileage = mileage;
    }

    print() {
        console.log(`${this.make} ${this.model} 
        has ${this.mileage} miles to the gallon`)
    }
}

//Higher order functions: functions that take functions as arguments
//Anonymous: functions with no name (usually created and passed as arguments)
//Callback: functions that are passed as arguments
let numArr2 = [1, 2, 3, 4, 5];
// { 0 : 1, 1: 2 ...}
numArr2.forEach(
    function(args) {console.log(args)}
);
numArr2.forEach(
    (args) => {console.log(args)}
)


