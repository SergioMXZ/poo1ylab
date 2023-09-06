// Cuenta los numeros: postivos, negativos y ceros, hasta introducir el numero 999

import java.util.Scanner;

public class _p43_ConteoNumeros {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        int n,c,s,cp,cn,cc;
        Scanner obj = new Scanner(System.in);
        c=s=cp=cn=cc=0;

        System.out.println("Cuenta números: postivos, negativos, ceros, hasta introducir 999");
        do {
        System.out.print("Dame un numero ? "); n = obj.nextInt();
        if( n != 999) {
        c++;
        s = s + n;
        if(n>0) cp++;
        else if(n<0) cn++;
        else cc++;
        }
        } while(n!=999);
        System.out.println("\nCaptura terminada\n-----------------");
        System.out.println("\nResumen:");
        System.out.printf("Introdujiste %d numeros \n",c);
        System.out.printf("La suma de los numeros es : %d \n",s);
        System.out.printf("Los positivos fueron : %d \n", cp);
        System.out.printf("Los negativos fueron : %d \n", cn);
        System.out.printf("Los ceros fueron : %d \n", cc);
        System.out.println("\nProceso terminado ...");
    }
}
