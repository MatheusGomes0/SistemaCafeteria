/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author mathe
 */
public class ConectarBD {
    
        public Connection con; 
	
	public PreparedStatement st; 
	
	public ResultSet rs; //Recebe o resultado da 
	
	
	//	Crendenciais de acesso (arquivo externo)
	
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";		
	private final String DATABASENAME = "java";
	private final String URL = "jdbc:sqlserver://localhost;databasename="+DATABASENAME; 
	private final String LOGIN = "sa4";
	private final String SENHA = "1234567";
	
	public boolean getConnection() {
		
		try {
			Class.forName(DRIVER); //Carregar o driver durante a execução
			con = DriverManager.getConnection(URL, LOGIN, SENHA); //Conectar com o Banco de dados
			System.out.println("Conectou...");
			
			return true;
		}
		catch(ClassNotFoundException erro) { //	NÃ£o carregou o driver
			System.out.println("Driver nÃ£o encontrado!");
			
			
		}
		catch(SQLException erro) {
			System.out.println("Falha " + erro);
		}
		return false;
	}
	
	public void close() {
		try {
			if(rs!=null) rs.close(); //fechando o rs
		}
		catch(SQLException erro) {
			
		}
		try {
			if(st!=null) st.close();
		}
		catch(SQLException erro) {
			
		}
		try {
			if(con!=null) {
				con.close();
				System.out.println("Desconectou...");
			}
		}
		catch(SQLException erro) {
			
		}
		
	}

    Statemant createStatemant() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	

}

    

