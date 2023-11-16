package _p145_EstudianteGUI_V1;

import java.util.ArrayList;

public class Util {
    public static ArrayList<Estudiante> inicializarDatos() {
        ArrayList<Estudiante> datos = new ArrayList<>();
        datos.add(new Estudiante("Juan Perez",22,34.5,"jperez@gmail.com"));
        datos.add(new Estudiante("Maria Jimenez",18,22.5,"mjimenez@gmail.com"));
        datos.add(new Estudiante("Carlos Fuentes",30,22.5,"cfuentes@msn.com"));
        return datos;
}
}