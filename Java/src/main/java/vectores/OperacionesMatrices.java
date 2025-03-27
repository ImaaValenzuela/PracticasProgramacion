package vectores;

import java.util.Random;

public class OperacionesMatrices {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        Random ran = new Random();

        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = ran.nextInt(50) + 1;
                suma += matriz[i][j];
                if(matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }

            }
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSuma de los elementos de la matriz: " + suma);
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}
