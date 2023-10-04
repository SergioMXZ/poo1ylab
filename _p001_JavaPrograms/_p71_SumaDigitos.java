// Suma los digitos individuales de un numero entero, usando una funcion

import java.util.Scanner;

public class _p71_SumaDigitos {
    public static int SumaDigitos(int num){
        int dig = 0, suma = 0;
        while (num!=0) {
            dig = num%10;
            suma = suma + dig;
            num = num/10; 
        }
        return suma;
    }
    public static void main(String[] args) {
        int num = 0;
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Dame un numero entero ?");
        num = new Scanner(System.in).nextInt();
        System.out.printf("\nLa suma de los digitos es %d", SumaDigitos(num));
    }
}
