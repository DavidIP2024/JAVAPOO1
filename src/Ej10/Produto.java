package Ej10;

/*
 * ENUNCIADO:
 * Aplicación para xestionar os produtos dunha tenda de repostos.
 * Permite:
 * - Dar de alta produtos.
 * - Dar de baixa produtos.
 * - Actualizar cantidades.
 * - Mostrar produtos e stock.
 * Os datos gárdanse nun ficheiro ao pechar o programa.
 */

// Archivo: Produto.java

import java.io.Serializable;

public class Produto implements Serializable {

    private String codigo;
    private int cantidade;

    public Produto(String codigo, int cantidade) {

        this.codigo = codigo;
        this.cantidade = cantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

    @Override
    public String toString() {

        return "Código: " + codigo +
                " | Cantidade: " + cantidade;
    }
}