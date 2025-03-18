package condiciones;

import java.util.Scanner;

public class IfAnidado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");

        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Su numero es positivo");
        } else if (numero < 0) {
            System.out.println("Su numero es negativo");
        } else
            System.out.println("Su numero es 0");

    }
}
