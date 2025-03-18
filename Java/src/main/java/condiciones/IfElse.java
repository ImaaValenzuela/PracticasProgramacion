package condiciones;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("El numero es par");
        } else System.out.println("El numero es impar");


    }
}
