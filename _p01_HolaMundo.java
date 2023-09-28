

public class _p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Jesus";
        String hermano = "Adan";
        String mensaje = String.format("Tanto %s como %s desean aprender java", amigo, hermano);
        
        System.out.println("Hola Mundo desde el Lenguaje java");
        System.out.println("\nHola amigo " + amigo + " bienvenido a java");
        System.out.println("\nMi amigo es " + amigo + " mi hermano es " + hermano);
        System.out.println("\n" + mensaje);
    }
}
