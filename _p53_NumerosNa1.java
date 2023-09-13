// Numeros de n a 1 con paso de p

import java.util.Scanner;

public class _p53_NumerosNa1 {
    public static void main(String[] args) {
        int n, p;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Numeros de n a 1 con paso de p:");
        System.out.print("Desde donde ? ");
        n = obj.nextInt();
        System.out.print("Paso ? ");
        p = obj.nextInt();
        for (int i = n; i >= 1; i -= p) {
            System.out.printf("%d ", i);
        }
    }
}
