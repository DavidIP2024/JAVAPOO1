package EJsuelto1;

// Archivo: Main.java

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Libro> biblioteca =
                new HashMap<>();

        String nomeFicheiro = "biblioteca.dat";

        int opcion;

        do {

            // Menú
            System.out.println("\n--- BIBLIOTECA ---");
            System.out.println("1. Engadir libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Modificar exemplares");
            System.out.println("4. Buscar libro");
            System.out.println("5. Mostrar libros");
            System.out.println("6. Mostrar estatísticas");
            System.out.println("7. Gardar datos");
            System.out.println("8. Cargar datos");
            System.out.println("9. Saír");

            System.out.print("Escolle unha opción: ");
            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {

                case 1:

                    // Engadir libro
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Exemplares: ");
                    int exemplares = sc.nextInt();

                    Libro libro =
                            new Libro(isbn,
                                    titulo,
                                    autor,
                                    exemplares);

                    Utilidades.engadirLibro(
                            biblioteca,
                            libro);

                    System.out.println(
                            "Libro engadido."
                    );

                    break;

                case 2:

                    // Eliminar libro
                    System.out.print("ISBN do libro: ");
                    isbn = sc.nextLine();

                    Utilidades.eliminarLibro(
                            biblioteca,
                            isbn);

                    System.out.println(
                            "Libro eliminado."
                    );

                    break;

                case 3:

                    // Modificar exemplares
                    System.out.print("ISBN do libro: ");
                    isbn = sc.nextLine();

                    if (biblioteca.containsKey(isbn)) {

                        System.out.print(
                                "Nova cantidade: ");

                        exemplares = sc.nextInt();

                        biblioteca.get(isbn)
                                .setExemplares(exemplares);

                        System.out.println(
                                "Exemplares actualizados."
                        );

                    } else {

                        System.out.println(
                                "Libro non encontrado."
                        );
                    }

                    break;

                case 4:

                    // Buscar libro
                    System.out.print("ISBN: ");
                    isbn = sc.nextLine();

                    if (biblioteca.containsKey(isbn)) {

                        System.out.println(
                                biblioteca.get(isbn)
                        );

                    } else {

                        System.out.println(
                                "Libro non encontrado."
                        );
                    }

                    break;

                case 5:

                    // Mostrar libros
                    System.out.println(
                            "\nLISTA DE LIBROS:"
                    );

                    for (Map.Entry<String, Libro> entrada
                            : biblioteca.entrySet()) {

                        System.out.println(
                                entrada.getValue()
                        );
                    }

                    break;

                case 6:

                    // Estatísticas
                    Utilidades.mostrarEstatisticas(
                            biblioteca);

                    break;

                case 7:

                    // Gardar ficheiro
                    try {

                        ObjectOutputStream oos =
                                new ObjectOutputStream(
                                        new FileOutputStream(
                                                nomeFicheiro
                                        )
                                );

                        oos.writeObject(biblioteca);

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

                case 8:

                    // Cargar ficheiro
                    try {

                        ObjectInputStream ois =
                                new ObjectInputStream(
                                        new FileInputStream(
                                                nomeFicheiro
                                        )
                                );

                        biblioteca =
                                (HashMap<String, Libro>)
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

                case 9:

                    // Gardar automaticamente
                    try {

                        ObjectOutputStream oos =
                                new ObjectOutputStream(
                                        new FileOutputStream(
                                                nomeFicheiro
                                        )
                                );

                        oos.writeObject(biblioteca);

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

        } while (opcion != 9);

        sc.close();
    }
}