package _p110_CuentaBancariaV1;

import java.util.ArrayList;

public class Banco {
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;
    public Banco() 
    {
        Clientes = new ArrayList<>();
    }
    public Banco(String nombre, String domicilio) {
        this(); //llama al constructor vacio
        Nombre = nombre;
        Domicilio = domicilio;
    }
    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }
    public void agregarCliente(Cliente cliente) {
        Clientes.add(cliente);
    }
    @Override
    public String toString() {
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Clientes=" + Clientes.size() + "]";
    }
}
