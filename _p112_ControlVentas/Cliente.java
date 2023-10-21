
import java.util.ArrayList;

public class Cliente {
    private String Nombre;
    private String Domicilio;
    private String Correo;
    private ArrayList<Venta> Ventas;
    public Cliente() {
        Ventas = new ArrayList<>();
    }
    public Cliente(String nombre, String domicilio, String correo) {
        this();
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
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

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public ArrayList<Venta> getVentas() {
        return Ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.Ventas = ventas;
    }

    public double getTotal() {
        double Total = 0.00;
        for (Venta venta : Ventas) {
            Total += venta.getTotalVenta();
        }
        return Total;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre= " + Nombre + ", Domicilio= " + Domicilio + ", Correo= " + Correo + ", Ventas= " +
            Ventas.size() + ", Total= " + getTotal() +"]";
    }
    
}
