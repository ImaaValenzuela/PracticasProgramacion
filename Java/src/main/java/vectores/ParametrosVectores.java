package vectores;

import java.util.Scanner;

public class ParametrosVectores {

    public static int sumaElementos (int[] vector){
        int suma = 0;
        for (int num : vector){
            suma += num;
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del vector: ");
        int n = sc.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un número: ");
            vector[i] = sc.nextInt();
        }

        int resultado = sumaElementos(vector);
        System.out.println("\nLa suma de los elementos del vector es: " + resultado);

        sc.close();
    }

}
