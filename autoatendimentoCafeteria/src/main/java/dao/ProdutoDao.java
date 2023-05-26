/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Produto;

/**
 *
 * @author mathe
 */
public class ProdutoDao {

    public static void adicionar(Produto produto) {
        String query = " insert into produto (nome,categoria,preco) values ('" + produto.getNome() + "'" + produto.getCategoria() + "'" + produto.getPreco() + "')";
        BDOperacoes.setInformacao(query, "Produto inserido com sucesso!");
    }
}
