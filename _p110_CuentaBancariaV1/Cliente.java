package _p110_CuentaBancariaV1;

public class Cliente {
    private String Nombre;
    private CuentaBancaria Cuenta;
    
    public Cliente(String nombre, CuentaBancaria cuenta) {
        Nombre = nombre;
        Cuenta = cuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public CuentaBancaria getCuenta() {
        return Cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        Cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre=" + Nombre + ", Cuenta=" + Cuenta.getSaldo() + "]";
    }
    
    
}
