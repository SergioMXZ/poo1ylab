package _p108_Vehiculo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        double suma = 0;
        Compacto v1 = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        Compacto v2 = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);
        Camioneta v3 = new Camioneta("CA104014544", "Dina", 2008,234567.15, 450.0, 4);
        Camioneta v4 = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);

        System.out.print("\033[H\033[2J"); System.out.flush();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(v1); vehiculos.add(v2); vehiculos.add(v3); vehiculos.add(v4);
        System.out.println("Datos de los Vehiculos de la flota\n");
        for (Vehiculo i : vehiculos) {
            System.out.println(i);
        }
        System.out.println("\nCalculando el total de precio de todos los vehículos ...");
        for (Vehiculo i : vehiculos) {
            System.out.println(i.getPrecio());
            suma += i.getPrecio();
        }
        System.out.print("La suma de precios es: " + suma);
    }
}
