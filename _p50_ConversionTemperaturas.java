// Imprime de grados Centígrados a Farenheit con una tabla de valores

import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Character resp;
        int gradosI, gradosF;
        double faren;
        do {
            do {
                System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
                System.out.println("Imprime de grados Centigrados a Farenheit con una tabla");
                System.out.print("Dame La temperatura inicial en Centigrados: ");
                gradosI = obj.nextInt();
                System.out.print("\nDame La temperatura Final en Centigrados: ");
                gradosF = obj.nextInt();
            } while (gradosF < gradosI);
            System.out.println("------------------------------------");
            System.out.println("Centígrados Farenheit");
            System.out.println("------------------------------------");
            while (gradosF >= gradosI) {
                faren = (gradosI * 1.8) + 32;
                System.out.printf("%d %.2f\n", gradosI, faren);
                gradosI ++;
            }
            System.out.println("------------------------------------");
            System.out.print("\nDeseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
        // (temp * 9/5) + 32
    }
}
