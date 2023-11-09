package _p132_p136_Archivos._p136_Archivo5;

import java.io.*;
import java.util.ArrayList;

public class App {
    public static void serializarDatos(String archivo, ArrayList<Persona> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    public static ArrayList<Persona> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Persona> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Persona>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos Perez", 22, 85.5, "cperez@gmail.com"));
        personas.add(new Persona("Maria Lopez", 15, 34.56, "mlopez@msn.com"));
        personas.add(new Persona("Maria Lopez", 15, 34.56, "mlopez@msn.com"));
        try {
            serializarDatos("_p132_p136_Archivos/_p136_Archivo5/datos.dat", personas);
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo: " + e);
        }
        try {
            ArrayList<Persona> laspersonas = desSerializarDatos("_p132_p136_Archivos/_p136_Archivo5/datos.dat");
            System.out.println("Los datos leidos del archivo son:");
            laspersonas.forEach(p -> System.out.println(p));
            System.out.println("Total personas" + laspersonas.size());
        } catch (Exception e) {
            System.out.println("Problemas al preocesar el archivo.." + e);
        }
    }
}
