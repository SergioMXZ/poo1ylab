// Procesa n calificaciones, calcula e imprime la suma y el promedio

import java.util.Scanner;

public class _p41_ProcesaCalificaciones {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        int n,c;
        float cal,suma, prom;
        Scanner obj = new Scanner(System.in);
        cal=suma=prom=0;

        System.out.println("Procesa n calificaciones, calcula la suma y el promedio");
        System.out.print("Cuantas calificaciones ? ");
        n = obj.nextInt();
        c = 1;
        while( c <= n ) {
        System.out.printf("Calificacion %d? ",c++);
        cal = obj.nextFloat();
        suma = suma + cal;
        }
        prom = suma / n;
        System.out.printf("La suma es : %.2f\n", suma);
        System.out.printf("El promedio es : %.2f\n", prom);
    }
}
