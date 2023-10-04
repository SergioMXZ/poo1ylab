// Calcula mayor, promedio y busca en un arreglo de temperaturas

public class _p87_ArregloTemperaturas {
    public static void Mostrar(double[] a) {
        for ( int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
    public static double Mayor(double[] a) {
        double m = a[0];
        for (int i = 0; i < a.length; i++) {
            if ( a[i] > m ) m = a[i];
        }
        return m;
    }
    public static double Menor(double[] a) {
        double m = a[0];
        for (int i = 0; i < a.length; i++) {
            if ( a[i] < m ) m = a[i];
        }
        return m;
    }
    public static int Buscar(double[] a, double bus) {
        int pos =-1;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] == bus ) { pos = i; break; }
        }
        return pos;
        }
    public static void main(String[] args) {
        double[] temps = {12.34, 56.22, 56.78, 0.0, 10.25, 60.22};

        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla
        System.out.println("\nTemperaturas");
        Mostrar(temps);
        System.out.println("\nEl elemento mayor es " + Mayor(temps));
        System.out.println("\nEl elemento menor es " + Menor(temps));
        int pos = Buscar(temps, 12.34);
        if (pos != -1) {
            System.out.println("El elemento fue encontrado en la posicion "+pos);
        } else {
            System.out.println("\nEl elemento a buscado y no existe en el arreglo de temperatura");
        }
    }
}