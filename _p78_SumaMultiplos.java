// Recibe el inicio y fin de un rango en el que sumara los multiplos de una numero ingresado

import java.util.Scanner;

public class _p78_SumaMultiplos {
    public static int Multiplos(int ini, int fin, int multiplo) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % multiplo == 0) suma += i;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ini, fin, multiplo;
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Recibe el inicio y final de un rango en el que se van");
        System.out.println("a sumar todos los multiplos de un numero ingresado ...");
        do {
            System.out.println("Dame el inicio : "); ini = obj.nextInt();
            System.out.println("Dame el fin : "); fin = obj.nextInt();
        } while (ini >= fin);
        System.out.println("Dame el multiplo"); multiplo = obj.nextInt();
        int suma = Multiplos(ini, fin, multiplo);
        System.out.printf("La suma de los multiplos dentro del rango es %d", suma);
        obj.close();
    }
}
