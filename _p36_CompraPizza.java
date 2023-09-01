// Permite procesar la compra de una pizza

import java.util.Scanner;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tamaño, cantidad;
        float descuento = 0f, total = 0f;
        String tamañoStr="";

        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
        System.out.println("Procesa la compra de una pizza ...");
        System.out.println("Tamaño de la pizza:");
        System.out.println("[C]hica - $5");
        System.out.println("[M]ediana - $10");
        System.out.println("[G]rande - $20");
        tamaño = Character.toUpperCase(obj.next().charAt(0));
        switch (tamaño) {
            case 'C': total = 5f; tamañoStr = "Chica"; break;
            case 'M': total = 10f; tamañoStr = "Mediana"; break;
            case 'G': total = 20f; tamañoStr = "Grande"; break;
            default: System.out.println("Valor invalido");break;
        }
        if (total != 0) {
            System.out.println("Cantidad de pizzas:"); cantidad = obj.nextInt();
            total = total * cantidad;
            if (total > 2000) descuento = 0.15f*total;
            System.out.printf("\nCompra ...\nTamaño de la compra: %s", tamañoStr);
            System.out.printf("\nCantidad comprada: %d\nTotal compra:%.2f",cantidad,total);
            System.out.printf("\nDescuento: %.2f\n",descuento);
            System.out.printf("Total compra con descuento:%.2f\n",total-descuento);
            System.out.print("Gracias por su compra");
        }
    }
}
