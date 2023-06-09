package dao;

import javax.swing.JOptionPane;

/**
 * Classe para criar as tabelas do banco de dados
 *
 * @author mathe
 */
public class Tabelas {

    public static void main(String[] args) {
        try {
            String clienteTabela = "ID_Cliente int primary key, \n"
                    + "Nome varchar(60) not null, \n"
                    + "Email varchar(20) not null, \n"
                    + "Telefone char(11) not null, \n"
                    + "Endereco varchar(50) not null  ";
            String categoriaTabela = "ID_categoria int primary key,\n"
                    + "nomeCategoria varchar(100) not null";
            String produtoTabela = "ID_Produto int primary key,\n"
                    + "Descricao varchar(200),\n"
                    + "Classificacao varchar(50) not null,\n"
                    + "Valor varchar(10) not null,\n"
                    + "ID_categoria int not null references Categoria ";
            String pedidoTabela = "Codigo_Pedido int primary key, \n"
                    + "ID_Cliente int NOT NULL REFERENCES Cliente, \n"
                    + "ID_StatusPedido int not null references StatusPedido, \n"
                    + "ID_TipoPagamento int not null references TipoPagamento, \n"
                    + "DataHora_Pedido date not null, \n"
                    + "ValorFinal varchar(10) not null";
            String itensPedido = "Cod_Item int primary key,\n"
                    + "Qnt_Itens int not null,\n"
                    + "ID_Produto int not null references Produto,\n"
                    + "Cod_Pedido int not null references Pedido";
            String pagamentoTabela = "ID_TipoPagamento int primary key, \n"
                    + "DataHora_Pagamento date not null";
            ConectarBD.setInformacao(clienteTabela, "Tabela Cliente criada com sucesso");
            ConectarBD.setInformacao(categoriaTabela, "Tabela Categoria criada com sucesso");
            ConectarBD.setInformacao(produtoTabela, "Tabela Produto criada com sucesso");
            ConectarBD.setInformacao(pedidoTabela, "Tabela Pedido criada com sucesso");
            ConectarBD.setInformacao(itensPedido, "Tabela itensPedido criada com sucesso");
            ConectarBD.setInformacao(pagamentoTabela, "Tabela Pagamento criada com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
