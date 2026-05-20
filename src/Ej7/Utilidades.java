package Ej7;

/*
 * ENUNCIADO:
 * Crear un metodo xenérico estático que faga a unión de dous conxuntos.
 * O resultado será un novo conxunto cos elementos dos dous,
 * sen repetir elementos.
 */

// Archivo: Utilidades.java

import java.util.HashSet;
import java.util.Set;

public class Utilidades {

    // Metodo para unir dous conxuntos
    public static <E> Set<E> union(Set<E> conxunto1,
                                   Set<E> conxunto2) {

        // Crear novo conxunto
        Set<E> resultado = new HashSet<>();

        // Engadir elementos do primeiro conxunto
        resultado.addAll(conxunto1);

        // Engadir elementos do segundo conxunto
        resultado.addAll(conxunto2);

        // Devolver unión
        return resultado;
    }
}