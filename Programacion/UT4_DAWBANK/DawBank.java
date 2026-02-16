package UT4_DAWBANK;

import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDO, PARA CREAR SU CUENTA INTRODUZCA LOS SIGUIENTES DATOS:");
        System.out.println("IBAN: ");
        String iban = teclado.nextLine();
        System.out.println("TITULAR: ");
        String titular = teclado.nextLine();

        CuentaBancaria cuenta1 = new CuentaBancaria(iban, titular);

        System.out.println("Bienvenido " + titular + " al menu principal");
        System.out.println("\n 1. Datos de la cuenta \n 2. IBAN \n 3. Titular \n 4. Saldo \n 5. Ingreso \n 6. Retirada \n 7. Movimientos \n 8. Salir");
        int respuesta = teclado.nextInt();

        while (respuesta == 1) {
            System.out.println( "IBAN: " + cuenta1.getIban() + "Titular: " + cuenta1.getTitular() + "\n Saldo: "+ cuenta1.getSaldo());

        }



    }
}
