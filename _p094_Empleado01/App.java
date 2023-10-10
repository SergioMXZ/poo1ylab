// Clase para manejar objetos

package _p094_Empleado01;

public class App {
    public static void main(String[] args) {
        // Instanciar y reservar espacio en memoria
        Empleado empleado = new Empleado();
        empleado.Nombre = "Juan Perez";
        empleado.Edad = 35;
        System.out.println(empleado.toString());
        
        // Instanciar, luego reservar espacio en memoria
        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.Nombre = "Maria de Jesus";
        empleado2.Edad = 23;
        System.out.println(empleado2.toString());

        // Accede elementos individuales directamente
        System.out.println("Nombre : " + empleado.Nombre);
        System.out.println("Edad   : " + empleado.Edad);
        System.out.println("Nombre : " + empleado2.Nombre);
        System.out.println("Edad   : " + empleado2.Edad);
    }
}
