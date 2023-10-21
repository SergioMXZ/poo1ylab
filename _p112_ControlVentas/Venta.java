

public abstract class Venta {
    private String Articulo;
    private double Cantidad;
    private double Precio;
    private double Total;

    public Venta(String articulo, double cantidad, double precio) {
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
        Total = Precio * Cantidad;
    }
    public String getArticulo() {
        return Articulo;
    }
    public void setArticulo(String articulo) {
        Articulo = articulo;
    }
    public double getCantidad() {
        return Cantidad;
    }
    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public double getTotal() {
        return Total;
    }

    public abstract double getTotalVenta();

    @Override
    public String toString() {
        return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" +
         Total + "]";
    }
}
