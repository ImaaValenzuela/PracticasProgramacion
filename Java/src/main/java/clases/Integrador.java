package clases;

import java.util.ArrayList;
import java.util.Scanner;

class Libro{
    String titulo;
    String autor;
    Boolean disponible;

    public Libro(String autor, String titulo) {
        this.autor = autor;
        this.disponible = true;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaDisponible(){
        return disponible;
    }

    public void prestar(){
        if (disponible){
            disponible = false;
            System.out.println("📖 Libro prestado: " + titulo);
        } else {
            System.out.println("❌ El libro ya está prestado.");
        }
    }

    public void devolver(){
        disponible = true;
        System.out.println("✅ Libro devuelto: " + titulo);
    }

    public void mostrarInfo(){
        System.out.println("📚 " + titulo + " - " + autor + " | " + (disponible ? "Disponible" : "Prestado"));
    }
}

public class Integrador {
    static ArrayList<Libro> libros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n📚 GESTIÓN DE BIBLIOTECA");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Mostrar Libros");
            System.out.println("3. Prestar Libro");
            System.out.println("4. Devolver Libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    mostrarLibros();
                    break;
                case 3:
                    prestarLibro();
                    break;
                case 4:
                    devolverLibro();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 5);
    }

    public static void agregarLibro(){
        System.out.print("Ingrese el título del libro: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = sc.nextLine();
        libros.add(new Libro(titulo, autor));
        System.out.println("✅ Libro agregado.");
    }

    public static void mostrarLibros(){
        if (libros.isEmpty()){
            System.out.println("⚠ No hay libros en la biblioteca.");
        } else{
            System.out.println("\n📋 Lista de Libros:");
            for (Libro l : libros){
                l.mostrarInfo();
            }
        }
    }

    public static void prestarLibro(){
        
        mostrarLibros();
        System.out.print("Ingrese el título del libro a prestar: ");
        String libro = sc.nextLine();

        for (Libro l : libros){
            if (l.getTitulo().equalsIgnoreCase(libro)){
                l.prestar();
                return;
            }
        }

        System.out.println("❌ Libro no encontrado.");
    }

    public static void devolverLibro(){

        mostrarLibros();
        System.out.print("Ingrese el título del libro a devolver: ");
        String libro = sc.nextLine();

        for (Libro l : libros){
            if (l.getTitulo().equalsIgnoreCase(libro)){
                l.devolver();
                return;
            }
        }

        System.out.println("❌ Libro no encontrado.");
    }


}
