// Imprime numeros impares decendente

import java.util.Scanner;

public class _p45_ImparesDescendente {
    public static void main(String[] args) {
        int n, c, s;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
            System.out.println("Imprime números impares descendente...\n");
            System.out.print("Desde donde ? ");
            n = obj.nextInt();
            s = 0;
            c = (n % 2 == 0 ? --n : n);
            while (c >= 1) {
                System.out.printf("%d ", c);
                s += c;
                c -= 2;
            }
            System.out.printf("\nLa suma es %d", s);
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
