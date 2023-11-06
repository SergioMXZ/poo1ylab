package _p666_Excepciones;

import java.io.File;
import java.util.Scanner;

public class _p126_Excepcion6 {
    public static void main(String[] args) {
        File nombres = new File("_p666_Excepciones/nombres.txt");
        try {
            Scanner obj = new Scanner(nombres);
            while (obj.hasNextLine())
                System.out.println(obj.nextLine());
        obj.close();
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo ..");
        }
    }
}
