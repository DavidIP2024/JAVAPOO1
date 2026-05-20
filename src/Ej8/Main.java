package Ej8;

// Archivo: Main.java

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Primeiro conxunto
        Set<Integer> conxunto1 = new HashSet<>();

        conxunto1.add(1);
        conxunto1.add(2);
        conxunto1.add(3);
        conxunto1.add(4);

        // Segundo conxunto
        Set<Integer> conxunto2 = new HashSet<>();

        conxunto2.add(3);
        conxunto2.add(4);
        conxunto2.add(5);
        conxunto2.add(6);

        // Chamar ao metodo
        Set<Integer> interseccion =
                Utilidades.interseccion(conxunto1, conxunto2);

        // Mostrar resultados
        System.out.println("Conxunto 1:");
        System.out.println(conxunto1);

        System.out.println("\nConxunto 2:");
        System.out.println(conxunto2);

        System.out.println("\nIntersección:");
        System.out.println(interseccion);
    }
}