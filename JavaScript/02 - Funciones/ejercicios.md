# #02 VFundamento de Funciones
> #### Dificultad: Fácil 

## Ejercicio

```

🔹 1. Alcance (Scope)
📌 Ejercicio:
Observa el siguiente código y responde:

¿Por qué console.log(y) da error fuera de la función?
¿Qué pasa si x se declara con var en lugar de let?
    let x = 10;

    function testScope() {
        let y = 20;
        console.log(x); // ✅ ¿Qué imprime?
        console.log(y); // ✅ ¿Qué imprime?
    }

    testScope();
    console.log(y); // ❌ ¿Qué sucede aquí?

🔹 2. Argumentos y Parámetros
📌 Ejercicio:
Crea una función llamada saludar que reciba un nombre como argumento y devuelva un mensaje de saludo.
Si no se pasa un nombre, debe saludar con "Hola, desconocido" por defecto.

    function saludar(nombre) {
        // Tu código aquí
    }

    console.log(saludar("Juan")); // "Hola, Juan"
    console.log(saludar());       // "Hola, desconocido"

🔹 3. Pase por Valor y Referencia
📌 Ejercicio:
Analiza el siguiente código y responde:

¿Por qué num no cambia fuera de la función?
¿Por qué persona sí cambia después de pasar por la función?

    function cambiarNumero(n) {
        n = 100;
    }

    function cambiarObjeto(obj) {
        obj.nombre = "Carlos";
    }

    let num = 50;
    let persona = { nombre: "Ana" };

    cambiarNumero(num);
    cambiarObjeto(persona);

    console.log(num);      // ❓ ¿Qué imprime?
    console.log(persona);  // ❓ ¿Qué imprime?

🔹 4. Funciones Puras
📌 Ejercicio:
Crea una función pura llamada suma que reciba dos números y devuelva su suma sin modificar variables externas.

    function suma(a, b) {
        // Tu código aquí
    }

    console.log(suma(3, 5));  // 8
    console.log(suma(10, 20)); // 30
🚀 Reto extra: ¿Cómo podrías demostrar que es una función pura?

🔹 5. Funciones como First-Class Objects
📌 Ejercicio:
Crea una función llamada doblar que reciba un número y lo duplique.
Luego, asigna esta función a una variable llamada operacion y úsala para duplicar el número 7.

    function doblar(n) {
        // Tu código aquí
    }

    let operacion = doblar; // Asigna la función

    console.log(operacion(7)); // ❓ ¿Qué imprime?
🚀 Extra: ¿Cómo podrías pasar doblar como argumento a otra función?

🔹 6. Hoisting
📌 Ejercicio:
Analiza el siguiente código y responde:

¿Por qué la primera llamada a mensaje() funciona aunque la función está después?
¿Por qué la llamada a mensaje2() da error?

    console.log(mensaje());  // ✅ ¿Qué imprime?

    function mensaje() {
        return "Hola desde función declarada!";
    }

    console.log(mensaje2()); // ❌ ¿Qué sucede aquí?

    var mensaje2 = function() {
        return "Hola desde función expresada!";
    };

```