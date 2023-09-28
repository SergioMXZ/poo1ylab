

import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        float paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);
        // Entrada
        System.out.print("Nombre del trabajador ? "); nombre = obj.nextLine();
        System.out.print("Horas trabajadas      ? "); horas = obj.nextInt();
        System.out.print("Paga por hora         ? "); paga = obj.nextFloat();
        tasa = 0.03f;
        //Calculo
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta  = pagabruta - impuesto;
        //Salida
        System.out.println("Resumen de pagos\n");
        System.out.println(String.format("El trabajador %s, trabajo %d horas,  a una paga de %.2f pesos la hora, se asume una tasa de impuesto de %.2f", nombre,horas,paga, tasa));
        System.out.println(String.format("Paga Bruta :   %.2f", pagabruta));
        System.out.println(String.format("impuestos  :   %.2f", impuesto));
        System.out.println(String.format("Paga Neta  :   %.2f", paganeta));
    }
}
