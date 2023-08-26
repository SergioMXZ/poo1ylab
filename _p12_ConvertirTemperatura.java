// Convierte una temperatura de grados fahrenheit a grados celsius

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla de la consola
        
        System.out.println("Convirtiendo grados fahrenheit a grados celsius ... ");
        System.out.print("Dame  los grados en fahrenheit ? ");
        double gradosF = new Scanner(System.in).nextDouble();
        double gradosC = (gradosF - 32) * 0.55555;
        System.out.printf("Los %.2f° grados fahrenheit son igual a %.2f° grados celsius.", gradosF ,gradosC);
    }
}
