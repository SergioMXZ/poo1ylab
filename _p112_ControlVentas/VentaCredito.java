public class VentaCredito extends Venta{
    private double Meses;
    private double Interes;

    public VentaCredito(String articulo, double cantidad, double precio, double meses, double interes) {
        super(articulo, cantidad, precio);
        Meses = meses;
        Interes = interes;
    }

    public double getMeses() {
        return Meses;
    }

    public void setMeses(double meses) {
        Meses = meses;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double interes) {
        Interes = interes;
    }
    
    @Override
    public double getTotalVenta() {
        double Total = (getTotal() + (Meses * (getTotal() * Interes / 100)));
        return Total;
    }

    @Override
    public String toString() {
        return "VentaCredito [" + super.toString() + "Meses=" + Meses + ", Interes=" +
         Interes + "%" + ", TotalVenta=" + this.getTotalVenta() +  "]";
    }
}
