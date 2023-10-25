package _p117_FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica, Ajustable {
    private double Largo;
    private double Ancho;

    public Rectangulo(double largo, double ancho) {
        Largo = largo;
        Ancho = ancho;
    }

    public double getArea() {
        return Largo + Ancho;
    }

    public double getPerimetro() {
        return 2 * Largo + 2 * Ancho;
    }

    public void ajustar(double porcentaje) {
        Largo = Largo + (Largo * porcentaje);
        Ancho = Ancho + (Ancho * porcentaje);
    }

    public String toString() {
        return "Rectangulo [Largo=" + Largo + ", Ancho=" + Ancho +", Area = "+ String.format("%.2f",getArea()) +
            ",Perimetro= " + String.format("%.2f",getPerimetro()) + "]";
}
}
