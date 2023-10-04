// Tabla de multiplicar

import java.util.Scanner;

public class _p68_TablaMultiplicar {
    public static void Tabla(int t, int n) {
        System.out.printf("\nTabla del %d\n", t);
        for (int i = 1; i <= n; i++)
            System.out.printf("%d x %d = %d\n", t, i, t * i);
    }
    public static void main(String[] args) {
        int t, n;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla
        System.out.print("Que tabla quieres ? "); t = obj.nextInt();
        System.out.print("Hata donde la quieres ? "); n = obj.nextInt();
        Tabla(t, n);
    }
}
