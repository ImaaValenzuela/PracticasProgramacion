package vectores;

import java.util.Random;

public class ClasificacionVectores {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vector = new int[10];
        int pares = 0, impares = 0;

        System.out.println("Generando numeros aleatorios...");

        for (int i = 0; i < vector.length; i++){
            vector[i] = random.nextInt(100) + 1;
            if (vector[i] % 2 == 0){
                pares++;
            } else impares++;

        }

        System.out.println("Números generados:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
