// Genera dos arreglos de números aleatorios y los suma en un tercer arreglo

import java.util.Random;

public class _p89_ArregloAleatorios {

    public static void Mostrar(float[] nums) {
        for (float n : nums)
            System.out.printf("%.2f ", n);
        System.out.println("\n");
    }
    public static void GeneraAleatorio(float[] nums) {
        float min = 10.5f, max = 41.5f;
        Random rnd = new Random();
        for (int i = 0; i < nums.length; i++)
            nums[i] = Math.abs(rnd.nextFloat(max - min)) + min;
    }
    public static void SumaArreglos(float[] a1, float[] a2, float[] a3) {
        for (int i = 0; i < a1.length; i++)
            a3[i] = a1[i] + a2[i];
    }

    public static void main(String[] args) {
        int MAX = 15;
        float[] A = new float[MAX];
        float[] B = new float[MAX];
        float[] C = new float[MAX];
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla
        System.out.println("El arreglo ya con aletorios generados:\n");
        GeneraAleatorio(A);
        GeneraAleatorio(B);
        Mostrar(A);
        Mostrar(B);
        System.out.println("El arreglo con la suma de los dos arreglos es:\n");
        SumaArreglos(A, B, C);
        Mostrar(C);
    }
}
