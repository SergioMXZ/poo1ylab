// Imprime los números pares desde 100 hasta n

import java.util.Scanner;

public class _p49_ParesDescendente {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n, c, suma;
        float prom;
        Character resp;

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush(); // Limpia la Pantalla
            System.out.println("Imprime los números pares de forma descendente de 100 asta n");
            do {
                System.out.print("Hasta donde ?");
                n = obj.nextInt();
            } while (n > 100);
            suma = 0;
            prom = 0f;
            c = 100;
            System.out.printf("\nNúmeros pares entre 100 y %d: ", n);
            while (c >= n) {
                if (c % 2 == 0) {
                    System.out.printf("%d ", c);
                    suma += c; c -= 1; prom +=1;
                }
                c -= 1;
            }
            System.out.printf("\nLa suma: %d\nEl promedio: %.2f ",suma,suma/prom);
            System.out.print("\nDeseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
