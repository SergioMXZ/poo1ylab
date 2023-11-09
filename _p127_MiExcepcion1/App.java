
package _p127_MiExcepcion1;

public class App {
    public static int sumar(int a, int b) throws FueraDeRango {
        if (a > 100 | b > 100)
            throw new FueraDeRango("Valores fuera de rango");
            return a + b;
    }
    public static void main(String[] args) {
        try {
            System.out.println("La suma es " + sumar(10, 10));
            System.out.println("La suma es " + sumar(101, 10));
        } catch (FueraDeRango e) {
            System.out.println(e.getMessage());
        }
    }
}
