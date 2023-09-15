// Factorial de n numeros

import java.util.Scanner;

public class _p59_FactorialNumeros {
    public static void main(String[] args) {
        int i, j, n, f;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
            System.out.print("Cuantos números ? ");
            n = obj.nextInt();
            for (i = 1; i <= n; i++) {
                System.out.printf("%d!=", i);
                f = 1;
                for (j = 1; j <= i; j++) {
                    f *= j;
                }
                System.out.println(f);
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}
