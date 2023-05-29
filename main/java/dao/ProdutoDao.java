/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class ProdutoDao {

    public static void adicionar(Produto produto) {
        String query = " insert into produto (nome,categoria,preco) values ('" + produto.getNome() + "'" + produto.getCategoria() + "'" + produto.getPreco() + "')";
        BDOperacoes.setInformacao(query, "Produto inserido com sucesso!");
    }

    /**
     * Pesquisa os produtos existentes eum uma categoria
     * @param categoria
     * @return 
     */
    public static ArrayList<Produto> getAllRecordsByCategoria(String categoria) {
        ArrayList<Produto> arrayList = new ArrayList<>();

        try {
            ResultSet rs = BDOperacoes.getInformacao("select * from produto where categoria = '" + categoria + "'");
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setNome(rs.getString("nome"));
                arrayList.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    /**
     * Filtra o produto disponível na categoria e pelo nome do produto
     * @param nome
     * @param categoria
     * @return 
     */
     public static ArrayList<Produto> filterProdutoByNome(String nome, String categoria) {
        ArrayList<Produto> arrayList = new ArrayList<>();

        try {
            ResultSet rs = BDOperacoes.getInformacao("select * from produto where nome like '%"+nome+"%'and categoria = '" + categoria + "'");
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setNome(rs.getString("nome"));
                arrayList.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
     
     public static Produto getProdutoByName(String nome) {
         Produto produto = new Produto();
            try {
             ResultSet rs = BDOperacoes.getInformacao("select * from produto where nome = '"+nome+"'");
             while(rs.next()){
                 produto.setNome(rs.getString(2));
                 produto.setCategoria(rs.getString(3));
                 produto.setPreco(rs.getString(4));
             }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            }
            return produto;
     }
    

}
