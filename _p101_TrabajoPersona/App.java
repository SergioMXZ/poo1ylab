package _p101_TrabajoPersona;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Trabajo trabajo = new Trabajo();
        trabajo.setId(1);
        trabajo.setRol("Chofer");
        trabajo.setSalario(200);
        persona1.setNombre("Julia Urina");
        persona1.setTrabajo(trabajo);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println(persona1);

        Persona persona2 = new Persona("Jose Perez", new Trabajo(2, "Cocinero", 2500));
        System.out.println(persona2);

        Persona persona3 = new Persona("Sergio", new Trabajo(3, "Intern Ing Software", 120000));
        System.out.println(persona3);
    }
}
