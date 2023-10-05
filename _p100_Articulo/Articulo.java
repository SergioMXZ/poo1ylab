package _p100_Articulo;

public class Articulo {
    private String Id;
    private String Desc;
    private int Cant;
    private double PrecioUnit;

    public Articulo() { }
    public Articulo(String id, String desc, int cant, double preciounit) {
        this.Id = id;
        this.Desc = desc;
        this.Cant = cant;
        this.PrecioUnit = preciounit;
    }
    public String getId() { return Id; }

    public String getDesc() { return Desc; }

    public int getCant() { return Cant; }

    public void setCant(int cant) { Cant = cant; }

    public double getPrecioUnit() { return PrecioUnit; }
    public void setPrecioUnit(double precioUnit) { PrecioUnit = precioUnit; }

    public double getTotal() {
        double Total = PrecioUnit*Cant;
        return Total;
    }
    
    public String toString() {
        return "Articulo [Id=" + Id + ", Desc=" + Desc + ", Cant=" + Cant + ", PrecioUnit=" + PrecioUnit + "]";
    }
    
    
}
