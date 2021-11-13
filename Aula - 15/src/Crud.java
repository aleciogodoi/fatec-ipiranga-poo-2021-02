import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Crud {

	private static Connection conn = null; // Objeto Connection do JAVA
	private static Statement comandoSQL;   // Objeto Comandos SQL do JAVA
	static Conexao conexao = new Conexao();
	static int idUsuario=0;
	static String nome="",email="",telefone="",endereco="";
	
	public static void main(String[] args) {	
		int opcao=0;
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				incluir();
				break;
			case 2:
				pesquisar();
				break;
			case 3:
				alterar();
				break;
			case 4:
				excluir();
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
			System.out.println();
			while (rs.next()) 
				System.out.println(	 rs.getInt("idUsuario")+", "
									+rs.getString("Nome")+", "
									+rs.getString("Email")+", "
									+rs.getString("Telefone")+", "
									+rs.getString("Endereco") );
			System.out.println();
		} catch (SQLException ex) {
			System.out.println("Problemas na Execução do comando: "+sql);
			ex.printStackTrace();
		} finally {
			conexao.fechar(conn);
		}
	}
	
	public static void pesquisar() {
		conn = conexao.conectar();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Id Usuário: ");
		idUsuario = sc.nextInt();
		
		String sql = "Select idUsuario,Nome,Email,Telefone,Endereco From Usuario Where idUsuario="+idUsuario;
		try {
			comandoSQL = conn.createStatement(); // Objeto para execução dos comandos SQL
			ResultSet rs = comandoSQL.executeQuery(sql);  // Guardo os resultados em um Objeto Java ResultSet
			System.out.println();
			if (rs.next()) 
				System.out.println(	 rs.getInt("idUsuario")+", "
									+rs.getString("Nome")+", "
									+rs.getString("Email")+", "
									+rs.getString("Telefone")+", "
									+rs.getString("Endereco") );
			System.out.println();
		} catch (SQLException ex) {
			System.out.println("Problemas na Execução do comando: "+sql);
			ex.printStackTrace();
		} finally {
			conexao.fechar(conn);
		}
	}
	
	public static void incluir() {
		entrada();
		String sql =  "Insert Into Usuario (idUsuario,Nome,Email,Telefone,Endereco)"
					+ " Values ("+idUsuario+",'"+nome+"','"+email+"','"+telefone+"','"+endereco+"')";
		conn = conexao.conectar();
		try {
			System.out.println(sql);
			comandoSQL = conn.createStatement(); // Objeto para execução dos comandos SQL
			comandoSQL.executeUpdate(sql);  // Guardo os resultados em um Objeto Java ResultSet
		} catch (SQLException ex) {
			System.out.println("Problemas na Execução do comando: "+sql);
			ex.printStackTrace();
		} finally {
			conexao.fechar(conn);
		}		
	}


	public static void alterar() {
		conn = conexao.conectar();
		
		entrada();
		
		String sql = "Update Usuario Set "+
				     "nome='"+nome+"',email='"+email+"',telefone='"+telefone+"',endereco='"+endereco+"'"
				     	+" Where idUsuario="+idUsuario;
		try {
			System.out.println(sql);
			comandoSQL = conn.createStatement(); // Objeto para execução dos comandos SQL
			comandoSQL.executeUpdate(sql);  // Guardo os resultados em um Objeto Java ResultSet
		} catch (SQLException ex) {
			System.out.println("Problemas na Execução do comando: "+sql);
			ex.printStackTrace();
		} finally {
			conexao.fechar(conn);
		}		
	}

	public static void excluir() {
		conn = conexao.conectar();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Id Usuário: ");
		idUsuario = sc.nextInt();
		
		String sql = "Delete From Usuario Where idUsuario="+idUsuario;
		try {
			System.out.println(sql);
			comandoSQL = conn.createStatement(); // Objeto para execução dos comandos SQL
			comandoSQL.executeUpdate(sql);  // Guardo os resultados em um Objeto Java ResultSet
		} catch (SQLException ex) {
			System.out.println("Problemas na Execução do comando: "+sql);
			ex.printStackTrace();
		} finally {
			conexao.fechar(conn);
		}		
	}
	
	public static void entrada() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Id Usuário: ");
		idUsuario = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Email: ");
		email = sc.nextLine();
		
		System.out.print("Telefone: ");
		telefone = sc.nextLine();
		
		System.out.print("Endereço: ");
		endereco = sc.nextLine();
		
		System.out.println();
	}
}
