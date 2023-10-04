/*Elaborar un programa que:
• Muestre el primer elemento
• Muestre el tercer elemento
• Muestre los elementos del arreglo
• Ponga a 0 todos los elementos mayores a 10
• Muestre nuevamente los elementos del arreglo */

public class _p90_Temperaturas {
    public static void MostrarArr(double[] nums){
        for (double i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        double [] temperaturas = {2.34, 44.56, 7.89, 0.5, 2.5, 4.67, 40.3, 22.35, 56.22};
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla
        System.out.println("Primer elemento " + temperaturas[0]);
        System.out.println("Tercer elemento " + temperaturas[2]);
        MostrarArr(temperaturas);
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 10) temperaturas[i] = 0;
        }
        MostrarArr(temperaturas);
    }
}