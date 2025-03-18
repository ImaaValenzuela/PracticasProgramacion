package conceptosbasicos;

public class Operadores {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int suma = a + b;
        boolean esMayor = a > b;
        boolean resultado = (a > b) && (b < 10);

        System.out.println("Suma: " + suma);
        System.out.println("¿A es mayor que B?: " + esMayor);
        System.out.println("¿A es mayor que B y B es menor que 10?: " + resultado);
    }
}
