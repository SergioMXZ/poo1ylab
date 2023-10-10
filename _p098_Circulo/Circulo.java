package _p098_Circulo;

public class Circulo {
    private double Radio;

    public Circulo() { }
    public Circulo(double radio) {
        this.Radio = radio;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea() {
        double Area = Math.PI*(Math.pow(Radio, 2));
        return Area;
    }
    public double getCircunferencia() {
        double Circunferencia = Math.PI*(Radio+Radio);
        return Circunferencia;
    }
    @Override
    public String toString() {
        return "Circulo [Radio=" + Radio + "]";
    }
}
