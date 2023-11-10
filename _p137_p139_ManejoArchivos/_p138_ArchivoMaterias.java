package _p137_p139_ManejoArchivos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _p138_ArchivoMaterias {
    public static void leerDatos(ArrayList<String> datos) {
        Scanner obj = new Scanner(System.in);
        String dato = "";
        System.out.println("Introduce las materias cursadas");
        System.out.println("Introduce un dato o presiona <Enter> a linea vacia para terminar");
        while (true) {
            dato = obj.nextLine();
            if (!dato.isEmpty())
                datos.add(dato);
            else break;
        }
        obj.close();
    }
    public static void main(String[] args) {
        ArrayList<String> materias = new ArrayList<>();
        leerDatos(materias);
        String archivo = "_p137_p139_ManejoArchivos/materias.txt";
        File arch = new File(archivo);
        try {
            System.out.println("Escribiendo...");
            BufferedWriter fmaterias = new BufferedWriter(new FileWriter(arch));
            for (String materia : materias)
                fmaterias.write(materia + "\n");
            fmaterias.close();
            System.out.println("Los Datos han sido escritos...");
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo..");
            System.out.println(e);
        }
        try {
            System.out.println("Leyendo...\nDatos:\n");
            BufferedReader fmateias = new BufferedReader(new FileReader(arch));
            String linea;
            while((linea=fmateias.readLine())!=null)
                System.out.println(linea);
            fmateias.close();
        } catch (Exception e) {
            System.out.println("Problemas al intentar leer el archivo...");
            System.out.println(e);
        }
    }
}
