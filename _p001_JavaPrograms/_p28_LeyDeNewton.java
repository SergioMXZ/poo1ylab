// Calcula fuerza, masa y aceleración de acuerdo a la segunda ley de newton

import java.util.Scanner;

public class _p28_LeyDeNewton {
    public static void main(String[] args) {
        float f, m, a;
        char op;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Calcula la segunda ley de newton");

        System.out.println("[F]uerza ( f=m*a ) ");
        System.out.println("[M]asa ( m=f/a ) ");
        System.out.println("[A]celeración ( a=f/m ) ");
        System.out.print("Elije una opción ? ");
        op = Character.toUpperCase(obj.next().charAt(0));

        f = m = a = 0;
        if ( op == 'F'){
            System.out.println("\nCalculando la Fuerza ...");
            System.out.print("Masa ? "); m = obj.nextFloat();
            System.out.print("Aceleración ? "); a = obj.nextFloat();
            f = m * a;
            System.out.printf("\nFuerza: %.2f", f);
        } else if ( op == 'M'){
            System.out.println("\nCalculando la Masa ...");
            System.out.print("Fuerza ? "); f = obj.nextFloat();
            System.out.print("Aceleración ? "); a = obj.nextFloat();
            m = f / a;
            System.out.printf("\nMasa: %.2f", m);
        } else if ( op == 'A'){
            System.out.println("\nCalculando la Aceleración ...");
            System.out.print("Fuerza ? "); f = obj.nextFloat();
            System.out.print("Masa ? "); m = obj.nextFloat();
            a = f / m;
            System.out.printf("\nAceleración: %.2f", a);
        } else
        System.out.println("\nOpcion Invalida \n");
    }
}
