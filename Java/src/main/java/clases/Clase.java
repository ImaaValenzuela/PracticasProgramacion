package clases;

class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche (String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public void acelerar(){
        velocidad += 10;
        System.out.println("Acelerando...");
    }

    public void frenar(){
        velocidad -= 10;
        System.out.println("Frenando...");
    }

    public void mostrarInfo(){
        System.out.println("Coche: " + modelo + "\nMarca: " + marca + "\nVelocidad: " + velocidad);
    }

    public void mostrarVelocidad(){
        System.out.println("Velocidad actual: " + velocidad);
    }

}

public class Clase {
    public static void main(String[] args) {
        Coche coche = new Coche("Chevrolet", "Cruze", 40);
        coche.mostrarInfo();

        for (int i = 1; i < 5; i++) {
            coche.acelerar();
        }

        coche.mostrarVelocidad();

        coche.frenar();
        coche.mostrarVelocidad();
    }
}
