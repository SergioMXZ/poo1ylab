package _p147_TercerExamenParcial;

import java.io.Serializable;

public class Jugador implements Serializable {
    String Nombre;
    int Edad;
    Character Sexo;
    String EstadoCivil;
    String Descripcion;
    Double Salario;

    public Jugador() {}

    public Jugador(String nombre, int edad, Character sexo, String estadoCivil, String descripcion, Double salario) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        EstadoCivil = estadoCivil;
        Descripcion = descripcion;
        Salario = salario;
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

    public Character getSexo() {
        return Sexo;
    }

    public void setSexo(Character sexo) {
        Sexo = sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }
}
