function presentar(nombre, edad) {
    console.log(`Soy ${nombre} y tengo ${edad} años`);
}

const datos = ["Lucas", 29];

presentar.apply(null, datos)

// Usa call() en lugar de apply() y compara la diferencia.
presentar.call(datos) // Da undefined porque en un array no existe el contexto

presentar.call(null /*Asigno contexto nulo*/, datos[0], datos[1]) //  De esta forma funcionaria, dando ese contexto nulo y pasando los valores del array.