// Dado un nuemro entre 1 y 7 imprime el dia de la semana

import java.util.Scanner;

public class _p76_DiaSemana {
    public static void Dia_semana(int dia) {
         switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
         }
    }
    public static void main(String[] args) {
        int diasem;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
            System.out.println("Dado un número entre 1 y 7 imprime el día de la semana");
            System.out.print("Dame el día con número? "); diasem = obj.nextInt();
        } while (diasem < 1 || diasem > 8);
        Dia_semana(diasem);
        System.out.println("\n\nProceso terminado ..."); obj.close();
    }
}
