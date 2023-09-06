// Imprime los números del 1 al cualquier numero y paso usando ciclo while

import java.util.Scanner;

public class _p39_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        int c, n, paso;
        System.out.println("Hasta donde ? "); n = new Scanner(System.in).nextInt();
        System.out.println("Con que paso ? "); paso = new Scanner(System.in).nextInt();
        System.out.println("----------------------");
        c = paso;
        while (c <= n) {
            System.out.print(c + " ");
            c += paso;
        }
        System.out.println("Ciclo terminado ");
        System.out.println(c);
    }
}