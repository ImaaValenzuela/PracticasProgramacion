import java.util.ArrayList;
import java.util.Scanner;

public class Integrador {
    static ArrayList<String> estudiantes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n📚 GESTOR DE ESTUDIANTES 📚");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Mostrar estudiantes en orden inverso");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    agregarEstudiante(sc);
                    break;
                case 2:
                    eliminarEstudiante(sc);
                    break;
                case 3:
                    mostrarEstudiantes();
                    break;
                case 4:
                    System.out.println("Estudiantes en orden inverso:");
                    mostrarInverso(estudiantes.size() - 1);
                    break;
                case 5:
                    System.out.println("👋 Saliendo...");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");

            }


        } while (opcion != 5);

        sc.close();

    }

    public static void agregarEstudiante(Scanner sc){
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        estudiantes.add(nombre);
        System.out.println("✅ Estudiante agregado.");
    }

    public static void eliminarEstudiante(Scanner sc){
        mostrarEstudiantes();
        System.out.println();
        System.out.print("Ingrese el nombre del estudiante a eliminar: ");
        String nombre = sc.nextLine();

        if(estudiantes.remove(nombre)){
            System.out.println("✅ Estudiante eliminado.");
        } else {
            System.out.println("❌ Estudiante no encontrado.");
        }
    }

    public static void mostrarEstudiantes(){
        if (estudiantes.isEmpty()){
            System.out.println("⚠ No hay estudiantes registrados.");
        } else {
            System.out.println("📋 Lista de estudiantes:");
            for (String estudiante : estudiantes){
                System.out.println("- " + estudiante);
            }
        }
    }

    public static void mostrarInverso(int index){
        if (index < 0) return;
        System.out.println("- " + estudiantes.get(index));
        mostrarInverso(index - 1);
    }
}
