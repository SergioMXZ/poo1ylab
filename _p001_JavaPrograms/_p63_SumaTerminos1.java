// Imprime la secuencia de términos armónicos el número de renglones que el usuario desee y su suma

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int n;
        double suma;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
            System.out.println("Imprime una secuencia de términos armónicos y su suma");
            System.out.print("Cuántos términos? ");
            n = obj.nextInt(); suma = 0;
            for (double i = 1; i <= n; i++) {
                System.out.printf("1/%d", Math.round(i));
                if (i!= n) System.out.print("+");
                suma += 1/i;
            }
            System.out.printf("\nSuma: %f", suma);
            System.out.print("\nDeseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}
