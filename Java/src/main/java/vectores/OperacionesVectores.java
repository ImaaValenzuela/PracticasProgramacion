package vectores;

import java.util.Arrays;
import java.util.Scanner;

public class OperacionesVectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];

        System.out.println("Valor por defecto del vector: " + Arrays.toString(vector));

        System.out.print("Ingrese un numero para agregarlo en la ultima posicion: ");
        int ultimoElemento = sc.nextInt();
        vector[vector.length -1] = ultimoElemento;
        System.out.println("Vector luego de la insercion: " + Arrays.toString(vector));

        System.out.println("Elementos del vector: ");
        for (int i = 0; i < vector.length; i++){
            System.out.println("Posicion " + i + ": " + vector[i]);
        }

        System.out.println("Ingrese el numero que desea buscar en el vector: ");
        int numeroBuscado = sc.nextInt();
        int posicion = Arrays.binarySearch(vector, numeroBuscado);

        if (posicion >= 0) {
            System.out.println("El número " + numeroBuscado + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El número " + numeroBuscado + " no está en el vector.");
        }


        Arrays.sort(vector);
        System.out.println("Vector ordenado de manera ascendente: " + Arrays.toString(vector));

        int [] copiaVector = Arrays.copyOf(vector, vector.length);
        System.out.print("Ingrese el indice del elemento que desea borrar (0-9): ");
        int indiceBorrar = sc.nextInt();
        if(indiceBorrar >= 0 && indiceBorrar < copiaVector.length){
            copiaVector[indiceBorrar] = 0;
            System.out.println("Vector después de eliminar el elemento en la posición " + indiceBorrar + ": " + Arrays.toString(copiaVector));
        } else {
            System.out.println("Índice fuera de rango.");
        }

        sc.close();

    }
}
