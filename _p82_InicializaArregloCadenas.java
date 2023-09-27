// Inicializa de forma manual arreglo de cadenas y lo imprime

public class _p82_InicializaArregloCadenas {
    public static void main(String[] args) {
        String[] municipios = new String[10];
        municipios[0] = "Apozol";
        municipios[1] = "Apulco";
        municipios[2] = "Cañitas";
        municipios[3] = "Jerez";
        municipios[4] = "Fresnillo";
        municipios[5] = "Rio Grande";
        municipios[6] = "Sain Alto";
        municipios[7] = "Sombrerete";
        municipios[8] = "Teul de Gonzalez Ortega";
        municipios[9] = "Zacatecas";
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla
        System.out.printf("Primer elemento del arreglo %s\n", municipios[0]);
        System.out.printf("Ultimo elemento del arreglo %s\n", municipios[9]);
        System.out.println("\nTodos los elementos del arreglo con ciclo for:");
        for (int i = 0; i < municipios.length; i++) {
            System.out.printf("%s ", municipios[i]);
        }
        System.out.println("\n\nTodos los elementos del arreglo con ciclo for-each:");
        for (String m : municipios) {
            System.out.printf("%s ", m);
        }
        System.out.println("\n\nProceso terminado ");
    }
}
