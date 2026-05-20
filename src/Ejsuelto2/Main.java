package Ejsuelto2;

// Archivo: Main.java

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Pelicula> videoclub =
                new HashMap<>();

        String nomeFicheiro = "videoclub.dat";

        int opcion;

        do {

            // Menú
            System.out.println("\n--- VIDEOCLUB ---");

            System.out.println("1. Engadir película");
            System.out.println("2. Eliminar película");
            System.out.println("3. Modificar copias");
            System.out.println("4. Buscar película");
            System.out.println("5. Mostrar películas");
            System.out.println("6. Mostrar películas > 120 min");
            System.out.println("7. Mostrar estatísticas");
            System.out.println("8. Eliminar películas sen copias");
            System.out.println("9. Gardar datos");
            System.out.println("10. Cargar datos");
            System.out.println("11. Saír");

            System.out.print("Escolle unha opción: ");

            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {

                case 1:

                    // Engadir película
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();

                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Director: ");
                    String director = sc.nextLine();

                    System.out.print("Duración: ");
                    int duracion = sc.nextInt();

                    System.out.print("Copias: ");
                    int copias = sc.nextInt();

                    Pelicula p =
                            new Pelicula(
                                    codigo,
                                    titulo,
                                    director,
                                    duracion,
                                    copias
                            );

                    Utilidades.engadirPelicula(
                            videoclub,
                            p
                    );

                    System.out.println(
                            "Película engadida."
                    );

                    break;

                case 2:

                    // Eliminar película
                    System.out.print("Código: ");
                    codigo = sc.nextLine();

                    Utilidades.eliminarPelicula(
                            videoclub,
                            codigo
                    );

                    System.out.println(
                            "Película eliminada."
                    );

                    break;

                case 3:

                    // Modificar copias
                    System.out.print("Código: ");
                    codigo = sc.nextLine();

                    if (videoclub.containsKey(codigo)) {

                        System.out.print(
                                "Novas copias: "
                        );

                        copias = sc.nextInt();

                        videoclub.get(codigo)
                                .setCopias(copias);

                        System.out.println(
                                "Copias actualizadas."
                        );

                    } else {

                        System.out.println(
                                "Película non encontrada."
                        );
                    }

                    break;

                case 4:

                    // Buscar película
                    System.out.print("Código: ");
                    codigo = sc.nextLine();

                    if (videoclub.containsKey(codigo)) {

                        System.out.println(
                                videoclub.get(codigo)
                        );

                    } else {

                        System.out.println(
                                "Película non encontrada."
                        );
                    }

                    break;

                case 5:

                    // Mostrar películas
                    System.out.println(
                            "\nLISTA DE PELÍCULAS:"
                    );

                    for (Map.Entry<String, Pelicula> entrada
                            : videoclub.entrySet()) {

                        System.out.println(
                                entrada.getValue()
                        );
                    }

                    break;

                case 6:

                    // Películas > 120 min
                    System.out.println(
                            "\nPELÍCULAS LONGAS:"
                    );

                    for (Map.Entry<String, Pelicula> entrada
                            : videoclub.entrySet()) {

                        Pelicula pelicula =
                                entrada.getValue();

                        if (pelicula.getDuracion() > 120) {

                            System.out.println(
                                    pelicula
                            );
                        }
                    }

                    break;

                case 7:

                    // Estatísticas
                    Utilidades.mostrarEstatisticas(
                            videoclub
                    );

                    break;

                case 8:

                    // Eliminar sen copias
                    Utilidades.eliminarSenCopias(
                            videoclub
                    );

                    System.out.println(
                            "Películas eliminadas."
                    );

                    break;

                case 9:

                    // Gardar ficheiro
                    try {

                        ObjectOutputStream oos =
                                new ObjectOutputStream(
                                        new FileOutputStream(
                                                nomeFicheiro
                                        )
                                );

                        oos.writeObject(videoclub);

                        oos.close();

                        System.out.println(
                                "Datos gardados."
                        );

                    } catch (Exception e) {

                        System.out.println(
                                "Erro ao gardar."
                        );
                    }

                    break;

                case 10:

                    // Cargar ficheiro
                    try {

                        ObjectInputStream ois =
                                new ObjectInputStream(
                                        new FileInputStream(
                                                nomeFicheiro
                                        )
                                );

                        videoclub =
                                (HashMap<String, Pelicula>)
                                        ois.readObject();

                        ois.close();

                        System.out.println(
                                "Datos cargados."
                        );

                    } catch (Exception e) {

                        System.out.println(
                                "Erro ao cargar."
                        );
                    }

                    break;

                case 11:

                    // Gardar automaticamente
                    try {

                        ObjectOutputStream oos =
                                new ObjectOutputStream(
                                        new FileOutputStream(
                                                nomeFicheiro
                                        )
                                );

                        oos.writeObject(videoclub);

                        oos.close();

                    } catch (Exception e) {

                        System.out.println(
                                "Erro ao gardar."
                        );
                    }

                    System.out.println("Saíndo...");
                    break;

                default:

                    System.out.println(
                            "Opción incorrecta."
                    );
            }

        } while (opcion != 11);

        sc.close();
    }
}