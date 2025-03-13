// 1️⃣ Declarar JSON (objeto usuario)
const usuario = {
    nombre: "Juan",
    email: "juan@email.com",
    edad: 35
};

// 2️⃣ Shorthand Syntax - Crear un nuevo usuario
const nombre = "María";
const email = "maria@email.com";
const edad = 28;

const usuario2 = new Usuario(nombre, email, edad);
console.log(usuario2);

// 3️⃣ Combinar objetos - Agregar dirección
const direccion = { ciudad: "Barcelona", pais: "España" };
const usuarioCompleto = {...usuario2, ...direccion};
console.log(usuarioCompleto);

// 4️⃣ Destructuring Assignment - Extraer datos
const { nombre: nombreUsuario, email: emailUsuario } = usuario;
console.log(nombreUsuario, emailUsuario);

// 5️⃣ Función constructora para usuarios
function Usuario(nombre, email, edad) {
    this.nombre = nombre;
    this.email = email;
    this.edad = edad;
}

const usuario3 = new Usuario("Pedro", "pedro@email.com", 40);
console.log(usuario3);
