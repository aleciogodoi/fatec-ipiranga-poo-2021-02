import java.sql.Connection;

public class Conexao {
	
	public Connection conectar() {
		try {
			// Conexão SQLite
			Connection conn;   // objeto para conexão com BD
			Class.forName("org.sqlite.JDBC");  // verifica se existe o Driver
		} catch (ClassNotFoundException ex) {
			System.out.println("Erro de conexão! Driver não Econtrado!");
			ex.printStackTrace();
		}
		return null;
	}
}
