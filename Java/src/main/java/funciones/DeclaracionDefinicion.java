package funciones;

public class DeclaracionDefinicion {
    public static void main(String[] args) {
        int num = 7;
        if(esPrimo(num)){
            System.out.println(num + " es primo");
        } else System.out.println(num + " no es primo");
    }

    public static boolean esPrimo (int n){
        if(n <= 1){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
