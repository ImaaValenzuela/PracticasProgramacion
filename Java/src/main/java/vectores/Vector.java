package vectores;

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Object[] vector = new Object[5]; // Es un vector que puede recibir cualquier tipo de dato

        System.out.println("Ingrese 5 valores (pueden ser enteros, decimales o texto):");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Elemento " + (i + 1) + ": ");
            if (sc.hasNextInt()){
                vector[i] = sc.nextInt();
            } else if (sc.hasNextDouble()) {
                vector[i] = sc.hasNextDouble();
            } else {
                vector[i] = sc.next();
            }
        }

        System.out.println("\nContenido del vector:");
        for (Object valor : vector){
            System.out.println("Tipo " + valor.getClass().getSimpleName() + " - Valor: " + valor);
        }

        sc.close();
    }
}
