package _p111_CuentaBancariaV2;

public abstract class CuentaBancaria {
    protected double Saldo;

    public CuentaBancaria(double saldo) {
        Saldo = saldo;
    }

    public double getSaldo() {
        return Saldo;
    }
    public void deposito(double cantidad){
        Saldo += cantidad;
    }

    public abstract boolean retira(double cantidad);

    @Override
    public String toString() {
        return "CuentaBancaria [Saldo=" + Saldo + "]";
    }
}
