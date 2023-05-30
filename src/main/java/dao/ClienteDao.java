/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Cliente;
/**
 *
 * @author mathe
 */
public class ClienteDao {
    /**
     * Query para quando o cliente se cadastrar
     * @param cliente 
     */
    public static void salvar(Cliente cliente){
        String query = "insert into Cliente(nome,email,telefone,endereco,senha,confirmarSenha)"
                + "values('"+cliente.getNome()+"','"+cliente.getEmail()+"','"+cliente.getTelefone()+"',"
                + "'"+cliente.getEndereco()+"','"+cliente.getSenha()+"','"+cliente.getSenhaConfirm()+"')";
    //mudar endereco adicionando dele endereco+bairro+numero
    BDOperacoes.setInformacao(query, "Cliente registrado com sucesso!");
    }
    
    /**
     * Método para a tela do Login
     * Analisar se é necessario
     */
    public static Cliente Login(String email,String senha){
        Cliente cliente = null;
        try {
            ResultSet rs = BDOperacoes.getInformacao("select * from Cliente where email = '"+email+"' and senha = '"+senha+"'");
            
            while(rs.next()){
                cliente = new Cliente();
                cliente.setStatus(senha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         return cliente;
    }
    
    
}
