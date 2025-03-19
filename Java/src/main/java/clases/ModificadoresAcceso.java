package clases;

class CuentaBancaria{
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar (double monto){
        if (monto < 1) {
            System.out.println("Saldo invalido");
            return saldo;
        }

        saldo = saldo + monto;

        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 1){
            System.out.println("Saldo invalido");
            return; // Detiene la ejecucion y no actualiza el saldo
        }
        this.saldo = saldo;
    }
}

public class ModificadoresAcceso {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        cuenta.depositar(-10);

        System.out.println(cuenta.getSaldo());

        cuenta.setSaldo(-10);

        System.out.println("Setteando saldo...\n" + cuenta.getSaldo());

    }
}
