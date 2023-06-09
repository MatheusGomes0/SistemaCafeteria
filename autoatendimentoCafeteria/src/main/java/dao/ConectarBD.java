package dao;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *Para se conectar ao banco de dados
 * @author mathe
 */
public class ConectarBD {

    public static Connection con;

    public PreparedStatement st;

    public ResultSet rs; 

    //	Crendenciais de acesso (arquivo externo)
    private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String DATABASENAME = "CAFETERIA";
    private final String URL = "jdbc:sqlserver://localhost;databasename=" + DATABASENAME;
    private final String LOGIN = "sa4";
    private final String SENHA = "1234567";

    public boolean getConnection() {

        try {
            Class.forName(DRIVER); 
            con = DriverManager.getConnection(URL, LOGIN, SENHA); 
            System.out.println("Conectou...");

            return true;
        } catch (ClassNotFoundException erro) { //	
            System.out.println("Driver nÃƒÂ£o encontrado!");

        } catch (SQLException erro) {
            System.out.println("Falha " + erro);
        }
        return false;
    }

    public static void setInformacao(String Query, String msg) {
        try {
            ((ConectarBD) con).getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(Query);// faz um update com a query que informarem no parametro
            //para passar a mensagem
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ResultSet getInformacao(String query) {
        try {
            ((ConectarBD) con).getConnection();

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public void close() {
        try {
            if (rs != null) {
                rs.close(); //fechando o rs
            }
        } catch (SQLException erro) {

        }
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException erro) {

        }
        try {
            if (con != null) {
                con.close();
                System.out.println("Desconectou...");
            }
        } catch (SQLException erro) {

        }

    }

}
