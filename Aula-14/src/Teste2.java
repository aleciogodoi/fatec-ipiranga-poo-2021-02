import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste2 {

	private static Connection conn = null; // Objeto Connection do JAVA
	private static Statement comandoSQL;   // Objeto Comandos SQL do JAVA
	static Conexao conexao = new Conexao();
	
	public static void main(String[] args) {
		String sql;
		Connection conn = null;    // objeto do tipo Java Connection
		Conexao conexao = new Conexao(); // objeto do tipo Conexao
		conn = conexao.conectar();	// abrindo uma conex�o com o BD
		
		// Defini��o para Inclus�o de um novo departamento
		sql =  "Insert Into Departamento (IdDepto, NomeDepto, Gerente, Divisao, Local) "
				+ "Values (1001,'RIO PRETO',10,'SUDESTE','S�O PAULO')";
		try {
			// Cria��o do objeto para execu��o dos comandos SQL
			comandoSQL = conn.createStatement();
			// Execu��o do Insert
			comandoSQL.executeUpdate(sql);
		} catch (SQLException ex) {
			System.out.println("Erro de execu��o comando\n"+ comandoSQL+"\n"+ex);
			ex.printStackTrace();
		}

		conexao.fechar(conn);
		
	}

}
