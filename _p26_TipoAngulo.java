// Muestra el tipo de angulo según los grados

import java.util.Scanner;

public class _p26_TipoAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.print("Muestra el tipo de ángulo \n");
        System.out.println("Dame un ángulo entre 0 y 360 grados ? ");
        int angulo = new Scanner(System.in).nextInt();
        
        System.out.print("El ángulo que introdujiste: ");
        if( angulo >= 0 ){
            if( angulo < 90 )
                        System.out.println("Es agudo");
            if( angulo == 90 )
                        System.out.println("Es recto");
            if( angulo > 90 && angulo < 180 )
                        System.out.println("Es obtuso");
            if( angulo == 180 )
                        System.out.println("Es llano");
            if( angulo > 180 && angulo < 360 )
                        System.out.println("Es concavo");
            if( angulo == 360 )
                        System.out.println("Es completo");
        }
        else System.out.println("Ángulo invalido ...");

        System.out.println("\nProceso terminado ....");
    }
}
