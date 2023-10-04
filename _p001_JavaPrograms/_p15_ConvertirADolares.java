// Dada una cantidad en pesos y la cotización del dólar, se obtiene el equivalente en dólares

import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla de la consola
        
        System.out.println("Calculando el equivalente en dólares ... ");
        System.out.print("Dame la cantidad en pesos    ? ");
        double pesos = new Scanner(System.in).nextDouble();
        System.out.print("Dame la cotización del dólar (ejemplo 17 pesos cada dolar)? ");
        double cotizacion = new Scanner(System.in).nextDouble();
        double dolares = pesos / cotizacion;

        System.out.printf("La cantidad  de %.2f pesos\n", pesos);
        System.out.printf("Con una cotizacion del dólar de %.2f pesos cada dolar\n", cotizacion);
        System.out.printf("Es igual a %.2f dólares", dolares);
    }
}
