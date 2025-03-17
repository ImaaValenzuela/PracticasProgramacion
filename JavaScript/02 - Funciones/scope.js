// ¿Por qué console.log(y) da error fuera de la función?
// ¿Qué pasa si x se declara con var en lugar de let? No cambia nada porque sigue estando en un ambito global
    let x = 10;
    var pruebaX = 10

    function testScope() {
        let y = 20;
        console.log(pruebaX); // ✅ ¿Qué imprime? Imprime 10
        console.log(y); // ✅ ¿Qué imprime? Imprime 20
    }

    testScope();
    console.log(y); // ❌ ¿Qué sucede aquí? Error de referencia porque "y" no esta definido de manera global, sino que es parte de la funcion