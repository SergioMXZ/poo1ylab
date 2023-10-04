// Imprime la tabla de multiplicar que el usuario pida, desde 1 hasta n

import java.util.Scanner;

public class _p42_TablaMultiplicar {
    public static void main(String[] args) {
        int tabla, n, c;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Imprimir la tabla deseada de 1 a n");
        System.out.print("Que tabla quieres ? "); tabla = obj.nextInt();
        System.out.print("Hasta donde ? "); n = obj.nextInt();
        System.out.printf("\nTabla %d\n", tabla);
        c = 1;
        while (c <= n ) {
            System.out.printf("%d x %d = %d\n", tabla, c, tabla*c);
            c++; 
        }
        System.out.println("\nProceso terminado ...");
    }
}
