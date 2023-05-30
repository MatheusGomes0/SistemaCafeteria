/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe Classe para criar as tabelas do banco de dados
 */
public class Tabelas {

    public static void main(String[] args) {
        try {
            String clienteTabela = "crete table Cliente(id int AUTO_INCEMENTE primary key,"
                    + "nome varchar(200) not null, email varchar(100) not null, telefone varchar(11) not null, "
                    + "endereco varchar (100) not null, senha varchar(200) not null, confirmarSenha varchar(200) not null, UNIQUE(email) ";
            String categoriaTabela = "create table categoria (id int AUTO_INCREMENT primary key, nomeCategoria varchar(200))";
            String produtoTabela = "create table produto(id int AUTO_INCREMENT primary key, nome varchar(200), categoria varchar(200), preco money ";
            String pedidoTabela = "create table pedido(id int primary key, nome varchar(200), telefone varchar(200), email varchar(200), data varchar(50), total varchar(200)";
            String itensPedido = "create table itensPedido(id int cod_item, qntd_itens varchar(3), id_cardapio varchar (3))";
            String pagamentoTabela = "create table pagamento(id int primary key, datahora varchar(10))";
            BDOperacoes.setInformacao(clienteTabela, "Tabela Cliente criada com sucesso");
            BDOperacoes.setInformacao(categoriaTabela, "Tabela Categoria criada com sucesso");
            BDOperacoes.setInformacao(produtoTabela, "Tabela Produto criada com sucesso");
            BDOperacoes.setInformacao(pedidoTabela, "Tabela Pedido criada com sucesso");
            BDOperacoes.setInformacao(itensPedido, "Tabela itensPedido criada com sucesso");
            BDOperacoes.setInformacao(pagamentoTabela, "Tabela Pagamento criada com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
