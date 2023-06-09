
package dao;

import modelo.ItensPedido;


/**
 *Classe para inserir as informações na tabela ItensPedido no BD
 * @author mathe
 */
public class ItensPedidoDao {
    public static void salvar(ItensPedido itenspedido) {
        String query = "insert into pedido values('" + itenspedido.getCod_item() + "','" + itenspedido.getQtn_itens()+"')";
        ConectarBD.setInformacao(query, "Valores do pedido adicionado com sucesso");
    }
}
