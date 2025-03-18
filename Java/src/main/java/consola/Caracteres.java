package consola;

import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un caracter: ");
        char caracter = sc.next().charAt(0); // con el charAt solo leo el primer caracter

        System.out.println("Caracter ingresado: " + caracter);
        System.out.println("Codigo ASCII: " + (int) caracter); // Casteo

        sc.close();
    }
}
