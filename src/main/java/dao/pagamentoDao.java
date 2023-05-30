/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import modelo.Pagamento;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author mathe
 */
public class pagamentoDao {
    
    /**
     * Para pegar o ID do pedido
     * @return 
     */
     public static String getId() {
        int id = 1;
        try {
            ResultSet rs = BDOperacoes.getInformacao("select max(id) from pedido");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
     
     /**
      * Insere os valores no banco de dados
      * @param pagamento 
      */
    public static void pagar(Pagamento pagamento){
        String query = "insert into pedido values('" + pagamento.getId()+ "','" +pagamento.getData()+ "')";
        BDOperacoes.setInformacao(query, "Valores em Pagamento inserido com sucesso");
    }
}
