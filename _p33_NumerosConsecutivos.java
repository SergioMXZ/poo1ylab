// Dados tres números enteros, verifica si son consecutivos

import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Dados tres números enteros, verifica si son consecuntivos\n");
        System.out.println("Dame los tres números (separados por un enter) ");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();
        if ( n2 == n1 + 1 && n3 == n2 + 1 ){
            System.out.printf("Los numeros (%d,%d,%d) son consecutivos", n1,n2,n3);
        } else System.out.printf("Los numeros (%d,%d,%d)\n ¡No son consecutivos! ...", n1,n2,n3);
    }
}