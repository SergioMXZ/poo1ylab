// Imprime una piramide del caracter ingresado

import java.util.Scanner;

public class _p58_Piramide {
    public static void main(String[] args) {
        int i, j, n;
        char car, resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
            System.out.print("Cuantos renglones ? ");
            n = obj.nextInt();
            System.out.print("De que caracter ? ");
            car = obj.next().charAt(0);
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(car);
                }
                System.out.println();
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}
