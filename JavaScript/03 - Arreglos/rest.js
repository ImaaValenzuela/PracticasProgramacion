function sumar(...numeros) {
    return numeros.reduce((acc, num) => acc + num, 0);
}

console.log(sumar(2, 4, 6)); // 12
console.log(sumar(10, 20, 30, 40)); // 100