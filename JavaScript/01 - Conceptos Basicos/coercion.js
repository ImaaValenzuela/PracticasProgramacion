console.log('5' + 2);   // Se concatenan, es decir, une los dos datos como un unico string
console.log('5' - 2);  // En este caso, realiza la resta sin problemas. Creo que la concatenacion sucede porque por defecto JS interpeta el + como union
console.log(10 + true);  // Suma un numero, creo que se debe al valor binario que toma un booleano, en este caso "true" equivale a 1
console.log(10 + false);  // Caso contrario al anteriro, "false" es igual a 0
console.log('10' == 10);  // La existencia del estrictamente igual hace que sea posible comparar string y numeros con el igual
console.log('10' === 10); // Aca compara si son ESTRICTAMENTE iguales