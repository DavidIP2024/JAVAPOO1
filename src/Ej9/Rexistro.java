package Ej9;

/*
 * ENUNCIADO:
 * Aplicación para rexistrar temperaturas dunha estación meteorolóxica.
 * Permite:
 * 1. Engadir rexistros.
 * 2. Listar rexistros.
 * 3. Mostrar estatísticas (máxima, mínima e media).
 * 4. Gardar os datos nun ficheiro binario ao saír.
 */

// Archivo: Rexistro.java

import java.io.Serializable;
import java.time.LocalTime;

public class Rexistro implements Serializable {

    private double temperatura;
    private LocalTime hora;

    public Rexistro(double temperatura) {

        this.temperatura = temperatura;

        // Hora actual do sistema
        this.hora = LocalTime.now();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public LocalTime getHora() {
        return hora;
    }

    @Override
    public String toString() {

        return "Hora: " + hora +
                " | Temperatura: " + temperatura + " ºC";
    }
}