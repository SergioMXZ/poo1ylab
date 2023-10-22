package _p111_CuentaBancariaV2;

import java.util.ArrayList;

public class Banco {
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;
    public Banco() {
        Clientes = new ArrayList<>();
    }
    public Banco(String nombre, String domicilio) {
        this();
        Nombre = nombre;
        Domicilio = domicilio;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDomicilio() {
        return Domicilio;
    }
    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }
    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }
    public void agregarClientes(Cliente cliente) {
        Clientes.add(cliente);
    }
    private double getTotal()
    {
        double total = 0;
        for (Cliente cliente : Clientes) {
            total += cliente.getTotal();
        }
        return total;
    }
    public void calcularInteres()
    {
        for (Cliente cliente : Clientes) {
            for (CuentaBancaria cuenta : cliente.getCuentas()) {
                if (cuenta instanceof CuentaDeAhorro)
                    ((CuentaDeAhorro)cuenta).CalcularInteres();
            }
        }
    }
    public void reporte() {
        System.out.println(this + "\n");
        for (Cliente cliente : Clientes) {
            System.out.println("> " + cliente);
            for (CuentaBancaria cuenta : cliente.getCuentas()) 
                System.out.println(cuenta);
        }
        System.out.println("\n");
    }
    @Override
    public String toString() {
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Clientes=" + Clientes.size() + ", Total=" + getTotal() +"]";
    }
}
