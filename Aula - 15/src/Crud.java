import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Crud {

	private static Connection conn = null; // Objeto Connection do JAVA
	private static Statement comandoSQL;   // Objeto Comandos SQL do JAVA
	static Conexao conexao = new Conexao();
	
	public static void main(String[] args) {	
		int opcao=0;
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				incluir();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				listar();
				break;
			}
		} while (opcao != 0 );
		System.out.println("F I M");
	}
	
	public static int menu () {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		String menu = "1 - Incluir\n"
					+ "2 - Pesquisar\n"
					+ "3 - Alterar\n"
					+ "4 - Excluir\n"
					+ "5 - Listar\n"
					+ "0 - Sair\n"
					+ "Ecolha uma opção: ";
		System.out.print(menu);
		opcao = sc.nextInt();
		System.out.println();

		return opcao;
	}
	
	public static void listar () {
		String sql = "Select idUsuario,Nome,Email,Telefone,Endereco From Usuario";
		conn = conexao.conectar();
		try {
			comandoSQL = conn.createStatement(); // Objeto para execução dos comandos SQL
			ResultSet rs = comandoSQL.executeQuery(sql);  // Guardo os resultados em um Objeto Java ResultSet
			while (rs.next()) 
				System.out.println(	 rs.getInt("idUsuario")+", "
									+rs.getString("Nome")+", "
									+rs.getString("Email")+", "
									+rs.getString("Telefone")+", "
									+rs.getString("Endereco") );
			
		} catch (SQLException ex) {
			System.out.println("Problemas na Execução do comando: "+sql);
			ex.printStackTrace();
		} finally {
			conexao.fechar(conn);
		}
	}
	
	public static void incluir() {
		
	}

}
