package _p121_p126_Excepciones;


import java.util.InputMismatchException;
import java.util.Scanner;

public class _p124_Excepcion4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.print("Valor del numerador : ");
            int a = obj.nextInt();
            System.out.print("Valor del denominador : ");
            int b = obj.nextInt();
            int c = a / b;
            System.out.println("El resultado es " + c);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Los valores debe ser numéricos y el denominador diferente de 0");
            System.out.println("Mensaje del sistema: " + e);
        }
        obj.close();
    }
}
