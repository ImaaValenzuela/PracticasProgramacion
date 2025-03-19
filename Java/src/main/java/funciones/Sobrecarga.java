package funciones;

public class Sobrecarga {
    public static void main(String[] args) {
        System.out.println(sumar(4,7));
        System.out.println(sumar(4.7, 5.32));
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static double sumar(double a, double b){
        return  a + b;
    }
}
