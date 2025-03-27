package vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ClaseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];

        Arrays.fill(vector, 5);
        System.out.println("Vector despues de llenarlo con 5: " + Arrays.toString(vector));

        System.out.println("Ingrese 10 numeros naturales para llenar el vector: ");
        for (int i = 0; i < vector.length; i++){
            vector[i] = sc.nextInt();
        }

        Arrays.sort(vector);
        System.out.println("Vector ordenado de manera ascendente: " + Arrays.toString(vector));

        System.out.println("Ingrese el numero que desea buscar en el vector: ");
        int numeroBuscado = sc.nextInt();
        int posicion = Arrays.binarySearch(vector, numeroBuscado);

        if (posicion >= 0) {
            System.out.println("El número " + numeroBuscado + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El número " + numeroBuscado + " no está en el vector.");
        }

        sc.close();

    }
}
