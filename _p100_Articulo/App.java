package _p100_Articulo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Articulo art1 = new Articulo("A101", "Pluma Roja", 888, 0.08);
        System.out.println(art1.toString());

        art1.setCant(999);
        art1.setPrecioUnit(0.99);
        System.out.println(art1.toString());
        System.out.println("Id es        : " + art1.getId());
        System.out.println("Desc es      : " + art1.getDesc());
        System.out.println("Cant es      : " + art1.getCant());
        System.out.println("PrecioUnit es: " + art1.getPrecioUnit());
        System.out.println("El Total es: " + art1.getTotal());

        ArrayList<Articulo> articulos = new ArrayList<>();
        articulos.add(art1);
        articulos.add(new Articulo("A102", "Pluma Azul", 934, 1.2));
        articulos.add(new Articulo("P103", "Lapiz del 12", 456, 0.5));

        int total = 0;
        System.out.println("\nTodos los articulos");
        for (Articulo articulo : articulos) {
            System.out.println(articulo.toString());
            total += articulo.getTotal();
        }
        System.out.println("Total venta: " + total);
    }
}
