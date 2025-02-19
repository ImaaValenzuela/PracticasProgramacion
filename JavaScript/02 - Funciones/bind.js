const persona = {
    nombre: "Ana"
};

function presentarse() {
    console.log(`Hola, mi nombre es ${this.nombre}`);
}

const presentacion = presentarse.bind(persona) 
presentacion(); // Hola, mi nombre es Ana

const presentacionSinBind = presentarse// Devuelve undefined porque el contexto global donde se ejecutac, this.nombre, es undefinded.
presentacionSinBind()