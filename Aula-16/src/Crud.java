import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Crud {

	private static Connection conn = null; // Objeto Connection do JAVA
	private static PreparedStatement comandoSQL;   // Objeto Comandos SQL do JAVA
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
			comandoSQL = conn.prepareStatement(sql); // Objeto para execução dos comandos SQL
			ResultSet rs = comandoSQL.executeQuery();  // Guardo os resultados em um Objeto Java ResultSet
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
		
		String sql = "Select idUsuario,Nome,Email,Telefone,Endereco From Usuario Where idUsuario=?";
		try {
			comandoSQL = conn.prepareStatement(sql); // Objeto para execução dos comandos SQL
			comandoSQL.setInt(1, idUsuario);
			ResultSet rs = comandoSQL.executeQuery();  // Guardo os resultados em um Objeto Java ResultSet
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
		String sql =  "Insert Into Usuario (idUsuario,Nome,Email,Telefone,Endereco) VALUES (?, ?, ?, ?, ?)";
					
		conn = conexao.conectar();
		try {
			System.out.println(sql);
			comandoSQL = conn.prepareStatement(sql); // Objeto para execução dos comandos SQL
			comandoSQL.setInt(1, idUsuario);
			comandoSQL.setString(2, nome);
			comandoSQL.setString(3, email);
			comandoSQL.setString(4, telefone);
			comandoSQL.setString(5, endereco);
			comandoSQL.executeUpdate();  // Guardo os resultados em um Objeto Java ResultSet
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
		
		String sql = "Update Usuario Set nome=?,email=?,telefone=?',endereco=? Where idUsuario=?";
		try {
			System.out.println(sql);
			comandoSQL = conn.prepareStatement(sql); // Objeto para execução dos comandos SQL
			comandoSQL.setString(1, nome);
			comandoSQL.setString(2, email);
			comandoSQL.setString(3, telefone);
			comandoSQL.setString(4, endereco);			
			comandoSQL.setInt(5, idUsuario);

			comandoSQL.executeUpdate();  // Guardo os resultados em um Objeto Java ResultSet
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
		
		String sql = "Delete From Usuario Where idUsuario=?";
		try {
			System.out.println(sql);
			comandoSQL = conn.prepareStatement(sql); // Objeto para execução dos comandos SQL
			comandoSQL.setInt(1, idUsuario);
			comandoSQL.executeUpdate();  // Guardo os resultados em um Objeto Java ResultSet
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
