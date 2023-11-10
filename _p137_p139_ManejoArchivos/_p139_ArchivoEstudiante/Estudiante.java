package _p137_p139_ManejoArchivos._p139_ArchivoEstudiante;

import java.io.Serializable;

public class Estudiante implements Serializable{
    String Nombre;
    int Edad;
    double Promedio;
    Character Sexo;

    public Estudiante(String nombre, int edad, double promedio, Character sexo) {
        Nombre = nombre;
        Edad = edad;
        Promedio = promedio;
        Sexo = sexo;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + Nombre + ", Edad=" + Edad + ", Promedio=" + Promedio +
         ", Sexo=" + ((Sexo == 'H')?"Hombre":"Mujer") + "]";
    }
}
