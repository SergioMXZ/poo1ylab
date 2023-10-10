package _p096_Empleado03;

public class Empleado {
    private String Nombre;
    private int Edad;

    public Empleado() { // ctor
    }
    public Empleado(String nombre, int edad ) {
        this.Nombre = nombre; // Nombre = nombre
        this.Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    
    @Override // no necesaria // ctrl .
    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + "]";
    }
}
