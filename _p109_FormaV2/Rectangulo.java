package _p109_FormaV2;

public class Rectangulo extends Forma {
    private double Largo;
    private double Ancho;

    public Rectangulo() {
    }
    public Rectangulo(String color, Boolean relleno, double largo, double ancho) {
        super(color, relleno);
        Largo = largo;
        Ancho = ancho;
    }
    public Rectangulo(Forma forma, double largo, double ancho) {
        super(forma.Color, forma.Relleno);
        Largo = largo;
        Ancho = ancho;
    }

    public double getLargo() {
        return Largo;
    }
    public void setLargo(double largo) {
        Largo = largo;
    }
    public double getAncho() {
        return Ancho;
    }
    public void setAncho(double ancho) {
        Ancho = ancho;
    }

    @Override
    public double getArea() {
        return Largo * Ancho;
    }
    @Override
    public double getPerimetro() {
        return (Largo * 2) + (Ancho * 2);
    }
    @Override
    public String toString() {
        return "Rectangulo [" + super.toString() + "Largo=" + Largo + ", Ancho=" + Ancho + "]";
    }
}
