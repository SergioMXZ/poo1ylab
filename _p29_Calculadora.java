// Efectua la operación matematica elegida entre dos números

import java.util.Scanner;

public class _p29_Calculadora {
    public static void main(String[] args) {
        double n1, n2;
        char op;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Efectua la operación matemática elegida entre dos números ");
        System.out.print("Dame numero 1 ? "); n1 = obj.nextDouble();
        System.out.print("Dame numero 2 ? "); n2 = obj.nextDouble();
        System.out.print("Operacion ( + - * / ^ ) ?  "); op = obj.next().charAt(0);
        switch (op) {
            case '+':
                System.out.printf("n1 + n2 = %.2f", n1 + n2);
                break;
            case '-':
                System.out.printf("n1 - n2 = %.2f", n1 - n2);
                break;
            case '*':
                System.out.printf("n1 * n2 = %.2f", n1 * n2);
                break;
            case '/':
                System.out.printf("n1 / n2 = %.2f", n1 / n2);
                break;
            case '^':
                System.out.printf("n1 ^ n2 = %.2f", Math.pow(n1, n2));
                break;
            default:
                System.out.printf("\nOperación Invalida ...");
                break;
        }
        System.out.println("\n\nProceso terminado ...");
    }
}