// Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos

import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla de la consola
        
        System.out.println("Calculando horas a dias, minutos y segundos ... ");
        System.out.print("Dame las horas ? ");
        double horas = new Scanner(System.in).nextDouble();
        double dias = horas / 24; double minutos = horas * 60; double segundos = horas * 3600;
        System.out.printf("La cantidad de %.2f horas es igula a:\n", horas);
        System.out.printf("Dias: %.2f \nMinutos: %.2f \nSegundos: %.2f", dias, minutos, segundos);
    }
}
