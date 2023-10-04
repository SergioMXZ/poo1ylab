package _p95_Empleado02;

public class Empleado {
    private String Nombre;
    private int Edad;

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

    @Override // no necesaria
    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + "]";
        // return String.format("Nombre: %s, Edad: %d",Nombre,Edad);
    }

}
