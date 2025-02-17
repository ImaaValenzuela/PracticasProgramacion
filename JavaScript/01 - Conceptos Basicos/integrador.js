/**
 Nota: Para ejecutar el programa, hay que usar la consola del navegador.
 */

let nombre
let edad
let esMayor
let estadoMatricula
let estadoMatriculaSTR
let nota1
let nota2
let nota3
const CANTIDAD_EXAMENES = 3
let promedio
let estadoEstudiante
let descuento = 0

let mensaje = "Por favor, ingrese"

nombre = prompt(`${mensaje} su nombre`)
edad = parseInt(prompt(`${mensaje} su edad`))


esMayor = edad >= 18;

// Validación de matrícula
do {
    estadoMatricula = prompt(`${nombre}, usted se encuentra matriculado? (SI/NO)`).toLowerCase();
} while (estadoMatricula !== "si" && estadoMatricula !== "no")

estadoMatriculaSTR = estadoMatricula === "si" ? "Activa" : "Inactiva"

// Validación de notas
do {
    nota1 = parseInt(prompt(`${mensaje} la nota de su primer examen (1-10)`));
} while (isNaN(nota1) || nota1 < 1 || nota1 > 10)

do {
    nota2 = parseInt(prompt(`${mensaje} la nota de su segundo examen (1-10)`));
} while (isNaN(nota2) || nota2 < 1 || nota2 > 10)

do {
    nota3 = parseInt(prompt(`${mensaje} la nota de su tercer examen (1-10)`));
} while (isNaN(nota3) || nota3 < 1 || nota3 > 10)

// Cálculo del promedio
promedio = Math.round((nota1 + nota2 + nota3) / CANTIDAD_EXAMENES)

// Determinar estado del estudiante
if (promedio >= 7) {
    estadoEstudiante = "Aprobado"
} else if (promedio >= 4) {
    estadoEstudiante = "En Recuperacion"
} else {
    estadoEstudiante = "Reprobado"
}

// Determinar descuento
if (esMayor && estadoMatricula === "si") {
    descuento = 15
} else if (!esMayor || promedio > 8) {
    descuento = 10
}

// Mostrar resultado
alert(`
    DATOS:
    Nombre : ${nombre}
    Edad : ${edad}
    Notas Ingresadas: ${nota1} - ${nota2} - ${nota3}
    Estado : ${estadoEstudiante}    
    Matricula: ${estadoMatriculaSTR}
    Descuento para inscripcion: ${descuento}%
`)
