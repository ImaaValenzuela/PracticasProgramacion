package conceptosbasicos;

import java.util.Scanner;

public class Integrador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        final int ANIO_ACTUAL = 2025;
        int anioNacimiento = ANIO_ACTUAL - edad;

        boolean esMayor = edad >= 18;
        double alturaEnCM = altura * 100;

        System.out.println("\n--- Información del usuario ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros (" + alturaEnCM + " cm)");
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("Es mayor de edad: " + esMayor);

        sc.close();
    }
}
