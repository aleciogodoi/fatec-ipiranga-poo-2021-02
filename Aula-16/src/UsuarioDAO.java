import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {
	
	public static void insert(Usuario usuario) {
		Connection conn = null; // Objeto Connection do JAVA
		PreparedStatement comandoSQL;   // Objeto Comandos SQL do JAVA
		Conexao conexao = new Conexao();	
		conn = conexao.conectar();
		
		String sql =  "Insert Into Usuario (idUsuario,Nome,Email,Telefone,Endereco) VALUES (?, ?, ?, ?, ?)";
					
		conn = conexao.conectar();
		try {
			System.out.println(sql);
			comandoSQL = conn.prepareStatement(sql); // Objeto para execução dos comandos SQL
			comandoSQL.setInt(1, usuario.getIdUsuario());
			comandoSQL.setString(2, usuario.getNome());
			comandoSQL.setString(3, usuario.getEmail());
			comandoSQL.setString(4, usuario.getTelefone());
			comandoSQL.setString(5, usuario.getEndereco());
			comandoSQL.executeUpdate();  // Guardo os resultados em um Objeto Java ResultSet
		} catch (SQLException ex) {
			System.out.println("Problemas na Execução do comando: "+sql);
			ex.printStackTrace();
		} finally {
			conexao.fechar(conn);
		}		
	}
	
	public static void update(Usuario usuario) {
		Connection conn = null; // Objeto Connection do JAVA
		PreparedStatement comandoSQL;   // Objeto Comandos SQL do JAVA
		Conexao conexao = new Conexao();		
		conn = conexao.conectar();
			
		String sql = "Update Usuario Set nome=?,email=?,telefone=?,endereco=? Where idUsuario=?";
		try {
			System.out.println(sql);
			comandoSQL = conn.prepareStatement(sql); // Objeto para execução dos comandos SQL
			comandoSQL.setString(1, usuario.getNome());
			comandoSQL.setString(2, usuario.getEmail());
			comandoSQL.setString(3, usuario.getTelefone());
			comandoSQL.setString(4, usuario.getEndereco());			
			comandoSQL.setInt(5, usuario.getIdUsuario());

			comandoSQL.executeUpdate();  // Guardo os resultados em um Objeto Java ResultSet
		} catch (SQLException ex) {
			System.out.println("Problemas na Execução do comando: "+sql);
			ex.printStackTrace();
		} finally {
			conexao.fechar(conn);
		}		
	}
	
	public static void delete(int idUsuario) {
		Connection conn = null; // Objeto Connection do JAVA
		PreparedStatement comandoSQL;   // Objeto Comandos SQL do JAVA
		Conexao conexao = new Conexao();		
		conn = conexao.conectar();
		
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
	
	public static Usuario find(int idUsuario) {
		Connection conn = null; // Objeto Connection do JAVA
		PreparedStatement comandoSQL;   // Objeto Comandos SQL do JAVA
		Conexao conexao = new Conexao();
		conn = conexao.conectar();
		
		Usuario usuario = null;
		
		String sql = "Select idUsuario,Nome,Email,Telefone,Endereco From Usuario Where idUsuario=?";
		try {
			comandoSQL = conn.prepareStatement(sql); // Objeto para execução dos comandos SQL
			comandoSQL.setInt(1, idUsuario);
			ResultSet rs = comandoSQL.executeQuery();  // Guardo os resultados em um Objeto Java ResultSet
			System.out.println();
			if (rs.next()) {
				usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt("idUsuario"));
			    usuario.setNome(rs.getString("Nome"));
			    usuario.setNome(rs.getString("Email"));
			    usuario.setNome(rs.getString("Telefone"));
			    usuario.setNome(rs.getString("Endereco"));
			}
			System.out.println();
		} catch (SQLException ex) {
			System.out.println("Problemas na Execução do comando: "+sql);
			ex.printStackTrace();
		} finally {
			conexao.fechar(conn);
			return usuario;
		}
	}
	
	public static ArrayList<Usuario> all() {
		Connection conn = null; // Objeto Connection do JAVA
		PreparedStatement comandoSQL;   // Objeto Comandos SQL do JAVA
		Conexao conexao = new Conexao();
		conn = conexao.conectar();
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		String sql = "Select idUsuario,Nome,Email,Telefone,Endereco From Usuario";
		
		try {
			comandoSQL = conn.prepareStatement(sql); // Objeto para execução dos comandos SQL
			ResultSet rs = comandoSQL.executeQuery();  // Guardo os resultados em um Objeto Java ResultSet
			System.out.println();
			
			while (rs.next()) 
				usuarios.add(
					new Usuario(
					 rs.getInt("idUsuario"),
					 rs.getString("Nome"),
					 rs.getString("Email"),
					 rs.getString("Telefone"),
					 rs.getString("Endereco")
					)
				);

			System.out.println();
		} catch (SQLException ex) {
			System.out.println("Problemas na Execução do comando: "+sql);
			ex.printStackTrace();
		} finally {
			conexao.fechar(conn);
			return usuarios;
		}
	}
}
