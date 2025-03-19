package funciones;

public class Ambito {
    static int global = 10;

    public static void main(String[] args) {
        int local = 5;
        System.out.println("Variable local: " + local);
        System.out.println("Variable global: " + global);
        mostrarGlobal();
    }

    public static void mostrarGlobal(){
        System.out.println("Accediendo a la variable global desde una funcion: " + global);
    }
}
