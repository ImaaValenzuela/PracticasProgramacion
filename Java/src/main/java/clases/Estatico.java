package clases;

class Calculadora{

    public static int sumar(int a, int b){
        return a + b;
    }
}

public class Estatico {
    public static void main(String[] args) {

        int resultado = Calculadora.sumar(5, 7); // Llamada sin instanciar la clase
        System.out.println("La suma es: " + resultado);
    }
}
