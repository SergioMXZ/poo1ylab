// Imprime los números de cualquier numero con cualquier paso
// hasta el numero mas cercano a 1 usando ciclo while

import java.util.Scanner;

public class _p40_Numeros100a1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        int c, n, paso;
        System.out.println("Hasta donde ? "); n = new Scanner(System.in).nextInt();
        System.out.println("Con que paso ? "); paso = new Scanner(System.in).nextInt();
        System.out.println("----------------------");
        c = n;
        while (c >= paso) {
            System.out.print(c + " ");
            c -= paso;
        }
        System.out.println("Ciclo terminado ");
        System.out.println(c);
    }
}
