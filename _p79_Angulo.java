/* Diseña un programa con una función que reciba como 
parámetro un ángulo entre 0 y 360 grados, y regrese una
palabra con el tipo de ángulo, en base a lo siguiente:
• < 90 agudo,
• = 90 recto,
• >90 y <180 obtuso,
• = 180 llano,
• > 180 y < 360 concavo
Nota:
• Antes de llamar a la función deberá validar 
que el ángulo es válido (0 a 360). */

import java.util.Scanner;

public class _p79_Angulo {
    public static String Tipo_Angulo(int angulo) {
        String tipo = "";
        if (angulo < 90) tipo = "Agudo";
        else if (angulo == 90) tipo = "Recto";    
        else if (angulo > 90 && angulo < 180) tipo = "Obtuso";
        else if (angulo == 180) tipo = "Llano";
        else if (angulo >180 && angulo < 360) tipo = "Concavo";
        else if (angulo == 360 ) tipo = "Completo";
        return tipo;
    }
    public static void main(String[] args) {
        int angulo;
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Indica el tipo de angulo que fue ingresado");
        do {
            System.out.print("Dame el angulo? ");
            angulo = new Scanner(System.in).nextInt();
        } while (angulo < 0 || angulo > 360);
        System.out.printf("\nEl angulo %d es %s", angulo, Tipo_Angulo(angulo));
    }
}
