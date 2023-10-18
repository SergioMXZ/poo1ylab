public class CuentaDeAhorro extends CuentaBancaria {
    private double TasaInteres;

    public CuentaDeAhorro(double saldo, double tasaInteres) {
        super(saldo);
        TasaInteres = tasaInteres;
    }

    public void CalcularInteres()
    {
        Saldo += TasaInteres;
    }
    @Override
    public boolean retira(double cantidad) {
        if (Saldo >= cantidad)
        {
            Saldo -= cantidad;
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro ["+ super.toString() +"TasaInteres=" + TasaInteres + "]";
    }   
}
