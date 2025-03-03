const productos = [
    { nombre: "Celular", precio: 1500 },
    { nombre: "Laptop", precio: 3000 },
    { nombre: "Tablet", precio: 1200 }
];

const productoEncontrado = productos.find(producto => producto.nombre.includes("Laptop"));
console.log(productoEncontrado); // { nombre: "Laptop", precio: 3000 }

const existeCaro = productos.some(producto => producto.precio >= 2000);
console.log(existeCaro); // true