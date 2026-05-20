package Ej9;

// Archivo: Main.java

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Rexistro> rexistros = new ArrayList<>();

        int opcion;

        do {

            // Menú
            System.out.println("\n--- ESTACIÓN METEOROLÓXICA ---");
            System.out.println("1. Novo rexistro");
            System.out.println("2. Listar rexistros");
            System.out.println("3. Mostrar estatísticas");
            System.out.println("4. Saír");

            System.out.print("Escolle unha opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    // Engadir rexistro
                    System.out.print("Introduce temperatura: ");
                    double temperatura = sc.nextDouble();

                    Rexistro r = new Rexistro(temperatura);

                    rexistros.add(r);

                    System.out.println("Rexistro gardado.");
                    break;

                case 2:

                    // Listar rexistros
                    System.out.println("\nLISTA DE REXISTROS:");

                    for (Rexistro rex : rexistros) {
                        System.out.println(rex);
                    }

                    break;

                case 3:

                    // Mostrar estatísticas
                    if (rexistros.isEmpty()) {

                        System.out.println("Non hai rexistros.");

                    } else {

                        double max = rexistros.get(0).getTemperatura();
                        double min = rexistros.get(0).getTemperatura();
                        double suma = 0;

                        for (Rexistro rex : rexistros) {

                            double temp = rex.getTemperatura();

                            if (temp > max) {
                                max = temp;
                            }

                            if (temp < min) {
                                min = temp;
                            }

                            suma += temp;
                        }

                        double media = suma / rexistros.size();

                        System.out.println("\nESTATÍSTICAS");
                        System.out.println("Temperatura máxima: " + max);
                        System.out.println("Temperatura mínima: " + min);
                        System.out.println("Temperatura media: " + media);
                    }

                    break;

                case 4:

                    // Gardar ficheiro binario
                    try {

                        String data =
                                LocalDate.now().format(
                                        DateTimeFormatter.ofPattern("yyyyMMdd")
                                );

                        String nomeFicheiro =
                                "rexistros" + data + ".dat";

                        ObjectOutputStream oos =
                                new ObjectOutputStream(
                                        new FileOutputStream(nomeFicheiro)
                                );

                        oos.writeObject(rexistros);

                        oos.close();

                        System.out.println(
                                "Datos gardados en " + nomeFicheiro
                        );

                    } catch (Exception e) {

                        System.out.println(
                                "Erro ao gardar o ficheiro."
                        );
                    }

                    System.out.println("Saíndo do programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 4);

        sc.close();
    }
}