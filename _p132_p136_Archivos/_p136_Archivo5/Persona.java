package _p132_p136_Archivos._p136_Archivo5;

import java.io.Serializable;

public class Persona implements Serializable {
    String Nombre;
    int Edad;
    double Peso;
    String Correo;

    public Persona(String nombre, int edad, double peso, String correo) {
        Nombre = nombre;
        Edad = edad;
        Peso = peso;
        Correo = correo;
    }

    @Override
    public String toString() {
        return "Persona [Nombre=" + Nombre + ", Edad=" + Edad + ", Peso=" + Peso + ", Correo=" + Correo + "]";
    }
}
