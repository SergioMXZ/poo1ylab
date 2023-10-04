// Muestra un arreglo y lo eleva al cuadrado usando funciones

public class _p86_ArregloMostrar {
    public static void Mostrar(int[] a) {
        for ( int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
    public static void Cuadrado(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }
    }
    public static void main(String[] args) {
        int [] arr1 = {2,4,6,8,3,5,7};
        int [] arr2 = {1,3,5,7,9,11,12,13};
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla
        System.out.println("\nElementos de arr1");
        Mostrar(arr1);
        System.out.println("\nElementos de arr2");
        Mostrar(arr2);
        System.out.println("\nElementos de arr1 elevados al cuadrado");
        Cuadrado(arr1); Mostrar(arr1);
        System.out.println("\nElementos de arr2 elevados al cuadrado");
        Cuadrado(arr2); Mostrar(arr2);
    }
}
