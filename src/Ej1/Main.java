package Ej1;

// Archivo: Main.java

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] t1 = {1, 2, 3};
        Integer[] t2 = {4, 5, 6};

        Integer[] resultado =
                Utilidades.concatenarTaboas(t1, t2);

        System.out.println(Arrays.toString(resultado));
    }
}