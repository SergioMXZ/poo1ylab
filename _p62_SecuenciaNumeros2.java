// Imprime la secuencia de números mostrados el número de renglones que el usuario desee

import java.util.Scanner;

public class _p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        int n;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
            System.out.println("Imprime una secuencia de números en los renglones que decida");
            System.out.print("Cuantos renglones? ");
            n = obj.nextInt();
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=i; j++) {
                    System.out.print(j+" ");
                }
                System.out.println("");
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}
