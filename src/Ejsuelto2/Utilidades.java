package Ejsuelto2;

// Archivo: Utilidades.java

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Utilidades {

    // Engadir película
    public static void engadirPelicula(
            HashMap<String, Pelicula> videoclub,
            Pelicula pelicula) {

        videoclub.put(
                pelicula.getCodigo(),
                pelicula
        );
    }

    // Eliminar película
    public static void eliminarPelicula(
            HashMap<String, Pelicula> videoclub,
            String codigo) {

        videoclub.remove(codigo);
    }

    // Mostrar estatísticas
    public static void mostrarEstatisticas(
            HashMap<String, Pelicula> videoclub) {

        if (videoclub.isEmpty()) {

            System.out.println("Non hai películas.");
            return;
        }

        int total = videoclub.size();

        int sumaDuracion = 0;

        Pelicula maxCopias = null;

        for (Map.Entry<String, Pelicula> entrada
                : videoclub.entrySet()) {

            Pelicula p = entrada.getValue();

            sumaDuracion += p.getDuracion();

            if (maxCopias == null ||
                    p.getCopias() >
                            maxCopias.getCopias()) {

                maxCopias = p;
            }
        }

        double media =
                (double) sumaDuracion / total;

        System.out.println("\nESTATÍSTICAS");

        System.out.println(
                "Número de películas: " + total
        );

        System.out.println(
                "Película con máis copias:"
        );

        System.out.println(maxCopias);

        System.out.println(
                "Duración media: " + media
        );
    }

    // Eliminar películas sen copias
    public static void eliminarSenCopias(
            HashMap<String, Pelicula> videoclub) {

        Iterator<Map.Entry<String, Pelicula>> it =
                videoclub.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, Pelicula> entrada =
                    it.next();

            if (entrada.getValue().getCopias() == 0) {

                it.remove();
            }
        }
    }
}