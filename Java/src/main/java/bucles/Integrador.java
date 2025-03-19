package bucles;

import java.util.Scanner;

public class Integrador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 3000;
        int opcion;

        do {
            System.out.println("\n🏦 CAJERO AUTOMÁTICO 🏦");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("💰 Saldo actual: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese cantidad a depositar: ");
                    double deposito = sc.nextDouble();

                    if (deposito > 0){
                        saldo += deposito;
                        System.out.println("✅ Depósito exitoso.");
                    } else {
                        System.out.println("❌ Monto inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese cantidad a retirar: ");
                    double retiro = sc.nextDouble();

                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("✅ Retiro exitoso.");
                    } else {
                        System.out.println("❌ Saldo insuficiente o monto inválido.");
                    }
                    break;
                case 4:
                    System.out.println("👋 Saliendo del cajero...");
                    break;
                default:
                    System.out.println("❌ Opción no válida.");
            }

        }while (opcion != 4);

        sc.close();
    }
}
