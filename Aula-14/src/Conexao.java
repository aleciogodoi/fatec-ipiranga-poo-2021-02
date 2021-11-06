import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Connection conectar() {
		try {
			// Conex�o SQLite
			Connection conn;   // objeto para conex�o com BD
			Class.forName("org.sqlite.JDBC");  // verifica se existe o Driver
			System.out.println("Driver Encontrado!");
			
			String bdUrl = "jdbc:sqlite:ALPOO.db"; // string de conex�o
			conn = DriverManager.getConnection(bdUrl); // conex�o com o BD
			System.out.println("Conectado com Banco de Dados!");
			
		} catch (ClassNotFoundException ex) {
			System.out.println("Erro de conex�o! Driver n�o Econtrado!");
			ex.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Erro de conex�o!");
			e.printStackTrace();
		}
		return null;
	}
	
	public void fechar(Connection conn) {
		try {
			conn.close();
			System.out.println("Conex�o Fechada!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
