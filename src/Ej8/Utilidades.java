package Ej8;

/*
 * ENUNCIADO:
 * Crear un metodo xenérico estático que calcule a intersección
 * de dous conxuntos.
 * O resultado será un novo conxunto cos elementos comúns
 * aos dous conxuntos.
 */

// Archivo: Utilidades.java

import java.util.HashSet;
import java.util.Set;

public class Utilidades {

    // Metodo para calcular a intersección
    public static <E> Set<E> interseccion(Set<E> conxunto1,
                                          Set<E> conxunto2) {

        // Crear novo conxunto
        Set<E> resultado = new HashSet<>();

        // Revisar elementos comúns
        for (E elemento : conxunto1) {

            if (conxunto2.contains(elemento)) {
                resultado.add(elemento);
            }
        }

        // Devolver intersección
        return resultado;
    }
}