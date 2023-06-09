package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Categoria;

/**
 * Classe para inserir as informações na tabela Categoria no BD
 *
 * @author mathe
 */
public class CategoriaDao {

    /**
     * Inserir os valores na tabela categoria
     *
     * @param categoria
     */
    public static void adicionar(Categoria categoria) {
        String query = "insert into categoriaTabela (nomeCategoria) values ('" + categoria.getName() + "'";
        ConectarBD.setInformacao(query, "Categoria adicionada com sucesso");
    }

    /**
     * Selecionar as categorias ja cadastradas no BD
     *
     * @return
     */
    public static ArrayList<Categoria> getAllRecords() {
        ArrayList<Categoria> arrayList = new ArrayList<>();
        try {
            ResultSet rs = ConectarBD.getInformacao("select * from categoria");
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setName(rs.getString("nomeCategoria"));
                arrayList.add(categoria);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
