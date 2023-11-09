package _p132_p136_Archivos;
// leer datos en un archivo de texto
import java.io.BufferedReader;
import java.io.*;

public class _p134_Archivo3 {
    public static void main(String[] args) {
        File arch = new File("_p132_p136_Archivos/nombres.txt");
        if (!arch.exists())
            System.out.println("El archivo no existe !");
        else {
            try {
                BufferedReader fnombres = new BufferedReader(new FileReader(arch));
                String linea;
                while ((linea = fnombres.readLine()) != null)
                    System.out.println(linea);
                fnombres.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo..");
                System.out.println(e);
            }
        }
        System.out.println("Longitud final el archivo escrito " + arch.length());
    }
}