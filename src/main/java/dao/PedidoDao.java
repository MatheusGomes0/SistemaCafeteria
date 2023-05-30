/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Pedido;

/**
 *
 * @author mathe
 */
public class PedidoDao {

    /**
     * Pegar o ID do pedido
     *
     * @return
     */
    public static String getId() {
        int id = 1;;
        try {
            ResultSet rs = BDOperacoes.getInformacao("select max(id) from pedido");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }

    /**
     *
     */
    public static void salvar(Pedido pedido) {
        String query = "insert into pedido values('" + pedido.getId() + "','" + pedido.getNome() + "','" + pedido.getTelefone() + "','" + pedido.getEmail() + "','" + pedido.getData() + "','" + pedido.getTotal() +
        "')";
        BDOperacoes.setInformacao(query, "Valores do pedido adicionado com sucesso");
    }
}
