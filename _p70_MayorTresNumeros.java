// Calcula e imprime el mayor de tres numeros, usando una funcion

import java.util.Scanner;

public class _p70_MayorTresNumeros {

    public static int Mayor(int n1, int n2, int n3){
        int may=0;
        if ( n1>n2 && n1>n3 ) may = n1;
        else if ( n2>n1 && n2>n3 ) may = n2;
        else if ( n3>n1 && n3>n2 ) may = n3;
        return may;
    }
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Dame tres numeros enteros separados por espacio");
        n1 = obj.nextInt(); n2 = obj.nextInt(); n3 = obj.nextInt(); obj.close();
        System.out.printf("\nEl mayor es %d", Mayor(n1, n2, n3));
    }
}