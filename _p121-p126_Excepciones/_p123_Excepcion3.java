package _p666_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _p123_Excepcion3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.print("Valor del numerador : ");
            int a = obj.nextInt();
            System.out.print("Valor del denominador : ");
            int b = obj.nextInt();
            int c = a / b;
            System.out.println("El resultado es " + c);
            obj.close();
        } catch (ArithmeticException e) {
            System.out.println("El denominador no puede ser 0");
        } catch (InputMismatchException e) {
            System.out.println("Numerador y Denominador deben ser números enteros");
        }
    }
}
