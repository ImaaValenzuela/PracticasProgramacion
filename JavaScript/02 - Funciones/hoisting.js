// ¿Por qué la primera llamada a mensaje() funciona aunque la función está después?
// ¿Por qué la llamada a mensaje2() da error?

    console.log(mensaje());  // ✅ ¿Qué imprime? Imprime hola desde funcion declarada, porque las funciones son elevadas junto con su definicion completa.

    function mensaje() {
        return "Hola desde función declarada!";
    }

    console.log(mensaje2()); // ❌ ¿Qué sucede aquí? Tira un error porque no es una funcion, esto se debe a que se eleva var mensaje2; sin su asignacion. Esto pasa porque al estar declarado con var, solo se eleva pero con valor de undefined.

    var mensaje2 = function() {
        return "Hola desde función expresada!";
    };
