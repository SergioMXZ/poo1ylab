package _p109_FormaV2;

public class Circulo extends Forma {
    private double Radio;

    public Circulo() {
    }
    public Circulo(String color, Boolean relleno, double radio) {
        super(color, relleno);
        Radio = radio;
    }
    public Circulo(Forma forma, double radio) {
        super(forma.Color, forma.Relleno);
        Radio = radio;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(Radio, 2);
    }
    @Override
    public double getPerimetro() {
        return Math.PI * (Radio * 2);
    }
    @Override
    public String toString() {
        return "Circulo ["+ super.toString() + "Radio=" + Radio + "]";
    }
}
