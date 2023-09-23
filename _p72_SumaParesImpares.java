// Imprime pares o impares y su suma

import java.util.Scanner;

public class _p72_SumaParesImpares {
    public static int SumaParImpar(int ini, int fin, char pi) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (pi == 'P' && i % 2 == 0) {
                System.out.println("Pares");
                System.out.printf("%d ", i);
                suma += i;
            } else if (pi == 'I' && i % 2 != 0) {
                System.out.println("Impares");
                System.out.printf("%d ", i);
                suma += i;
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        int ini, fin, suma;
        char poi;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        do {
            System.out.print("Valor incial ? "); ini = obj.nextInt();
            System.out.print("Valor final ? "); fin = obj.nextInt();
        } while (ini > fin);
        do {
            System.out.print("\n[P]ares \n[I]Impares ? ");
            poi = Character.toUpperCase(obj.next().charAt(0));
        } while (poi!='P' && poi!='I');

        suma = poi == 'P' ? SumaParImpar(ini, fin, 'P') : SumaParImpar(ini, fin, 'I');
        System.out.printf("\nLa suma es : %d", suma); obj.close();
    }
}
