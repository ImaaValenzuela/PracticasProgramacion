# #04 Objetos y JSON
> #### Dificultad: Fácil 

## Ejercicio

```

🔹 1. Declarar un JSON (Objeto en JavaScript)
📌 Ejercicio:
Declara un objeto persona con las propiedades: nombre, edad, profesion y esEstudiante (booleano). Luego, accede a sus valores e imprímelos en consola.

    const persona = {
        /* tu código aquí */
    };

    console.log(persona.nombre);
    console.log(persona.edad);
    console.log(persona.profesion);
    console.log(persona.esEstudiante);

🔹 2. Shorthand Syntax (Sintaxis Corta)
📌 Ejercicio:
Refactoriza el siguiente código usando shorthand syntax para definir el objeto usuario.


    const nombre = "Carlos";
    const edad = 30;
    const profesion = "Desarrollador";

    const usuario = {
        /* usa shorthand aquí */
    };

    console.log(usuario);

🔹 3. Duplicar o Combinar Objetos (Object.assign, Spread ...)
📌 Ejercicio:
Dado el siguiente objeto persona, crea una copia de él y luego combínalo con direccion.

    const persona = { nombre: "Ana", edad: 25 };
    const direccion = { ciudad: "Madrid", pais: "España" };

    // Copia del objeto persona
    const personaCopia = /* tu código aquí */;

    // Combinación de persona y dirección
    const personaCompleta = /* tu código aquí */;

    console.log(personaCopia);
    console.log(personaCompleta);

🔹 4. Destructuring Assignment
📌 Ejercicio:
Extrae las propiedades nombre y edad del siguiente objeto y muéstralas en consola.

    const usuario = { nombre: "Luis", edad: 28, profesion: "Ingeniero" };

    /* tu código aquí */

    console.log(nombre); // Luis
    console.log(edad); // 28
    🚀 Extra: Usa destructuring en una función para recibir un objeto con los datos de un estudiante.

🔹 5. Funciones Constructoras
📌 Ejercicio:
Crea una función constructora llamada Persona que reciba nombre y edad. Luego, crea una instancia de Persona y muestra sus datos.

    function Persona(/* tu código aquí */) {
        /* tu código aquí */
    }

    const persona1 = new Persona("Elena", 32);
    console.log(persona1.nombre); // Elena
    console.log(persona1.edad); // 32
    🚀 Extra: Agrega un método saludar dentro de la función constructora.


```