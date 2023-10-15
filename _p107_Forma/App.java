package _p107_Forma;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", 10.3);
        System.out.println(circulo);
        System.out.println("Area Circulo : " + circulo.getArea());
        Triangulo triangulo = new Triangulo("Azul", 10, 20);
        System.out.println(triangulo);
        System.out.println("Area Triángulo : " + triangulo.getArea());
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(triangulo);
        formas.add(new Circulo("Azul", 33.45));
        System.out.println("\nTodas las formas :\n");
        for (Forma forma : formas) {
            System.out.println(forma);
            System.out.print("El area del ");
            if (forma instanceof Triangulo) {
                System.out.print("Triangulo es :");
                System.out.print(((Triangulo) forma).getArea());
            } else if (forma instanceof Circulo) {
                System.out.print("Circulo es :");
                System.out.print(((Circulo) forma).getArea());
            }
            System.out.println("\n");
        }
    }
}
