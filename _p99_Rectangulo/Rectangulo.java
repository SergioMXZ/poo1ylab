package _p99_Rectangulo;

public class Rectangulo {
    private float Largo;
    private float Ancho;
    
    public Rectangulo() { }
    public Rectangulo(float largo, float ancho) {
        Largo = largo;
        Ancho = ancho;
    }
    public float getLargo() { return Largo; }
    public void setLargo(float largo) { Largo = largo; }
    public float getAncho() { return Ancho; }
    public void setAncho(float ancho) { Ancho = ancho; }

    public float getArea() {
        float Area = Largo * Ancho;
        return Area;
    }
    public float getPerimetro() {
        float Perimetro = Largo*2 + Ancho*2;
        return Perimetro;
    }

    public String toString() {
        return "Rectangulo [Largo=" + Largo + ", Ancho=" + Ancho + "]";
    }
}
