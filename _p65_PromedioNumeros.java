// Calcular el promedio de 3 numeros, usando una funcion

import java.util.Scanner;

public class _p65_PromedioNumeros {

    public static float Promedio(float num1, float num2, float num3){
        float suma, prom;
        suma = num1 + num2 + num3;
        prom = suma/3;
        return prom;
    }
    public static void main(String[] args) {
        float n1, n2, n3, prom;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla
        System.out.print("Dame número 1 : "); n1 = obj.nextFloat();
        System.out.print("Dame número 2 : "); n2 = obj.nextFloat();
        System.out.print("Dame número 3 : "); n3 = obj.nextFloat();
        prom = Promedio(n1, n2, n3);
        System.out.printf("\nEl promedio de los nuemeros es %.2f", prom); 
    }
}
