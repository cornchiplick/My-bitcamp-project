/*
let product = {
    이름 : 'Nature of Code',
    가격 : '30000원',
    저자 : '다니엘 쉬프만',
    ISBN : 9788968481901,
    페이지_수 : '620페이지'
};

console.log(product);
*/



class Product {
    
    constructor (이름, 무게, 가격) {
    this.이름 = 이름
    this.무게 = 무게
    this.가격 = 가격
    }

    calculate(무게) {
        let price = 무게 / parseInt(this.무게) * parseInt(this.가격)
        console.log(`${price}원`)
    }

}

let product = new Product('돼지삼겹살','100g','1690원')

product.calculate(200)