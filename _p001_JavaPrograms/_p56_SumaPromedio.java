// Suma y promedio de n calificaciones

import java.util.Scanner;

public class _p56_SumaPromedio {
    public static void main(String[] args) {
        int n;
        float cal, suma, prom;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
            suma = prom = 0;
            System.out.println("Suma y promedio de n calificaciones: \n");
            System.out.print("Cuantas calificaciones ? "); n = obj.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.printf("Calificacion %d ? ", i); cal = obj.nextFloat();
                suma += cal;
            }
            prom = suma / n;
            System.out.printf("\nSuma es %.2f y el promedio es %.2f\n\n", suma, prom);
            System.out.print("Deseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso Terminado ...");
    }
}
