package Ejsuelto2;

/*
 * ENUNCIADO:
 * Aplicación para xestionar un videoclub.
 *
 * Cada película terá:
 * - código
 * - título
 * - director
 * - duración
 * - número de copias
 *
 * O programa permitirá:
 * 1. Engadir películas.
 * 2. Eliminar películas.
 * 3. Modificar copias.
 * 4. Buscar películas por código.
 * 5. Mostrar todas as películas.
 * 6. Mostrar películas de máis de 120 minutos.
 * 7. Mostrar estatísticas.
 * 8. Eliminar películas sen copias.
 * 9. Gardar datos nun ficheiro.
 * 10. Cargar datos.
 * 11. Saír.
 *
 * Os datos gardaranse nun ficheiro binario.
 */

// Archivo: Pelicula.java

import java.io.Serializable;

public class Pelicula implements Serializable {

    private String codigo;
    private String titulo;
    private String director;
    private int duracion;
    private int copias;

    public Pelicula(String codigo,
                    String titulo,
                    String director,
                    int duracion,
                    int copias) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.copias = copias;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    @Override
    public String toString() {

        return "Código: " + codigo +
                " | Título: " + titulo +
                " | Director: " + director +
                " | Duración: " + duracion +
                " min | Copias: " + copias;
    }
}