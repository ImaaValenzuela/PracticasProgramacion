let mensaje = "Ingrese un numero para ver su tabla de multiplicar del 1 al 10"

let numero = parseInt(prompt(mensaje))

for(let i = 1; i <= 10; i++ ){
    let resultado = numero * i
    let msj = `${numero} * ${i} = ${resultado}`
    alert(msj)
}

let i = 1;
while (i <= 10) {
    console.log(`${numero} * ${i} = ${numero * i}`);
    i++;
}

// Reiniciar i para el do-while
i = 1;
do {
    console.log(`${numero} * ${i} = ${numero * i}`);
    i++;
} while (i <= 10);