/*Lleva el control de la inscripción de los participantes y el dinero
recaudado de un curso de técnicas avanzadas de programación */

import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void Mensaje_final(int total) {
        if (total < 100) System.out.print("El evento concluye con ganancias Bajas");
        if (total > 100 && total < 200) System.out.print("El evento concluye con ganancias MODERADAS");
        if (total > 200) System.out.print("El evento concluye con BUENAS ganancias");
    }
    public static void main(String[] args) {
        String nombre;
        int edad=19, hombres=0, mujeres=0, total=0;
        Character sexo, resp, tipoPart='A'; //(Alumno, Docente, Trabajador)
        int alumnos=0, docentes=0, trabajadores=0, participantes=0, promedioEdad=0;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
            System.out.println("Lleva el control de la inscripción de los participantes y el dinero\r\n" + //
                    "recaudado de un curso de técnicas avanzadas de programación");
            if (edad < 18) {
                System.out.println("Error, Solo aceptamos mayores de edad");
            }
            tipoPart='z'; sexo='H';
            System.out.println("Participantes: " + participantes);
            System.out.print("Nombre ? "); nombre = obj.next();
            System.out.print("\nEdad ? "); edad = obj.nextInt();
            do {
                if (sexo != 'H'&&sexo != 'M') System.out.print("Incorrecto vuelve a ingresarlo");
                System.out.print("\nCual es tu Sexo ? ");
                sexo = Character.toUpperCase(obj.next().charAt(0));
            } while (sexo != 'H'&&sexo != 'M');
            do {
                System.out.println("Elige que eres\n[A]lumno ?\n[D]ocente ?\n[T]rabajador");
                tipoPart = Character.toUpperCase(obj.next().charAt(0));
            } while (tipoPart!='A'&&tipoPart!='D'&&tipoPart!='T' );
            if (edad >= 18){
                promedioEdad += edad;
                participantes ++;
                switch (sexo) {
                    case 'H': hombres ++; break;
                    case 'M': mujeres ++; break;
                }
                switch (tipoPart) {
                    case 'A': alumnos ++; break;
                    case 'D': docentes ++; break;
                    case 'T': trabajadores ++; break;
                }
            }
            System.out.print("Continuar ? [S]i / [N]o ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (edad < 18 || resp != 'N' );
        System.out.println("Total de Alumnos: " + alumnos);
        System.out.println("Total de Docentes: " + docentes);
        System.out.println("Total de Trabajadores: " + trabajadores);
        System.out.println("Total de Hombres en general: " + hombres);
        System.out.println("Total de Mujeres en general: " + mujeres);
        System.out.println("Total de todos los participantes: " + participantes);
        System.out.println("Total dinero recaudado de Alumnos: " + alumnos*50);
        System.out.println("Total dinero recaudado de Docentes: " + docentes*80);
        System.out.println("Total dinero recaudado de Trabajadores: " + trabajadores*60);
        total = (alumnos*50)+(docentes*80)+(trabajadores*60);
        System.out.println("Total dinero en general: " + total);
        Mensaje_final(total);
    }
}