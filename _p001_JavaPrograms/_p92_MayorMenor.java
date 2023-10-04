/*Elaborar un programa que:
• Permita al usuario capturar n números en un arreglo de números enteros.
• Muestre los elementos del arreglo
• Encuentre cuál es el número mayor dentro del arreglo y lo muestre
• Encuentre cuál es el número menor dentro del arreglo y lo muestre */

import java.util.Scanner;

public class _p92_MayorMenor {
    public static void main(String[] args) {
        int n, mayor, menor;
        int [] numeros;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla
        System.out.println("\nDetermina el numero mayor y menor de todos los numeros ingresados...");
        System.out.println("Cuantas numeros va a ingresar? ");
        n = obj.nextInt(); numeros = new int[n];
        System.out.println("Ingrese los numeros:");
        for (int i = 0; i < n; i++) {
            System.out.print("\nNumero " + (i+1) +": ");
            numeros[i] = obj.nextInt();
        }
        System.out.println("\nNumeros ingresados:");
        mayor = numeros[0]; menor = numeros[0];
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
            mayor =  mayor<numeros[i] ? numeros[i] : mayor;
            menor =  menor>numeros[i] ? numeros[i] : menor;
        }
        System.out.print("\nEl numero Mayor es: " + mayor);
        System.out.print("\nEl numero Menor es: " + menor);
        obj.close();
    }
}
