// Tablas de multiplicar desde 1 a n y cada tabla desde 1 hasta m

import java.util.Scanner;

public class _p57_TablasMultiplicar {
    public static void main(String[] args) {
        int i, j, n, m;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
            System.out.print("Hasta que tabla ? ");
            n = obj.nextInt();
            System.out.print("Hasta donde ? ");
            m = obj.nextInt();
            for (i = 1; i <= n; i++) {
                System.out.printf("Tabla del %d\n", i);
                for (j = 1; j <= m; j++) {
                    System.out.printf("%d x %d = %d\n", i, j, i * j);
                }
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}