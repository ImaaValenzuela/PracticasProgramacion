package clases;

class Persona{

    public Persona (){
        System.out.println("Persona creada");
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Persona eliminada por el garbage collector");
    }
}

public class Garbage {
    public static void main(String[] args) {
        new Persona(); // No las almacenamos en variables asi que esto se deberia eliminar en algun momento, no de manera inmediata.
        new Persona();
        new Persona();

        System.gc(); // Sugiere al gc ejecutar limpieza pero no la obliga

        System.out.println("Fin del programa");
    }
}
