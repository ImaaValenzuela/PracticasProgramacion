package clases.vehiculos;

public class Moto {
    private String modelo;
    private String marca;
    private int cilindrada;

    public Moto(String modelo, String marca, int cilindrada) {
        this.modelo = modelo;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    public void obtenerDatos(){
        System.out.println("Marca: " + marca +"\nModelo: " + modelo + "\nCilindrada: " + cilindrada);
    }
}
