const fs = require('fs')

const file = fs.readFileSync('textfile.txt')
console.log(file)
console.log(file.toString())

const request = require('request')

console.log('dddddd')