package consola;

public class Especificadores {
    public static void main(String[] args) {
        double precio = 1234.5678;
        int cantidad  = 5;

        System.out.printf("Precio con dos decimales: %.2f%n", precio);
        System.out.printf("Precio en notacion cientifica: %.3e%n", precio);
        System.out.printf("Cantidad con relleno de ceros: %05d%n", cantidad);
    }
}
