package _p95_Empleado02;

public class App {
    public static void main(String[] args) {
        // Instanciar y reservar espacio en memoria
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan Perez");
        empleado.setEdad(35);
        System.out.println(empleado.toString());

        // Instanciar, luego reservar espacio en memoria
        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.setNombre("Maria de Jesus");
        empleado2.setEdad(23);
        System.out.println(empleado2.toString());
        
        // Accede elementos individuales directamente
        System.out.println(empleado.getNombre());
        System.out.println(empleado2.getNombre());
        //System.out.println(empleado.getEdad());
        //System.out.println(empleado2.getEdad());
    }
}
