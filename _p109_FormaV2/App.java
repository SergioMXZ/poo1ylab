package _p109_FormaV2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Circulo f1 = new Circulo("Rojo", true, 10.23);
        Circulo f2 = new Circulo("Verde", false, 99.12);
        Rectangulo f3 = new Rectangulo("Amarillo", false, 10.0, 20.0);
        Rectangulo f4 = new Rectangulo("Azul", true, 15.0, 44.0);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(f1); formas.add(f2); formas.add(f3); formas.add(f4);
        
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Todas las formas :");
        for (Forma i : formas) {
            System.out.println(i);
        }
        System.out.println("\nCalculando áreas y perimetros de las figuras:");
        for (Forma i : formas) {
            System.out.print("La forma es un " + (i instanceof Circulo?"Circulo":"Rectangulo"));
            System.out.print("\nEl área es       : " + i.getArea());
            System.out.println("\nEl perimetro es : "+ i.getPerimetro());
        }
    }
}
