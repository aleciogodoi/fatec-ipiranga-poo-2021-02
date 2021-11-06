import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depto = 0;
		Connection conn = null;    // objeto do tipo Java Connection
		Conexao conexao = new Conexao(); // objeto do tipo Conexao
		conn = conexao.conectar();	// abrindo uma conex�o com o BD
		
		do {
			System.out.print("Id Depto: ");
			depto = sc.nextInt();
			
			// string com comando Select
			String sql = "Select idDepto, nomeDepto From Departamento Where idDepto="+depto;
			try {
				// Criar objeto para execu��o de comandos SQL
				Statement comandoSQL = conn.createStatement();
				
				// Executar comando SQL e guardar o resultado
				ResultSet rs = comandoSQL.executeQuery(sql);
				
				while (rs.next()) { // l� uma linha do resultado
					System.out.println(rs.getInt("idDepto")+" - "+rs.getString("nomeDepto"));
				}				
			} catch (SQLException ex) {
				System.out.println("Problema Execu��o SQL - "+sql);
				ex.printStackTrace();
			}
		} while (depto!=0);
		
		conexao.fechar(conn); // fechando a conex�o com o BD
	}
	
}
