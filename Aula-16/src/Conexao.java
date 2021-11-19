import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Connection conectar() {
		
		try {
			Connection conn;   // objeto para conex�o com BD
			// Conex�o SQLite
			
			Class.forName("org.sqlite.JDBC");  // verifica se existe o Driver
			System.out.println("Driver Encontrado!");
			
			String bdUrl = "jdbc:sqlite:ALPOO.db"; // string de conex�o
			conn = DriverManager.getConnection(bdUrl); // conex�o com o BD
			
			/*
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver JDBC encontrado!");
			String bdUrl = "jdbc:mysql://localhost:3306/alpoo?useTimezone=true&serverTimezone=UTC";
			String bdUsuario = "ale";
			String bdSenha = "ale";
			conn = DriverManager.getConnection(bdUrl,bdUsuario,bdSenha); 	*/
					
			System.out.println("Conectado com Banco de Dados!");
			return conn;
		} catch (ClassNotFoundException ex) {
			System.out.println("Erro de conex�o! Driver n�o Econtrado!");
			ex.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("Erro de conex�o!");
			e.printStackTrace();
			return null;
		} 
	
	}
	
	public void fechar(Connection c) {
		try {
			c.close();
			System.out.println("Conex�o Fechada!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
