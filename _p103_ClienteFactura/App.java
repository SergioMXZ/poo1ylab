package _p103_ClienteFactura;

public class App {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        System.out.println(c1);

        c1.setDescuento(8);
        System.out.println(c1);
        System.out.println("Id es: " + c1.getId());
        System.out.println("Nombre es: " + c1.getNombre());
        System.out.println("Descuento es: " + c1.getDescuento());

        Factura inv1 = new Factura(101, c1, 888.8);
        System.out.println(inv1);

        inv1.setMonto(999.9);
        System.out.println(inv1);
        System.out.println("Id es : " + inv1.getId());
        System.out.println("Cliente es :  " + inv1.getCliente());
        System.out.println("Monto es : " + inv1.getMonto());
        System.out.println("Cliente es : " + inv1.getCliente().getId());
        System.out.println("Ciente Nombre es : " + inv1.getCliente().getNombre());
        System.out.println("Cliente Descuento es : " + inv1.getCliente().getDescuento() + "%");
        System.out.printf("Monto despues de descuento es %.2f%n", inv1.getMontoDespuesDeDescuento()); // %n == \n
    }
}
