package _p096_Empleado03;

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan Perez");
        empleado.setEdad(35);
        System.out.println(empleado.toString());

        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.setNombre("Maria de Jesus");
        empleado2.setEdad(23);
        System.out.println(empleado2.toString());

        Empleado empleado3;
        empleado3 = new Empleado("Peje Lagarto", 70);
        empleado3.setNombre("AMLO");
        System.out.println(empleado3.toString());
        
        System.out.println(empleado.getNombre());
        System.out.println(empleado2.getNombre());
        System.out.println(empleado3.getNombre());
    }
}
