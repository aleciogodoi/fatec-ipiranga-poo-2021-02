import java.sql.Connection;

public class Teste {

	public static void main(String[] args) {
		Connection conn = null;    // objeto do tipo Connection
		Conexao conexao = new Conexao(); // objeto do tipo Conexao
		conn = conexao.conectar();	// abrindo uma conex�o com o BD
		conexao.fechar(conn); // fechando a conex�o com o BD
	}
	
}
