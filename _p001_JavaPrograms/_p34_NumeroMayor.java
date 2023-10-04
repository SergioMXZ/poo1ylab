// Dado tres números enteros, verificar cual es el mayor

import java.util.Scanner;

public class _p34_NumeroMayor {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Dados tres números enteros, verifica cual es el mayor\n");
        System.out.println("Dame los tres números (separados por un enter) ");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();
        if (n1>n2 && n1>n3) System.out.printf("%d es mayor a %d y %d", n1,n2,n3);
        else if (n2>n1 && n2>n3) System.out.printf("%d es mayor a %d y %d", n2,n1,n3);
        else if (n3>n1 && n3>n2) System.out.printf("%d es mayor a %d y %d", n3,n1,n2);
        else
            System.out.println("Ninguno es mayor por si a los otros"); 
    }
}
