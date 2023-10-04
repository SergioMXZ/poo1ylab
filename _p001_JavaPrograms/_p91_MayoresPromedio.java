/*Elaborar un programa que: 
• Permita al usuario capturar n calificaciones en un arreglo de números flotantes.
• Muestre los elementos del arreglo
• Calcule y muestre la suma y el promedio de los elementos del arreglo
• Muestre solo aquellos elementos mayores al promedio y cuente cuantos son */

import java.util.Scanner;

public class _p91_MayoresPromedio {
    public static void main(String[] args) {
        int n;
        float suma=0, promedio;
        float [] calificaciones;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla
        System.out.println("\nCalcula la suma, promedio y calificaicones mayores a este...");
        System.out.println("Cuantas calificaciones vas a ingresar? ");
        n = obj.nextInt(); calificaciones = new float[n];

        System.out.print("Ingresa las calificaciones:\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("Calificacion %d de %d: ", i+1, n);
            calificaciones[i] = obj.nextFloat();
        }
        System.out.println("\nEstas son las calificaciones:");
        for (int i = 0; i < n; i++) {
            System.out.print(calificaciones[i] + " ");
            suma += calificaciones[i];
        }
        promedio = suma / n;
        System.out.printf("\nEsta es la suma: %.2f y este el promedio: %.2f\n", suma, promedio);
        System.out.println("\nEstas son las calificaciones mayores al promedio");
        suma = 0;
        for (float f : calificaciones) {
            if (f > promedio) {
                System.out.print(f + " ");
                suma ++;
            }
        }
        System.out.printf("\nEn total son %.0f calificaciones mayores al promedio\n", suma);
        obj.close();
    }
}
