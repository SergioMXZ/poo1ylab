package _p107_Forma;

public class Triangulo extends Forma {
    private double Base;
    private double Altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        Base = base;
        Altura = altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        Base = base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    @Override
    public double getArea() {
        return (Base * Altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo [Color=" + super.getColor() + ", Base=" + Base + ", Altura=" + Altura + "]";
    }
}
