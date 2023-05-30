/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Categoria;
/**
 *
 * @author mathe
 */
public class CategoriaDao {
    
    public static void adicionar(Categoria categoria ){
        String query = "insert into categoriaTabela (nomeCategoria) values ('"+categoria.getName()+"'";
        BDOperacoes.setInformacao(query, "Categoria adicionada com sucesso");
    }
    
    public static ArrayList<Categoria> getAllRecords(){
        ArrayList<Categoria> arrayList = new ArrayList<>();
        try {
            ResultSet rs = BDOperacoes.getInformacao("select * from categoria");
            while(rs.next()){
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
