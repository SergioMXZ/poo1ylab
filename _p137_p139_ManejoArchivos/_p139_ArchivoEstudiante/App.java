package _p137_p139_ManejoArchivos._p139_ArchivoEstudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void calculaTodo(ArrayList<Estudiante> estudiantes) {
        double cali=0; double edad=0; int hombres=0; int mujeres=0;
        for (Estudiante estudiante : estudiantes) {
            cali += estudiante.Promedio;
            edad += estudiante.Edad;
            if (estudiante.Sexo == 'H') {
                hombres ++;
            } else {
                mujeres ++;
            }
        }
        System.out.println("Promedio de las calificaciones: " + cali);
        System.out.println("Promedio de las edades: " + edad);
        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
    }

    public static void introEstudiantes(ArrayList<Estudiante> estudiantes) {
        Scanner obj = new Scanner(System.in);
        Character opcion;
        do {
            String Nombre; int Edad; Double Promedio; Character Sexo;
            System.out.println("\nIngresa los datos del estudiante");
            System.out.print("Nombre: "); Nombre = obj.next();
            System.out.print("Edad: "); Edad = obj.nextInt();
            System.out.print("Promedio: "); Promedio = obj.nextDouble();
            System.out.print("Sexo: "); Sexo = Character.toUpperCase(obj.next().charAt(0));
            estudiantes.add(new Estudiante(Nombre, Edad, Promedio, Sexo));
            System.out.println("Quieres continuar ? [S]i , [N]o");
            opcion = Character.toUpperCase(obj.next().charAt(0));
        } while (opcion != 'N');
        obj.close();
    }
    public static void serializarDatos(String archivo, ArrayList<Estudiante> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream festudiantes = new ObjectOutputStream(arch);
        festudiantes.writeObject(datos);
        festudiantes.close();
    }

    public static ArrayList<Estudiante> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Estudiante> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream festudiantes = new ObjectInputStream(arch);
        datos = (ArrayList<Estudiante>) festudiantes.readObject();
        festudiantes.close();
        return datos;
    }

    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        introEstudiantes(estudiantes);
        String archivo = "_p137_p139_ManejoArchivos/_p139_ArchivoEstudiante/datos.dat";
        try {
            serializarDatos(archivo, estudiantes);
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo: " + e);
        }
        try {
            ArrayList<Estudiante> losEstudiantes = desSerializarDatos(archivo);
            System.out.println("Los datos leidos del archivo son:");
            losEstudiantes.forEach(p -> System.out.println(p));
            System.out.println("Total de Estudiantes " + losEstudiantes.size());
        } catch (Exception e) {
            System.out.println("Problemas al preocesar el archivo.." + e);
        }
        calculaTodo(estudiantes);
    }
}
