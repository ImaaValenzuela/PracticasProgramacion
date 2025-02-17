let mensaje  = "Ingrese un numero del 1 al 7 y le dire a que dia corresponde"

let dia = parseInt(prompt(mensaje))

if (dia == 1){
    console.log(`${dia} es equivalente a LUNES`);
} else if( dia == 2) {
    console.log(`${dia} es equivalente a MARTES`);
} else if ( dia == 3){
    console.log(`${dia} es equivalente a MIERCOLES`);
} else if ( dia == 4) {
    console.log(`${dia} es equivalente a JUEVES`);
} else if ( dia == 5 ) {
    console.log(`${dia} es equivalente a VIERNES`);
}  else if ( dia == 6 ) {
    console.log(`${dia} es equivalente a SABADO`);
}  else if ( dia == 7 ) {
    console.log(`${dia} es equivalente a DOMINGO`);
} else console.log("El numero ingresado no corresponde a ningun dia.")

switch (dia) {
    case 1:
        dia = "Lunes"
        break
    case 2:
        dia = "Martes"
        break
    case 3:
        dia = "Miercoles"
        break
    case 4:
        dia = "Jueves"
        break
    case 5:
        dia = "Viernes"
        break
    case 6:
        dia = "Sabado"
        break
    case 7:
        dia = "Domingo"
        break
    default:
        dia = null
        break
}
