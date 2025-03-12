function Persona(nombre, edad) {
    this.nombre = nombre
    this.edad = edad

    this.saludar = function () {
        console.log(`Hola, soy ${this.nombre} y tengo ${this.edad} años`);
    }
}

const persona1 = new Persona("Elena", 32);
console.log(persona1.nombre); // Elena
console.log(persona1.edad); // 32
persona1.saludar()
