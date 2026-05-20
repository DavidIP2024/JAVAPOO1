package Ej6;

/*
 * ENUNCIADO:
 * Programa que crea unha lista con números enteiros entre 1 e 10.
 * A partir dela créanse:
 * - Un conxunto sen repetidos.
 * - Un conxunto cos números repetidos.
 * - Un conxunto cos números únicos.
 */

// Archivo: Main.java

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        // Lista de números
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(3);
        lista.add(5);
        lista.add(3);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.add(9);
        lista.add(1);
        lista.add(4);

        // Mostrar lista
        System.out.println("Lista:");
        System.out.println(lista);

        // Conxunto sen repetidos
        HashSet<Integer> senRepetidos = new HashSet<>(lista);

        // Conxunto de repetidos
        HashSet<Integer> repetidos = new HashSet<>();

        // Conxunto de únicos
        HashSet<Integer> unicos = new HashSet<>();

        // Buscar repetidos
        for (int i = 0; i < lista.size(); i++) {

            int contador = 0;

            for (int j = 0; j < lista.size(); j++) {

                if (lista.get(i).equals(lista.get(j))) {
                    contador++;
                }
            }

            // Se aparece máis dunha vez → repetido
            if (contador > 1) {
                repetidos.add(lista.get(i));
            }

            // Se aparece unha vez → único
            if (contador == 1) {
                unicos.add(lista.get(i));
            }
        }

        // Mostrar resultados
        System.out.println("\nConxunto sen repetidos:");
        System.out.println(senRepetidos);

        System.out.println("\nConxunto de repetidos:");
        System.out.println(repetidos);

        System.out.println("\nConxunto de únicos:");
        System.out.println(unicos);
    }
}