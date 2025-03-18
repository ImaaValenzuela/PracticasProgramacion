package condiciones;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        if(numero > 0) System.out.println("Su numero es positivo");

        if (numero < 0) System.out.println("Su numero es negativo");

        sc.close();
    }
}
