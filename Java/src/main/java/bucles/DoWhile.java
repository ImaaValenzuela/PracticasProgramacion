package bucles;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        System.out.println("Número válido ingresado: " + numero);
        sc.close();
    }
}
