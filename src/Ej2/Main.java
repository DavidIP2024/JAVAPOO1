
// Codificar unha aplicación onde se insertan 100 números enteiros aleatorios entre
// 1 e 10 (ámbolos dous incluídos), podendo estar repetidos, nunha colección.
// Despois elimínanse tódolos elementos que valen 5 e 7. Mostrar a colección antes e
// despois da eliminación.

package Ej2;

// Archivo: Main.java

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // Créase a colección
        ArrayList<Integer> numeros = new ArrayList<>();

        // Insírense 100 números aleatorios entre 1 e 10
        for (int i = 0; i < 100; i++) {

            int numero = (int)(Math.random() * 10) + 1;

            numeros.add(numero);
        }

        // Mostrar colección antes de eliminar
        System.out.println("Colección antes da eliminación:");
        System.out.println(numeros);

        // Eliminar os números 5 e 7
        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {

            int numero = it.next();

            if (numero == 5 || numero == 7) {
                it.remove();
            }
        }

        // Mostrar colección despois de eliminar
        System.out.println("\nColección despois da eliminación:");
        System.out.println(numeros);
    }
}