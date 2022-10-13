let number = new Number(273)
let num = 485

console.log(number)
console.log(num)

console.log("-------------------------------------");

let num2 = 273
console.log(num2.toFixed(2))

console.log("-------------------------------------");

let num3 = Number.NaN
console.log(num3)

console.log("-------------------------------------");

let string = 'Hello World'

let array = string.toLowerCase().replace(' ','|').split('|')

console.log(array)
console.log(string)

console.log("-------------------------------------");

let now = new Date()
let before = new Date('July 26, 1996')

let interval = now.getTime() - before.getTime()
interval = Math.floor(interval / (1000 * 60 * 60 * 24))

console.log(interval)

console.log("-------------------------------------");

let array2 = [52, 273, 32, 64, 72]

console.log('---map method---');
let outputA = array2.map((item, index) => {
  return item * item;
});
console.log(outputA);

console.log('---filter method---');
let outputB = array2.filter((item, index) => {
  return item % 2 == 0;
});
console.log(outputB);

console.log("-------------------------------------");

const _ = require('lodash');

const array3 = [{
  name: '고구마',
  price: 1000
}, {
  name: '감자',
  price: 500
}, {
  name: '바나나',
  price: 1500
}]

const output1 = _.sortBy(array3, (item) => item.price)
console.log(output1)

const output2 = _(array3).sortBy((item) => item.name)
console.log(output2)