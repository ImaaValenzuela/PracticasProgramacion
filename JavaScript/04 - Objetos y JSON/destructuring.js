const usuario = { nombre: "Luis", edad: 28, profesion: "Ingeniero" };

let { nombre, edad } = usuario

console.log(nombre); // Luis
console.log(edad); // 28

function mostrarDatos ({nombre, edad, profesion}){
    console.log(`Nombre: ${nombre}\nEdad: ${edad}\nCarrera: ${profesion}`);
}

mostrarDatos(usuario)