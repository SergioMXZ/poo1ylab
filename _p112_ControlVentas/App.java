public class App {
    public static void main(String[] args) {
        Tienda Tienda = new Tienda("Software Start Up", "Carlos Castañeda", "Av. Luis Moya 345");

        Tienda.getClientes().add(new Cliente("Felipe Calderon", "Las Lomas 123", "calde@msn.com"));
        Tienda.getClientes().add(new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com"));
        Tienda.getClientes().add(new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@yahoo.com"));
        Tienda.getClientes().add(new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@precidencia.gob.mx"));

        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.print("Reporte de clientes sin ventas : ");
        System.out.println(Tienda.toString());
        for (Cliente cliente : Tienda.getClientes()) {
            System.out.println("\n>>> "+ cliente.toString());
        }
        // Cliente #1
        Tienda.getClientes().get(0).getVentas().add(new VentaContado("Matillo", 10.0, 60.50, 10.00, "Sacabrocados"));
        Tienda.getClientes().get(0).getVentas().add(new VentaCredito("Pala", 2.0, 1170.55, 3.00, 10.00));
        // Cliente #2
        Tienda.getClientes().get(1).getVentas().add(new VentaCredito("Clavo", 2.5, 160.34, 2.0, 20.00));
        Tienda.getClientes().get(1).getVentas().add(new VentaCredito("Cinta de Aislar", 5.0, 71.34, 6.0, 20.00));
        Tienda.getClientes().get(1).getVentas().add(new VentaContado("Pinzas", 10.00, 650.33, 20.000, "Taladro"));
        // Cliente #3
        Tienda.getClientes().get(2).getVentas().add(new VentaContado("Thiner", 50.00, 65.00, 10.00, "Aerosol"));
        // Reporte ventas
        Tienda.Reporte();
    }
}
