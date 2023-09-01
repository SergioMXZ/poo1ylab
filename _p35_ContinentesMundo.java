// Dado un numero entero entre 1 y 6 que corresponde a cada continente, lo escribe

import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla

        System.out.println("Dado un numero entre 1 y 6");
        System.out.println("Correspondiente a cada continente, lo escribe");
        System.out.print("Escribe un numero? "); num = obj.nextInt();
        switch (num) {
            case 1: System.out.println("Asia");break;
            case 2: System.out.println("África");break;
            case 3: System.out.println("América del Norte");break;
            case 4: System.out.println("América del Sur");break;
            case 5: System.out.println("Antártida");break;
            case 6: System.out.println("Europa");break;
            default: System.out.println("Error, valor invalido");
                break;
        }
    }
}
