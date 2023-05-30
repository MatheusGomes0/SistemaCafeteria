/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.ItensPedido;


/**
 *
 * @author mathe
 */
public class ItensPedidoDao {
    public static void salvar(ItensPedido itenspedido) {
        String query = "insert into pedido values('" + itenspedido.getCod_item() + "','" + itenspedido.getQtn_itens()+"')";
        BDOperacoes.setInformacao(query, "Valores do pedido adicionado com sucesso");
    }
}
