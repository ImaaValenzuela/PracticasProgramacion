function saludar(nombre = "desconocido") {
    return `Hola, ${nombre}`
}

console.log(saludar("Juan")); // "Hola, Juan"
console.log(saludar());       // "Hola, desconocido"