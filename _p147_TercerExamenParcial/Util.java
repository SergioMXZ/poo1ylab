package _p147_TercerExamenParcial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Cristiano", 38, 'H', "Casado", "Delantero", 1200d));
        return datos;
    }
    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fJugador = new ObjectOutputStream(arch);
        fJugador.writeObject(datos);
        fJugador.close();
    }
    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fJugador = new ObjectInputStream(arch);
        datos = (ArrayList<Jugador>) fJugador.readObject();
        fJugador.close();
        return datos;
    }
}