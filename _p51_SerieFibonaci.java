// Imprime los primeros n numero de la serie se Fibbonaci

import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Character resp;
        int numMax, c1, c2, c3;
        do {
            c1 = 1; c2 = 1; c3 = 0;
            do {
                System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
                System.out.println("Imprime los primeros n numero de la serie se Fibbonaci");
                System.out.print("Ingrese el valor maximo: ");
                numMax = obj.nextInt();
            } while (numMax <= 0);
            System.out.print("La sucesion Fibbonaci es:\n 0 1 ");
            while (numMax >= c1) {
                System.out.printf("%d ",c1);
                c3 = c1;
                c1 = c1 + c2;
                c2 = c3;
            }
            System.out.print("\nDeseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
