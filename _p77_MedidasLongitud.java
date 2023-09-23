//funciones que convierta pulgadas a centímetros y otra que convierten de metros a pies
import java.util.Scanner;

public class _p77_MedidasLongitud {
    public static void Pulgadas_cen(double pulgadas) {
        double cmtros = pulgadas * 2.54;
        System.out.printf("%.2f pulgas es igual a %.2f centimetros", pulgadas,cmtros);
    }
    public static void Metros_pies(double metros) {
        double pies = metros * 3.281;
        System.out.printf("%.2f metros es igual a %.2f pies", metros,pies);
    }
    public static void main(String[] args) {
        Character resp;
        double pulgadas, metros;
        Scanner obj = new Scanner(System.in);
        String mens="Covierte pulgadas a centímetros o convierte de metros a pies";
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la Pantalla
            System.out.println(mens);
            System.out.println("Que quieres hacer ? ");
            System.out.println("[P]ulgadas a centimetros:\n[M]etros a pies:");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'P' && resp != 'M');
        obj.close();
    switch (resp) {
        case 'P':
            System.out.println("Pulgadas a Centimetros:");
            System.out.println("Ingresa las pulgadas"); pulgadas = obj.nextInt();
            Pulgadas_cen(pulgadas);
            break;
        case 'M':
            System.out.println("Metros a Pies:");
            System.out.println("Ingresa los Metros"); metros = obj.nextDouble();
            Metros_pies(metros);
            break;
    }
    }
}
