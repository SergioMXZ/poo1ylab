// Calcula el promedio de 5 calificaciones

import java.util.Scanner;

public class _p37_CalculoNotas {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double promedio;

        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Calcula el promedio de 5 calificaciones ...");
        System.out.println("Dame las calificaciones separadas por un enter:");
        promedio = obj.nextDouble(); promedio += obj.nextDouble();
        promedio += obj.nextDouble(); promedio += obj.nextDouble();
        promedio += obj.nextDouble(); promedio /= 5;
        if (promedio > 0 && promedio <= 6)
            System.out.printf("%.2f Quedas reprobado", promedio);
        else if (promedio > 6 && promedio <= 7)
            System.out.printf("%.2f Pasas de panzazo", promedio);
        else if (promedio > 7 && promedio <= 8)
            System.out.printf("%.2f Muy bien, puedes mejorar", promedio);
        else if (promedio > 8 && promedio <= 9)
            System.out.printf("%.2f Exelente sigue así", promedio);
        else if (promedio > 9 && promedio <= 10)
            System.out.printf("%.2f Perfecto tu esfuerzo valió la pena", promedio);
        else
            System.out.println("Valor invalido");
    }
}
