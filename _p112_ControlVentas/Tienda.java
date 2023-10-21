import java.util.ArrayList;

public class Tienda {
    private String Nombre;
    private String Proprietario;
    private String Domicilio;
    private ArrayList<Cliente> clientes;
    public Tienda() {
        clientes = new ArrayList<>();
    }

    public Tienda(String nombre, String proprietario, String domicilio) {
        this();
        Nombre = nombre;
        Proprietario = proprietario;
        Domicilio = domicilio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario(String proprietario) {
        Proprietario = proprietario;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public double getTotal() {
        double Total = 0.00;
        for (Cliente cliente : clientes) {
            Total += cliente.getTotal();;
        }
        return Total;
    }

    public void Reporte() {
        System.out.println("\n\nReporte de ventas de los clientes : " + this.toString());
        for (Cliente cliente : clientes) {
            System.out.println("\n>>> " + cliente);
            for (Venta venta : cliente.getVentas()) {
                System.out.println("    " + venta);
            }
        }
    }

    @Override
    public String toString() {
        return "Tienda [Nombre=" + Nombre + ", Proprietario=" + Proprietario + ", Domicilio=" + Domicilio
                + ", clientes=" + clientes.size() + ", Total= " + this.getTotal() + "]";
    }
}
