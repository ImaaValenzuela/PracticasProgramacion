// ¿Por qué num no cambia fuera de la función? No cambia dentro de la funcion porque se pasa por valor, es decir, se copia el objeto, n es igual a 100 solo dentro de la funcion. Los primitivos se copian.
// ¿Por qué persona sí cambia después de pasar por la función? Porque persona es un objeto que se pasa por referencia, la funcion recibe la referencia al objeto original y se modifica al objeto directamente desde memoria.

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

    console.log(num);      // ❓ ¿Qué imprime? 50
    console.log(persona);  // ❓ ¿Qué imprime? Carlos