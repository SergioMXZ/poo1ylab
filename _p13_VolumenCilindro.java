// Calcular el volumen de un cilindro dado su radio y altura

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla de la consola

        System.out.println("Calculando el volumen de un cilindro ... ");
        System.out.print("Dame  el radio ? ");
        double radio = new Scanner(System.in).nextDouble();
        System.out.print("Dame  la altura ? ");
        double altura = new Scanner(System.in).nextDouble();
        double volumen = Math.PI * (Math.pow(radio, 2) * altura);
        System.out.printf("El volumen es igual a %.2f: ", volumen);
    }
}
