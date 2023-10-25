package _p114_Animal;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla

        Gato migato = new Gato();
        Perro miPerro = new Perro();

        migato.dormir();
        migato.sonido();
        migato.comer();

        miPerro.dormir();
        miPerro.sonido();
        miPerro.comer();

    }
}
