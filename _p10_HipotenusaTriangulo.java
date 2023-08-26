// Calcula la Hipotenusa de un Triángulo Rectángulo Dadas las Longitudes de sus Lados

import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla de la consola

        System.out.print("Calculando la Hipotenusa ... \n");
        System.out.print("Dame la longitud del lado 1 ? \n");
        double long1 = new Scanner(System.in).nextDouble();
        System.out.print("Dame la longitud del lado 2 ? \n");
        double long2 = new Scanner(System.in).nextDouble();
        double hipo = Math.sqrt(Math.pow(long1, 2) + Math.pow(long2, 2));

        System.out.printf("La Hipotenusa es igual a : %.2f", hipo);
    }
}
