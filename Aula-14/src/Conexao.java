import java.sql.Connection;

public class Conexao {
	
	public Connection conectar() {
		try {
			// Conex�o SQLite
			Connection conn;   // objeto para conex�o com BD
			Class.forName("org.sqlite.JDBC");  // verifica se existe o Driver
		} catch (ClassNotFoundException ex) {
			System.out.println("Erro de conex�o! Driver n�o Econtrado!");
			ex.printStackTrace();
		}
		return null;
	}
}
