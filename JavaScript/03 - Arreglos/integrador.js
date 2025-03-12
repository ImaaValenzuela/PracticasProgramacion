const estudiantes = [
    { nombre: "Ana", nota: 8 },
    { nombre: "Luis", nota: 6 },
    { nombre: "María", nota: 9 },
    { nombre: "Pedro", nota: 5 },
    { nombre: "Juan", nota: 3 }
];

// 1️⃣ forEach - Muestra los nombres en consola
estudiantes.forEach(estudiante => estudiante.nombre);

// 2️⃣ map - Nombres en mayúsculas
const nombresMayus = estudiantes.map(estudiante => estudiante.nombre.toUpperCase);
console.log(nombresMayus);

// 3️⃣ filter - Estudiantes con nota mayor a 7
const aprobados = estudiantes.filter(estudiante => estudiante.nota > 7 );
console.log(aprobados);

// 4️⃣ reduce - Promedio de notas
const promedio = (estudiantes.reduce((acc, estudiante) => acc + estudiante.nota, 0)) / estudiantes.length;
console.log(`Promedio: ${promedio}`);

// 5️⃣ find - Buscar a "Ana"
const ana = estudiantes.find(estudiante => estudiante.nombre.includes("Ana"));
console.log(ana);

// 6️⃣ some - ¿Alguno tiene nota menor a 4?
const hayDesaprobados = estudiantes.some(estudiante => estudiante.nota < 4);
console.log(hayDesaprobados);

// 7️⃣ spread - Agregar un nuevo estudiante
const nuevosEstudiantes = [...estudiantes, { nombre: "Carlos", nota: 7 }];
console.log(nuevosEstudiantes);

// 8️⃣ rest - Función para sumar notas
function sumarNotas(...notas) {
    return notas.reduce((total, nota) => total + nota, 0);
}

console.log(sumarNotas(8, 6, 9)); // 23
