package funciones;

public class Return {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        int mayor = esMayor(num1, num2);

        System.out.println(mayor);
    }

    public static int esMayor(int a, int b){
        return (a > b) ? a : b;
    }
}
