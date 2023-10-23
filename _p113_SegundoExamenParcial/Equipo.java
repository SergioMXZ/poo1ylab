package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo() {
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        this();
        Nombre = nombre;
        Liga = liga;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getLiga() {
        return Liga;
    }

    public void setLiga(String liga) {
        Liga = liga;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public double getTotalBono() {
        double Total = 0;
        for (Jugador jugador : Jugadores) {
            Total += jugador.getBono();
        }
        return Total;
    }

    public double getTotal() {
        double Total = 0;
        for (Jugador jugador : Jugadores) {
            Total += jugador.getTotal();
        }
        return Total;
    }

    public int getTotalH() {
       int Hombres = 0;
       for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'H') Hombres += 1;
       }
       return Hombres;
    }
    public int getTotalM() {
       int Mujeres = 0;
       for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M') Mujeres += 1;
       }
       return Mujeres;
    }
    
    public void reporte() {
        System.out.println(toString());
        for (Jugador jugador : Jugadores) {
            System.out.println("\n" + jugador);
        }
    }

    @Override
    public String toString() {
        return "Equipo [" + "Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() +
         ", Bono=" + getTotalBono() + ", Total="+ getTotal() + ", Hombres="+ getTotalH() + ", Mujeres="+ getTotalM()+"]";
    }

}
