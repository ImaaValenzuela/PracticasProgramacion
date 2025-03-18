package conceptosbasicos;

public class Conversion {
    public static void main(String[] args) {
        int numero = 100;
        double convertido = numero; // Conversion implicita debido a que Double posee mayor almacenamiento que int, lo que permite que un valor entero se convierta en double sin pérdida de información.
        int truncado = (int) 3.14; // Conversion explicita (Casteo), esto es posible, permitiendo que un flotante, en este caso, pase a entero, pero comoo consecuencia se pierde informacion.

        System.out.println("Número convertido a double: " + convertido);
        System.out.println("Número truncado: " + truncado);
    }
}
