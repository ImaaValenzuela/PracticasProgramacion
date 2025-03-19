package funciones;

class Persona {
    String nombre;
}

public class ParametroReferencia {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Imanol";
        cambiarNombre(p);
        System.out.println("Nombre despues de la funcion: " + p.nombre); // Cambia porque se modifica el mismo objeto en memoria.
    }

    public static void cambiarNombre (Persona p){
        p.nombre = "Immannuel";
    }
}
