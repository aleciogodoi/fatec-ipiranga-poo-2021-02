import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Connection conectar() {
		
		try {
			Connection conn;   // objeto para conexão com BD
			// Conexão SQLite
			Class.forName("org.sqlite.JDBC");  // verifica se existe o Driver
			System.out.println("Driver Encontrado!");
			
			String bdUrl = "jdbc:sqlite:ALPOO.db"; // string de conexão
			conn = DriverManager.getConnection(bdUrl); // conexão com o BD
			System.out.println("Conectado com Banco de Dados!");
			return conn;
		} catch (ClassNotFoundException ex) {
			System.out.println("Erro de conexão! Driver não Econtrado!");
			ex.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("Erro de conexão!");
			e.printStackTrace();
			return null;
		} 
	
	}
	
	public void fechar(Connection c) {
		try {
			c.close();
			System.out.println("Conexão Fechada!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
