package funciones;

public class ParametroValor {
    public static void main(String[] args) {
        int numero = 10;
        duplicarValor(numero);
        System.out.println("Valor modificado: " + numero); // No se modifica porque el valor se copia, esto sucede con todos los primitivos.
    }

    public static void duplicarValor (int x){
        x = x * 2;
    }
}
