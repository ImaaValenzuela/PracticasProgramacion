const objeto = {
    nombre: "Carlos",
    mostrar: function () {
        setTimeout(function () {
            console.log(this.nombre); // El contexto aca hace el valor de "nombre" sea undefined porque la funcion normal hace referencia a object
        }, 1000);
    }
};

objeto.mostrar();


const objeto2 = {
    nombre: "Carlos",
    mostrar: function () {
        setTimeout(() => {
            console.log(this.nombre); // Al hacerlo con arrow function, no tienen su propio this, usa el this heredado .
        }, 1000);
    }
};

objeto2.mostrar();