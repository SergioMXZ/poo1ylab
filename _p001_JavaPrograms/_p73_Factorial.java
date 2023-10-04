// Calcula e imprime el factorial de un número

import java.util.Scanner;

public class _p73_Factorial {
    public static double Factorial(int n1) {
        double n2 = 1;
        for (int i = 1; i <= n1; i++) {
            n2 *= i;
        }
        return n2;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calcula el numero de un numero factorial");
        System.out.print("Dame un numero ? ");
        int num = new Scanner(System.in).nextInt();
        System.out.printf("\nEl factorial de %d es %.0f", num, Factorial(num));
    }
}
