// Imprime la secuencia de términos, número de renglones que el usuario desee y su suma

import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int n;
        Long suma;
        String stg;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
            System.out.println("Imprime una secuencia de términos, número de renglones y su suma");
            System.out.print("Cuántos términos? ");
            n = obj.nextInt(); suma = 0l; stg = "";
            for (int i = 1; i <= n; i++) {
                stg = "";
                for (int j = 1; j <= i; j++) {
                    System.out.print("1");
                    stg += "1";
                }
                if (i!=n) System.out.print("+");
                suma += Long.valueOf(stg);
            }
            System.out.printf("\nSuma: "+suma);
            System.out.print("\nDeseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}
