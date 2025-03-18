package condiciones;

import java.util.Scanner;

public class Integrador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bienvenido, para saber si tiene descuento por favor ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ahora ingrese el dia de la funcion (1 - 7, siendo 1 lunes y 7 domingo): ");
        int numeroDia = sc.nextInt();

        if(edad < 18 ){
                if (numeroDia == 3) { // Miércoles
                    System.out.println("¡Tienes promoción de cine!");
                } else {
                    System.out.println("No hay promoción disponible para menores hoy.");
                }
        } else if(edad >= 18){
            switch (numeroDia){
                case 5:
                case 6:
                    System.out.println("¡Tienes promoción de cine!");
                    break;
                default:
                    System.out.println("No hay promoción disponible para adultos hoy.");
            }
        }
    }
}
