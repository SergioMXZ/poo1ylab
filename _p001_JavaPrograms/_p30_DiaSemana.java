// Dado un nuemro entre 1 y 7 imprime el dia de la semana

import java.util.Scanner;

public class _p30_DiaSemana {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Dado un número entre 1 y 7 imprime el día de la semana");
        System.out.print("Dame el día con número? ");
        int dia = new Scanner(System.in).nextInt();

        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Día inválido, en que días vives !!!"); break;
        }
        System.out.println("\n\nProceso terminado ...");
    }
}
