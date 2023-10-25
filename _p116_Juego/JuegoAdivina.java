package _p116_Juego;

import java.util.Scanner;

public class JuegoAdivina implements Juego {
    private int num, intentos;
    private Scanner teclado;

    public JuegoAdivina() {
        teclado = new Scanner(System.in);
    }

    public void iniciar() {
        num = 1 + (int) (Math.random() * 10);
    }

    public void jugar() {
        int num;
        do {
            System.out.print("Adivina número entre 1 y 100: ");
            num = teclado.nextInt();
            if (this.num < num)
                System.out.println("El número a adivinar es menor");
            else if (this.num > num)
                System.out.println("El número a adivimar es mayor");
            intentos++;
        } while (this.num != num);
    }

    public void finalizar() {
        System.out.println(this.num + " era el número !!!, ganaste el juego despues de " + intentos + " intentos");
    }
}
