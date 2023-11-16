package _p145_EstudianteGUI_V1;

import java.io.Serializable;

public class Estudiante implements Serializable {
    String Nombre;
    int Edad;
    double Peso;
    String Correo;

    public Estudiante(String nombre, int edad, double peso, String correo) {
        Nombre = nombre;
        Edad = edad;
        Peso = peso;
        Correo = correo;
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

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}