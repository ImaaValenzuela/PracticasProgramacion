function saludar() {
    console.log(`Hola, soy ${this.nombre}`);
}

const usuario = { nombre: "Sofía" };

saludar.call(usuario)

// Modifica la función para recibir un parámetro apellido y pásalo con call().
function saludar2(){
    console.log(`Hola, soy ${this.nombre} ${apellido}`);    
}

saludar2.call(usuario,"Perez")