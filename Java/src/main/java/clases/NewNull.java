package clases;

public class NewNull {
    public static void main(String[] args) {
        Coche coche = null;
        // coche.mostrarInfo(); -> Null Pointer Exception

        if (coche != null){
            coche.mostrarInfo();
        } else System.out.println("El coche no ha sido inicializado");

        coche = new Coche("Mercedes", "A250", 120);
        coche.mostrarInfo();

    }
}
