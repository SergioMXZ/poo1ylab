// Convierte grados centigrados a farenheit y viceversa

import java.util.Scanner;

public class _p23_ConvertirTemperatura {
    public static void main(String[] args) {
        char op;
        float temp, res;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Convirte de centigrados a farenheit y viceversa\n");
        System.out.println("[F] arenheit a Centigrados");
        System.out.println("[C] entigrados a Farenheit");

        System.out.println("Elije una opcion ? ");
        op = Character.toUpperCase(obj.next().charAt(0));

        if ( op == 'F'){
            System.out.println("Dame la temperatura en Farenheit ? ");
            temp = obj.nextFloat();
            res = (temp - 32) * 5/9 ;
            System.out.printf("\n %f grados farenheit equivale a %f grados centigrados", temp, res);
        }
        else if (op == 'C'){
            System.out.println("Dame la temperatura en Centigrados ? ");
            temp = obj.nextFloat();
            res = (temp * 9/5) + 32 ;
            System.out.printf("\n %f grados centigrados equivale a %f grados farenheit", temp, res);
        }
        else System.out.println("Opcion Invalida ");

        System.out.println("\nGracias por utilizar este programa  ");
    }
}