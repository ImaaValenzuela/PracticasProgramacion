package bucles;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero para mostrar su tabla de multiplicar: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + ": " + (numero * i));
        }

        sc.close();
    }
}
