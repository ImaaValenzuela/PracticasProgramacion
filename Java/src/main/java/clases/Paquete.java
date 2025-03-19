package clases;

import clases.vehiculos.Moto;

public class Paquete {
    public static void main(String[] args) {
        Moto moto = new Moto("Motomel", "Blitz", 110);
        moto.obtenerDatos();
    }
}
