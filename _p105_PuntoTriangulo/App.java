package _p105_PuntoTriangulo;

public class App {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(new Punto(5, 5), new Punto(15, 15), new Punto(5, 25));
        Triangulo triangulo2 = new Triangulo(new Punto(15, 5), new Punto(15, 15), new Punto(5, 25));

        System.out.println(triangulo1.toString());
        System.out.println(triangulo2.toString());
        System.out.println("Triangulo 1 . Vertice 1 : " + triangulo1.getV1());
        System.out.println("Triangulo 1 . Vertice 2 : " + triangulo1.getV2());
        System.out.println("Triangulo 1 . Vertice 3 : " + triangulo1.getV3());
        System.out.println("Triangulo 1 . Perimetro : " + triangulo1.getPerimetro());
        System.out.println("Triangulo 1 . Tipo      : " + triangulo1.getTipo());
    }
}
