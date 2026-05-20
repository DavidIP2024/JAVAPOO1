
// Repite o programa do exercicio 2, usando un iterador para eliminar
// os elementos que valen 5 e 7.

package Ej3;

// Archivo: Main.java

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // Créase a colección
        ArrayList<Integer> numeros = new ArrayList<>();

        // Engádense 100 números aleatorios entre 1 e 10
        for (int i = 0; i < 100; i++) {

            int numero = (int)(Math.random() * 10) + 1;

            numeros.add(numero);
        }

        // Mostrar colección antes de eliminar
        System.out.println("Colección antes da eliminación:");
        System.out.println(numeros);

        // Crear iterador
        Iterator<Integer> it = numeros.iterator();

        // Eliminar os elementos que valen 5 e 7
        while (it.hasNext()) {

            int numero = it.next();

            if (numero == 5 || numero == 7) {
                it.remove();
            }
        }

        // Mostrar colección despois da eliminación
        System.out.println("\nColección despois da eliminación:");
        System.out.println(numeros);
    }
}