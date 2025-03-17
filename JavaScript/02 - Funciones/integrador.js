function suma (a, b){
    return a + b
}

function resta (a, b){
    return a - b
}

function multiplicacion (a, b){
    return a * b
}

function division (a, b){
    return a / b
}

function calcular(a, b, operacion){
    return operacion(a,b)
}

console.log(calcular(10, 5, suma));        // 15
console.log(calcular(10, 5, resta));       // 5
console.log(calcular(10, 5, multiplicacion)); // 50
console.log(calcular(10, 5, division));     // 2

function modificarObjeto(obj) {
    obj.valor1 *= 2;
    obj.valor2 += 10;
}

let numeros = { valor1: 5, valor2: 3 };
modificarObjeto(numeros);
console.log(numeros);