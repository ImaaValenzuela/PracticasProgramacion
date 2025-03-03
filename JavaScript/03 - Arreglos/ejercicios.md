# #02 VARIABLES, TIPOS DE DATOS, NUMEROS Y OPERACIONES, OPERADORES DE COMPARACION, OPERADORES LOGICOS, CONDICIONES Y CICLOS
> #### Dificultad: Fácil 

## Ejercicio

```

🔹 1. Recorrer un Arreglo
📌 Ejercicio:
Dado el siguiente arreglo de nombres, recórrelo usando un bucle for e imprime cada nombre en la consola.

    const nombres = ["Ana", "Juan", "Luis", "María"];

    for (/* tu código aquí */) {
        console.log(/* tu código aquí */);
    }
🚀 Extra: Hazlo con un while.

🔹 2. forEach
📌 Ejercicio:
Usa forEach para recorrer el siguiente arreglo e imprimir cada número multiplicado por 2.

    const numeros = [2, 4, 6, 8];

    numeros.forEach(/* tu código aquí */);


🔹 3. map
📌 Ejercicio:
Dado el siguiente arreglo, usa map para crear un nuevo arreglo donde cada número se multiplique por 3.
    const numeros = [1, 2, 3, 4, 5];

    const resultado = numeros.map(/* tu código aquí */);
    console.log(resultado); // [3, 6, 9, 12, 15]

🔹 4. filter
📌 Ejercicio:
Filtra los números mayores o iguales a 10 del siguiente arreglo usando filter.
    const valores = [5, 10, 15, 2, 8, 20];

    const mayoresDiez = /* tu código aquí */;
    console.log(mayoresDiez); // [10, 15, 20]

🔹 5. reduce
📌 Ejercicio:
Usa reduce para obtener la suma total de los elementos del siguiente arreglo.

    const numeros = [1, 2, 3, 4, 5];

    const sumaTotal = /* tu código aquí */;
    console.log(sumaTotal); // 15

🔹 6. Buscar Elementos (find y some)
📌 Ejercicio:
Dado el siguiente arreglo de productos, usa find para buscar el producto con el nombre "Laptop".
Luego usa some para verificar si hay algún producto con precio mayor a 2000.

    const productos = [
        { nombre: "Celular", precio: 1500 },
        { nombre: "Laptop", precio: 3000 },
        { nombre: "Tablet", precio: 1200 }
    ];

    const productoEncontrado = /* tu código aquí */;
    console.log(productoEncontrado); // { nombre: "Laptop", precio: 3000 }

    const existeCaro = /* tu código aquí */;
    console.log(existeCaro); // true


🔹 7. Spread Syntax
📌 Ejercicio:
Combina los siguientes dos arreglos en uno solo usando el operador spread (...).

    const frutas = ["🍎", "🍌", "🍇"];
    const verduras = ["🥕", "🥦", "🌽"];

    const alimentos = /* tu código aquí */;
    console.log(alimentos); // ["🍎", "🍌", "🍇", "🥕", "🥦", "🌽"]
    🚀 Extra: Agrega un nuevo elemento "🍕" entre las frutas y verduras.

🔹 8. Rest Syntax
📌 Ejercicio:
Crea una función sumar que reciba cualquier cantidad de números como argumentos y los sume usando el operador rest (...).

    function sumar(/* tu código aquí */) {
        return /* tu código aquí */;
    }

    console.log(sumar(2, 4, 6)); // 12
    console.log(sumar(10, 20, 30, 40)); // 100


```