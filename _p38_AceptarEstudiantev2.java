// Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado

import java.util.Scanner;

public class _p38_AceptarEstudiantev2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String nombre;
        Character sexo;
        int edad; double promedio;

        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Proceso de ingreso 'Universidad Kitty Kat SA'");
        System.out.println("Ingresa tu nombre: "); nombre = obj.nextLine();
        System.out.println("Ingresa tu sexo (h/m)");
        sexo = Character.toUpperCase(obj.next().charAt(0));
        System.out.println("Ingresa tu edad"); edad = obj.nextInt();
        System.out.println("Ingresa tres calificaciones separadas por un enter");
        promedio = obj.nextDouble(); promedio += obj.nextDouble();
        promedio += obj.nextDouble(); promedio /= 3;
        if (edad >= 21 && sexo == 'M' && promedio >= 8 && promedio <= 9.5)
            System.out.printf("Fuiste aceptada %s, Felicidades!", nombre);
        else 
            System.out.printf("Vaya.. %s Fuiste rechazado", nombre);
    }
}
