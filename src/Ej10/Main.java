package Ej10;

// Archivo: Main.java

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeFicheiro = "produtos.dat";

        // Estrutura para gardar produtos
        HashMap<String, Produto> produtos = new HashMap<>();

        // Cargar datos do ficheiro
        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(nomeFicheiro)
                    );

            produtos = (HashMap<String, Produto>) ois.readObject();

            ois.close();

            System.out.println("Datos cargados correctamente.");

        } catch (Exception e) {

            System.out.println("Non existe ficheiro previo.");
        }

        int opcion;

        do {

            // Menú
            System.out.println("\n--- TENDA DE REPOSTOS ---");
            System.out.println("1. Dar de alta produto");
            System.out.println("2. Dar de baixa produto");
            System.out.println("3. Actualizar cantidade");
            System.out.println("4. Visualizar produtos");
            System.out.println("5. Saír");

            System.out.print("Escolle unha opción: ");
            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {

                case 1:

                    // Alta produto
                    System.out.print("Código do produto: ");
                    String codigo = sc.nextLine();

                    System.out.print("Cantidade: ");
                    int cantidade = sc.nextInt();

                    Produto p = new Produto(codigo, cantidade);

                    produtos.put(codigo, p);

                    System.out.println("Produto engadido.");
                    break;

                case 2:

                    // Baixa produto
                    System.out.print("Código do produto: ");
                    codigo = sc.nextLine();

                    if (produtos.remove(codigo) != null) {

                        System.out.println("Produto eliminado.");

                    } else {

                        System.out.println("O produto non existe.");
                    }

                    break;

                case 3:

                    // Actualizar cantidade
                    System.out.print("Código do produto: ");
                    codigo = sc.nextLine();

                    if (produtos.containsKey(codigo)) {

                        System.out.print("Nova cantidade: ");
                        cantidade = sc.nextInt();

                        produtos.get(codigo)
                                .setCantidade(cantidade);

                        System.out.println(
                                "Cantidade actualizada."
                        );

                    } else {

                        System.out.println("Produto non encontrado.");
                    }

                    break;

                case 4:

                    // Mostrar produtos
                    System.out.println("\nLISTA DE PRODUTOS:");

                    for (Map.Entry<String, Produto> entrada
                            : produtos.entrySet()) {

                        System.out.println(entrada.getValue());
                    }

                    break;

                case 5:

                    // Gardar ficheiro
                    try {

                        ObjectOutputStream oos =
                                new ObjectOutputStream(
                                        new FileOutputStream(nomeFicheiro)
                                );

                        oos.writeObject(produtos);

                        oos.close();

                        System.out.println(
                                "Datos gardados correctamente."
                        );

                    } catch (Exception e) {

                        System.out.println(
                                "Erro ao gardar ficheiro."
                        );
                    }

                    System.out.println("Saíndo...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 5);

        sc.close();
    }
}