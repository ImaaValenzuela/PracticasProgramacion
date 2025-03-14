# #05 Contexto
> #### Dificultad: Fácil 

## Ejercicio

```

🔹 1. Arrow Functions
📌 Ejercicio:
Convierte la siguiente función tradicional en una arrow function:

    function sumar(a, b) {
        return a + b;
    }

/* Convierte esto en una arrow function */
🚀 Extra: Convierte también esta función de una sola línea:

    function cuadrado(n) {
        return n * n;
    }

🔹 2. Arrow Functions y el Contexto (this)
📌 Ejercicio:
Explica qué sucede cuando this es utilizado en una arrow function dentro de un objeto.

    const objeto = {
        nombre: "Carlos",
        mostrar: function () {
            setTimeout(function () {
                console.log(this.nombre);
            }, 1000);
        }
    };

    objeto.mostrar();

🔹 Reto: Cambia la función interna por una arrow function y observa qué cambia.

🔹 3. bind() - Cambiar el Contexto
📌 Ejercicio:
Asocia el this de una función a un objeto usando bind().

    const persona = {
        nombre: "Ana"
    };

    function presentarse() {
        console.log(`Hola, mi nombre es ${this.nombre}`);
    }

    const presentacion = /* Usa bind aquí */;
    presentacion(); // Hola, mi nombre es Ana

🚀 Extra: Prueba llamar la función sin bind() y observa qué sucede.

🔹 4. call() - Llamar Funciones con un Contexto Específico
📌 Ejercicio:
Usa call() para ejecutar la función saludar con el contexto del objeto usuario.

    function saludar() {
        console.log(`Hola, soy ${this.nombre}`);
    }

    const usuario = { nombre: "Sofía" };

/* Usa call aquí */
🚀 Extra: Modifica la función para recibir un parámetro apellido y pásalo con call().

🔹 5. apply() - Similar a call() pero con Arreglos
📌 Ejercicio:
Usa apply() para llamar una función con parámetros en forma de arreglo.

    function presentar(nombre, edad) {
        console.log(`Soy ${nombre} y tengo ${edad} años`);
    }

    const datos = ["Lucas", 29];

    /* Usa apply aquí */


🚀 Extra: Usa call() en lugar de apply() y compara la diferencia.


```