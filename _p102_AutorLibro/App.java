package _p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        // Prueba Autor
        Autor a1 = new Autor("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1);

        a1.setCorreo("ahteck@somewhere.com");
        System.out.println(a1);
        System.out.println("Nombre es: " + a1.getNombre());
        System.out.println("Correo es: " + a1.getCorreo());

        // Prueba Libro
        Libro b1 = new Libro("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);

        b1.setPrecio(9.9);
        b1.setCant(99);
        System.out.println(b1);
        System.out.println("Isbn es: " + b1.getIsbn());
        System.out.println("Nombre es: " + b1.getNombre());
        System.out.println("Precio es: "+ b1.getPrecio());
        System.out.println("Cant es: " + b1.getCant());
        System.out.println("Autor es: "+ b1.getAutor());
        System.out.println("Autor Nombre: " + b1.getAutor().getNombre());
        System.out.println("Autor Correo: " + b1.getAutor().getCorreo());
    }
}
