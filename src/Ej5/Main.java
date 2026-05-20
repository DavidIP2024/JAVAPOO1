package Ej5;

/*
 * ENUNCIADO:
 * Programa que pide números enteiros ata introducir -1.
 * Os números positivos gárdanse nunha colección.
 * Despois móstranse os elementos que están en posición par,
 * multiplicados por 100.
 */

// Archivo: Main.java

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Colección para gardar os positivos
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;

        // Pedir números ata introducir -1
        do {

            System.out.print("Introduce un número: ");
            numero = sc.nextInt();

            // Gardar só positivos
            if (numero >= 0) {
                numeros.add(numero);
            }

        } while (numero != -1);

        // Mostrar elementos con índice par multiplicados por 100
        System.out.println("\nElementos en índice par multiplicados por 100:");

        for (int i = 0; i < numeros.size(); i++) {

            if (i % 2 == 0) {

                int resultado = numeros.get(i) * 100;

                System.out.println(
                        "Índice " + i +
                                ": " + resultado
                );
            }
        }

        sc.close();
    }
}