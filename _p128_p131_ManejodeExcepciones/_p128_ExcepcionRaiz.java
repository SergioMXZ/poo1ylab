package _p128_p131_ManejodeExcepciones;

import java.util.Scanner;

public class _p128_ExcepcionRaiz {
    public static void main(String[] args) {
                Scanner obj = new Scanner(System.in);
        double a = 0;
        boolean b = true;
        try {
            System.out.print("Introduce un número: ");
            a = Math.sqrt(obj.nextInt());
        } catch (Exception e) {
            System.out.println("Error no puedo calcular la raíz cuadrada");
            b = false;
        }
        if (b)
            System.out.println(a);
        obj.close();
    }
}
