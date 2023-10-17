package _p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla

        System.out.println("\nProbando clase CuentaBancaria");
        CuentaBancaria cuenta1 = new CuentaBancaria(5000);
        System.out.println("Saldo inicial : " + cuenta1.getSaldo());
        cuenta1.deposito(10000);
        System.out.println("Saldo deposito : " + cuenta1.getSaldo());
        double cretiro = 16000;
        boolean retiro = cuenta1.retiro(cretiro);
        if (retiro) System.out.println("Retiro de " + cretiro + " exitoso, ya puedes ir a ppistear, te queda "+cuenta1.getSaldo());
        else System.out.println("Lastima margarito, que otro te invite");

        System.out.println("\nProbando clase cliente");
        Cliente cliente1 = new Cliente("Juan Margarito Perez", cuenta1);
        System.out.println("Cliente 1 " + cliente1);
        Cliente cliente2 = new Cliente("Juan Margarito Perez", new CuentaBancaria(1000));
        System.out.println("Cliente 2 " + cliente2);
        cliente2.getCuenta().deposito(8500);
        System.out.println("Cliente 2 despues del deposito de 8500 : " + cliente2);
        if (cliente2.getCuenta().retiro(2000))
        { System.out.println("El retiro de 2000 fue exitoso, te quedo " + cliente2.getCuenta().getSaldo());
        }else System.out.println("No money man :(");

        System.out.println("\nProbando clase banco");
        Banco miBanco = new Banco("Banco Patito SA de CV, ", "Calle las Escondida S/N");
        miBanco.agregarCliente(cliente1);
        miBanco.agregarCliente(cliente2);
        miBanco.agregarCliente(new Cliente("Felipe Correo", new CuentaBancaria(2000)));
        miBanco.getClientes().get(0).getCuenta().deposito(1500);
        miBanco.getClientes().get(1).getCuenta().deposito(1000);
        miBanco.getClientes().get(2).getCuenta().deposito(12000);
        System.out.println("\nResumen del Banco \n");
        double totalbanco = 0.0;
        for (Cliente cliente : miBanco.getClientes()) {
            System.out.println(cliente);
            totalbanco += cliente.getCuenta().getSaldo();
        }
        System.out.println("Total de dinero en el banco : " + totalbanco);
    }
}
