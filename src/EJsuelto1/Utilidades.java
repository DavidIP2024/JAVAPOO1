package EJsuelto1;

// Archivo: Utilidades.java

import java.util.HashMap;
import java.util.Map;

public class Utilidades {

    // Engadir libro
    public static void engadirLibro(
            HashMap<String, Libro> biblioteca,
            Libro libro) {

        biblioteca.put(libro.getIsbn(), libro);
    }

    // Eliminar libro
    public static void eliminarLibro(
            HashMap<String, Libro> biblioteca,
            String isbn) {

        biblioteca.remove(isbn);
    }

    // Mostrar estatísticas
    public static void mostrarEstatisticas(
            HashMap<String, Libro> biblioteca) {

        if (biblioteca.isEmpty()) {

            System.out.println("Non hai libros.");
            return;
        }

        int totalLibros = biblioteca.size();

        Libro maxLibro = null;

        int suma = 0;

        for (Map.Entry<String, Libro> entrada
                : biblioteca.entrySet()) {

            Libro libro = entrada.getValue();

            suma += libro.getExemplares();

            if (maxLibro == null ||
                    libro.getExemplares() >
                            maxLibro.getExemplares()) {

                maxLibro = libro;
            }
        }

        double media =
                (double) suma / totalLibros;

        System.out.println("\nESTATÍSTICAS");
        System.out.println("Número de libros: "
                + totalLibros);

        System.out.println("Libro con máis exemplares:");
        System.out.println(maxLibro);

        System.out.println("Media de exemplares: "
                + media);
    }
}