package _p121_p126_Excepciones;


import java.util.Scanner;

public class _p122_Excepcion2 {
    public static void main(String[] args) {
        try {
            System.out.print("Dame un valor : ");
            Scanner obj = new Scanner(System.in);
            int val = obj.nextInt();
            val = val + 5;
            System.out.println("El nuevo valor es " + val);
            obj.close();
        } catch (Exception e) {
            System.out.println("Debes introducir un número");
        }
    }
}
