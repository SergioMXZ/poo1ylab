// Se calcula el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo

import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla de la consola

        System.out.println("Calculando el 3er angulo del triangulo ... ");
        System.out.print("Dame  el primer angulo ? ");
        double angulo1 = new Scanner(System.in).nextDouble();
        System.out.print("Dame  el segundo angulo ? ");
        double angulo2 = new Scanner(System.in).nextDouble();
        double angulo3 = 180 - (angulo1 + angulo2);
        System.out.printf("El tercer angulo es igual a %.2f: ", angulo3);
    }
}
