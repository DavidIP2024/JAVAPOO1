package Ej11;

// Archivo: Utilidades.java

import java.util.Map;

public class Utilidades {

    // Método para inserir académicos
    public static boolean nuevoAcademico(
            Map<Character, Academico> academia,
            Academico novo,
            Character letra) {

        // Converter a maiúscula
        letra = Character.toUpperCase(letra);

        // Comprobar se é unha letra válida
        if (Character.isLetter(letra)) {

            academia.put(letra, novo);

            return true;
        }

        return false;
    }
}