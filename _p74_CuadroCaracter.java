//Imprime un cuadro r x c, del caracter especificado

import java.util.Scanner;

public class _p74_CuadroCaracter {
    public static void Dibujar_Cuadro(int r, int c, Character car) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c ; j++) {
                System.out.print(car + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int r, c;
        Character car;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprime un cuadro dados los renglones y columnas, del caracter especificado");
        System.out.print("Renglones ? "); r = obj.nextInt();
        System.out.print("\ncolumnas  ? "); c = obj.nextInt();
        System.out.print("\nDame el caracter? "); car = obj.next().charAt(0);
        System.out.println("\n-------------------------------------------\n");
        Dibujar_Cuadro(r, c, car); obj.close();
    }
}
