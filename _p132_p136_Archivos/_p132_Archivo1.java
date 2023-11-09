package _p132_p136_Archivos;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _p132_Archivo1 {
    public static void main(String[] args) {
        File arch = new File("_p132_p136_Archivos/datos.txt");
        System.out.println("Nombre archivo : " + arch.getName());
        System.out.println("Es directorio : " + arch.isDirectory());
        System.out.println("Ruta relativa : " + arch.getPath());
        System.out.println("Ruta absoluta : " + arch.getAbsolutePath());
        if (arch.exists()) {
            System.out.println("El archivo existe !!");
            System.out.println("Se puede leer : " + arch.canRead());
            System.out.println("Se puede escribir : " + arch.canWrite());
            System.out.println("Longitud archivo : " + arch.length());
            /* Esto es para poder interpretar el arch.lastModified()
             * que nos devuelve la ultima modificacion en segundos, el date toma esto
             * y nos devuelve la fecha y el simpledateformat le da el formato de
             * dia/mes/año hora:minutos:segundos */
            // --------------------------------------------------------------
            Date ultimaModificacion = new Date(arch.lastModified());
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String fecha = formato.format(ultimaModificacion);
            // --------------------------------------------------------------
            System.out.println("Ultima modificacion : " + fecha);
        } else
            System.out.println("El archivo no existe !!");
    }
}