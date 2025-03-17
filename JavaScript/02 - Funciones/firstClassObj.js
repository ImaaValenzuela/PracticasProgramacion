function doblar(n) {
    return n * 2
}

let operacion = doblar; // Asigna la función

console.log(operacion(7)); // ❓ ¿Qué imprime? Imprime undefined
// 🚀 Extra: ¿Cómo podrías pasar doblar como argumento a otra función?

function aplicarOperacion (fun, valor){
    return fun(valor)
}

console.log(aplicarOperacion(doblar,5));
