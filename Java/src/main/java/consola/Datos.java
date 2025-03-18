package consola;

import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese su salario (en decimal): ");
        double salario = sc.nextDouble();

        System.out.printf("\nResumen:%nNombre: %s%nEdad: %d años%nSalario: $%.2f%n", nombre, edad, salario);
    }
}
