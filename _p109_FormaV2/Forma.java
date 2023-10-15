package _p109_FormaV2;

public abstract class Forma {
    protected String Color;
    protected Boolean Relleno;
    
    public Forma() {
    }
    public Forma(String color, Boolean relleno) {
        Color = color;
        Relleno = relleno;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public Boolean getRelleno() {
        return Relleno;
    }
    public void setRelleno(Boolean relleno) {
        Relleno = relleno;
    }
    
    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma [Color=" + Color + ", Relleno=" + (Relleno == true ? "Si" : "No") + "]";
    }
}
