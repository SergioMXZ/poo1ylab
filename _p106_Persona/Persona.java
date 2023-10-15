package _p106_Persona;

public class Persona {
    protected String Nombre;
    protected String Direccion;

    public Persona() {
    }

    public Persona(String nombre, String direccion) {
        Nombre = nombre;
        Direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", Direccion=" + Direccion;
    }
}
