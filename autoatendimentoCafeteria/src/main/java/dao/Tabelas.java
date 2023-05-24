/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 * Classe para criar as tabelas do banco de dados
 */
public class Tabelas {
    public static void main(String[] args){
        try {
            String clienteTabela = "crete table Cliente(id int AUTO_INCEMENTE primary key,"
                    + "nome varchar(200) not null, email varchar(100) not null, telefone varchar(11) not null, "
                    + "endereco varchar (100) not null, senha varchar(200) not null, confirmarSenha varchar(200) not null, UNIQUE(email) ";
            BDOperacoes.setInformacao(clienteTabela, "Tabela Cliente criada com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
