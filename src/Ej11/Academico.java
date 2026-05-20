package Ej11;

/*
 * ENUNCIADO:
 * Programa para xestionar académicos da Real Academia da Lingua.
 * Cada académico ocupa un sillón identificado por unha letra.
 * Créase a clase Academico e un metodo para inserir académicos
 * nun mapa comprobando que a letra pertence ao abecedario.
 */

// Archivo: Academico.java

public class Academico implements Comparable<Academico> {

    private String nome;
    private int anoIngreso;

    public Academico(String nome, int anoIngreso) {

        this.nome = nome;
        this.anoIngreso = anoIngreso;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    // Ordenación natural por nome
    @Override
    public int compareTo(Academico a) {

        return this.nome.compareTo(a.nome);
    }

    @Override
    public String toString() {

        return "Nome: " + nome +
                " | Ano ingreso: " + anoIngreso;
    }
}