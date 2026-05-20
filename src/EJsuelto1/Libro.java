package EJsuelto1;

/*
 * ENUNCIADO:
 * Aplicación para xestionar unha biblioteca.
 *
 * Cada libro terá:
 * - ISBN
 * - título
 * - autor
 * - número de exemplares
 *
 * O programa permitirá:
 * 1. Engadir libros.
 * 2. Eliminar libros.
 * 3. Modificar exemplares.
 * 4. Buscar libro por ISBN.
 * 5. Mostrar todos os libros.
 * 6. Mostrar estatísticas.
 * 7. Gardar datos nun ficheiro.
 * 8. Cargar datos do ficheiro.
 * 9. Saír.
 *
 * Os libros gardaranse nun HashMap e os datos
 * almacenaranse nun ficheiro binario.
 */

// Archivo: Libro.java

import java.io.Serializable;

public class Libro implements Serializable {

    private String isbn;
    private String titulo;
    private String autor;
    private int exemplares;

    public Libro(String isbn,
                 String titulo,
                 String autor,
                 int exemplares) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.exemplares = exemplares;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    @Override
    public String toString() {

        return "ISBN: " + isbn +
                " | Título: " + titulo +
                " | Autor: " + autor +
                " | Exemplares: " + exemplares;
    }
}