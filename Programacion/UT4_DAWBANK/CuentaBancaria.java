package UT4_DAWBANK;

public class CuentaBancaria {

    String iban;
    String titular;
    double saldo = 0;
    int movimientos_max = 100;

    public CuentaBancaria(String iban, String titular) {

        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
