const evento = {
    nombre: "Conferencia JavaScript",
    asistentes: 250,
    obtenerDetalles:  function(){
        return `${this.nombre} tiene ${this.asistentes} asistentes` // No se puede hacer uso de arrow functions para crear nuevos eventos porque heredarian el contexto del padre, que ya esta definidio
    }
    /* () => `${evento.nombre} tiene ${evento.asistentes} asistentes` */
}

console.log(evento.obtenerDetalles());

evento.mostrarDetalles = function (){
    setTimeout(() => {
        console.log(`Evento: ${this.nombre}\nAsistentes: ${this.asistentes}`);
    }, 1000)
}

evento.mostrarDetalles()

const nuevoEvento = {
    nombre: "Meetup de Node.js",
    asistentes: 100
};

const obtenerDetallesEvento = evento.obtenerDetalles.bind(nuevoEvento)
console.log(obtenerDetallesEvento());


function mostrarEvento(lugar, fecha) {
    console.log(`${this.nombre} se realizara en ${lugar} el dia ${fecha}`);
}

mostrarEvento.apply(nuevoEvento, ["Costa Salguero", "21 de Febrero"])
mostrarEvento.call(evento, "Hotel Hilton", "01 de Marzo")