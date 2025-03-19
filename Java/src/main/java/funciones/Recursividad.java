package funciones;

public class Recursividad {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial de " + num + " es: " + factorial(num));
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }

        return n * factorial(n - 1);
    }
}
