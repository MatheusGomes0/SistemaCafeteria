/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author mathe
 */
public class BDOperacoes {
    public static void setInformacao(String Query, String msg){
        try {
           // Fazer a conexão Connection con = ConnectionProvider.getCon();
           //Statemant st = con.createStatemant();
           //st.executeUpdate(Query) -- faz um update com a query que informarem no parametro
           //para passar a mensagem
           if(!msg.equals("")){
               JOptionPane.showMessageDialog(null, msg);
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static  ResultSet getInformacao(String query){
        try {
            // Fazer a conexão Connection con = ConnectionProvider.getCon();
            //Statemant st = con.createStatemant();
          //  ResultSet rs = st.executeQuery(query);
           // return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Mensagem", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return null;
    }
}

