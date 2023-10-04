/*Elaborar un programa que
• Declare dos arreglos de números enteros de una cantidad MAX 100 (a[MAX], b[MAX])
• Rellene el arreglo a[] con números aleatorios entre 0 y 20
• Muestre elementos del arreglo
• Muestre solo los elementos que son pares y los cuente
• Muestre solo los elementos que son impares y los cuente
• Muestre la cuenta de pares
• Muestre la cuenta de impares */

import java.util.Random;

public class _p93_ParesImpares {
    public static void main(String[] args) {
        int MAX = 100;
        int pares=0, impares=0;
        int [] a = new int[MAX];
        int [] b = new int[MAX];
        Random rnd = new Random();
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla
        System.out.println("Muestra de una lista de numeros aleatorios y cuales son pares e impares...");
        System.out.println("\nNumeros aleatorios:");
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(21);
            System.out.print(a[i] + " ");
            if (i == 49) System.out.println();
        }
        System.out.println("\n\nNumeros pares:");
        for (int i = 0; i < b.length; i++) {
            if(a[i]%2==0) {
                b[i] = a[i]; a[i] = 0; pares ++;
                System.out.print(b[i] + " ");
            }
            if (i == 49) System.out.println();
        }
        System.out.println("\nEn total son "+ pares +" numeros pares");
        System.out.println("\nNumeros impares:");
        for (int i = 0; i < b.length; i++) {
            if(a[i]!=0) {
                impares ++; System.out.print(a[i] + " ");
            }
            if (i == 49) System.out.println();
        }
        System.out.println("\nEn total son "+ impares +" numeros impares");
    }
}
