package _p137_p139_ManejoArchivos;

import java.io.*;

public class _p137_ArchivoDeportes {
    public static void main(String[] args) {
        String[] deportes = { "Fútbol", "Béisbol", "Ciclismo", "Atletismo", "Natación", "Motociclismo"};
        File arch = new File("_p137_p139_ManejoArchivos/deportes.txt");
        if (arch.exists())
            System.out.println("El archivo ya existe !");
        else {
            try {
                System.out.println("Escribiendo...");
                BufferedWriter fdeportes = new BufferedWriter(new FileWriter(arch));
                for (String deporte : deportes)
                    fdeportes.write(deporte + "\n");
                fdeportes.close();
                System.out.println("Los Datos han sido escritos...");
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo..");
                System.out.println(e);
            }
        }
        try {
            System.out.println("Leyendo...\nDatos:");
            BufferedReader fdeportes = new BufferedReader(new FileReader(arch));
            String linea;
            while((linea=fdeportes.readLine())!=null)
                System.out.println(linea);
            fdeportes.close();
        } catch (Exception e) {
            System.out.println("Problemas al intentar leer el archivo...");
            System.out.println(e);
        }
    }
}
