
// Implementa un metodo xenérico estático o que se
// lle pasa como parámetro dúas táboas con elementos do mesmo tipo xenérico
// e devolta unha nova táboa cos elementos de ambas concatenados
// (os da segunda táboa despois dos da primeira).


        package Ej1;// Archivo: Ej1.Utilidades.java

public class Utilidades {

    // Metodo xenérico para concatenar dúas táboas
    public static <T> T[] concatenarTaboas(T[] taboa1, T[] taboa2) {

        // Créase unha nova táboa co tamaño das dúas
        T[] resultado = java.util.Arrays.copyOf(taboa1,
                taboa1.length + taboa2.length);

        // Engádense os elementos da segunda táboa
        for (int i = 0; i < taboa2.length; i++) {
            resultado[taboa1.length + i] = taboa2[i];
        }

        return resultado;
    }
}