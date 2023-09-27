// Lee un arreglo de n calificaciones, calcula la suma y el promedio

import java.util.Scanner;

public class _p84_LeerArregloCalificaciones {
    public static void main(String[] args) {
        int n = 0;
        float suma = 0, promedio = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla
        System.out.print("Cuantos calificaciones deseas procesar ? ");
        n = obj.nextInt();
        float[] califs = new float[n];
        System.out.printf("Introduce las %d calificaciones \n", n);
        for (int i = 0; i < califs.length; i++) {
            System.out.printf("Calificacion %d : ", i + 1);
            califs[i] = obj.nextFloat();
        }
        System.out.println("\nEl arreglo de calificaciones capturadas es :");
        for (float cal : califs) {
            System.out.printf("%.2f ", cal);
            suma = suma + cal;
        }
        promedio = suma / califs.length;
        System.out.printf("\nLa suma de las calificaciones es %.2f", suma);
        System.out.printf("\nEl promedio de las calificaciones es %.2f", promedio);
        obj.close();
    }
}
