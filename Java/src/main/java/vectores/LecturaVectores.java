package vectores;

import java.util.Scanner;

public class LecturaVectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[5];
        double suma = 0;


        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un número: ");
            vector[i] = sc.nextDouble();
            suma += vector[i];
        }

        double promedio = suma / vector.length;

        System.out.println("\nEl promedio de los números ingresados es: " + promedio);

        sc.close();
    }
}
