package Ej11;

// Archivo: Main.java

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Crear mapa
        Map<Character, Academico> academia =
                new HashMap<>();

        // Crear académicos
        Academico a1 =
                new Academico("Manuel Rivas", 2010);

        Academico a2 =
                new Academico("Rosalía Castro", 2005);

        Academico a3 =
                new Academico("Xosé Neira", 2018);

        Academico a4 =
                new Academico("Uxía Blanco", 2020);

        Academico a5 =
                new Academico("María López", 2015);

        // Inserir académicos
        Utilidades.nuevoAcademico(academia, a1, 'A');

        Utilidades.nuevoAcademico(academia, a2, 'B');

        Utilidades.nuevoAcademico(academia, a3, 'C');

        Utilidades.nuevoAcademico(academia, a4, 'D');

        Utilidades.nuevoAcademico(academia, a5, 'E');

        // Mostrar contido do mapa
        System.out.println("ACADEMIA:\n");

        for (Map.Entry<Character, Academico> entrada
                : academia.entrySet()) {

            System.out.println(
                    "Sillón " + entrada.getKey() +
                            " -> " + entrada.getValue()
            );
        }
    }
}