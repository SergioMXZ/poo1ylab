package _p132_p136_Archivos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _p135_Archivo4 {
    public static void leerDatos(ArrayList<String> datos) {
        String dato = "";
        System.out.println("Introduce un dato presiona <Enter> dato vacio para terminar> ");
        while (true) {
            dato = new Scanner(System.in).nextLine();
            if (!dato.isEmpty())
                datos.add(dato);
            else break;
        }
        
    }

    public static void grabarArchivo(String archivo, ArrayList<String> datos) throws IOException {
        BufferedWriter fdatos = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String dato : datos)
            fdatos.write(dato + "\n");
        fdatos.close();
    }

    public static ArrayList<String> leerArchivo(String archivo) throws IOException {
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato;
        while ((dato = fdatos.readLine()) != null)
            datos.add(dato);
        fdatos.close();
        return datos;
    }

    public static void main(String[] args) {
        String archivo = "_p132_p136_Archivos/datos.txt";
        ArrayList<String> nombres = new ArrayList<>(), losnombres = new ArrayList<>();
        leerDatos(nombres);
        try {
            grabarArchivo(archivo, nombres);
            losnombres = leerArchivo(archivo);
            System.out.println("Datos capturados: ");
            losnombres.forEach(n -> System.out.println(n));
        } catch (Exception e) {
            System.out.println("Error al procesar el archivo: " + e);
        }
    }
}
