package Ej4;

/*
 * ENUNCIADO:
 * Programa que pide números reais por consola ata introducir un 0.
 * Os números positivos gárdanse nunha colección e os negativos noutra.
 * Despois móstranse as dúas coleccións e a suma dos seus elementos.
 * Finalmente elimínanse os números maiores de 10 e menores de -10
 * e vólvense mostrar as coleccións.
 */

// Archivo: Main.java

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Coleccións para positivos e negativos
        ArrayList<Double> positivos = new ArrayList<>();
        ArrayList<Double> negativos = new ArrayList<>();

        double numero;

        double sumaPositivos = 0;
        double sumaNegativos = 0;

        // Pedir números ata introducir 0
        do {

            System.out.print("Introduce un número: ");
            numero = sc.nextDouble();

            if (numero > 0) {

                positivos.add(numero);
                sumaPositivos += numero;

            } else if (numero < 0) {

                negativos.add(numero);
                sumaNegativos += numero;
            }

        } while (numero != 0);

        // Mostrar coleccións e sumas
        System.out.println("\nColección de positivos:");
        System.out.println(positivos);

        System.out.println("Suma positivos: " + sumaPositivos);

        System.out.println("\nColección de negativos:");
        System.out.println(negativos);

        System.out.println("Suma negativos: " + sumaNegativos);

        // Eliminar maiores de 10 dos positivos
        Iterator<Double> itPos = positivos.iterator();

        while (itPos.hasNext()) {

            double n = itPos.next();

            if (n > 10) {
                itPos.remove();
            }
        }

        // Eliminar menores de -10 dos negativos
        Iterator<Double> itNeg = negativos.iterator();

        while (itNeg.hasNext()) {

            double n = itNeg.next();

            if (n < -10) {
                itNeg.remove();
            }
        }

        // Mostrar coleccións finais
        System.out.println("\nColeccións despois de eliminar elementos:");

        System.out.println("\nPositivos:");
        System.out.println(positivos);

        System.out.println("\nNegativos:");
        System.out.println(negativos);

        sc.close();
    }
}