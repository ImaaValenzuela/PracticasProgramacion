let mensaje = "Por favor ingrese su edad"
let mensaje2 = "Usted es estudiante? (SI/NO)"
let mensaje3 = "Tiene tarjeta de fidelidad? (SI/NO)"

let edad = parseInt(prompt(mensaje))
let condicionEstudiante = prompt(mensaje2)
let condicionFidelidad = prompt(mensaje3)

let descuento;
const DESCUENTO_1 = 20;
const DESCUENTO_2 = 10;

let esMayor = edad >= 18
let noEsMayor = !esMayor

let esEstudiante = (condicionEstudiante == "SI" || condicionEstudiante == "Si" || condicionEstudiante == "sI" || condicionEstudiante == "si")
let noEsEstudiante = (condicionEstudiante == "NO" || condicionEstudiante == "No" || condicionEstudiante == "nO" || condicionEstudiante == "no")

let tieneTarjeta = (condicionFidelidad == "SI" || condicionFidelidad == "Si" || condicionFidelidad == "sI" || condicionFidelidad == "si")
let noTieneTarjeta = (condicionFidelidad == "NO" || condicionFidelidad == "No" || condicionFidelidad == "nO" || condicionFidelidad == "no")

let condicion1 = esMayor && tieneTarjeta 
let condicion2 = esMayor || esEstudiante

console.log(`Condicion 1 para acceder al descuento: ${condicion1}. Recibe un ${DESCUENTO_1}% de descuento`);
console.log(`Condicion 2 para acceder al descuento: ${condicion2}. Recibe un ${DESCUENTO_2}% de descuento`);
