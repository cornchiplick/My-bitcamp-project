let array = [33, 34, 35, 36, 37];

for (let i in array) {
    console.log(array[i]);
}

console.log("-------------------------------------");

function print(name, count) {
    
    count = count || 1;
    
    console.log(`${name}이/가 ${count}개 있습니다.`)
}

print("사과");

console.log("-------------------------------------");

function 함수() { console.log("1"); };
function 함수() { console.log("2"); };

함수();