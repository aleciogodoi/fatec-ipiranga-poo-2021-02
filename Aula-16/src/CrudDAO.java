
import java.util.InputMismatchException;
import java.util.Scanner;

public class CrudDAO {

	static Usuario usuario = new Usuario();
	
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
			default:
				if (opcao!=0)
					System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0 );
		System.out.println("F I M");
	}
	
	public static int menu () {
		Scanner sc = new Scanner(System.in);
		int opcao = 9;
		String menu = "1 - Incluir\n"
					+ "2 - Pesquisar\n"
					+ "3 - Alterar\n"
					+ "4 - Excluir\n"
					+ "5 - Listar\n"
					+ "0 - Sair\n"
					+ "Ecolha uma opção: ";
		System.out.print(menu);
		try {
			opcao = sc.nextInt();
		} catch (InputMismatchException ex) {
		}		
		
		System.out.println();

		return opcao;
	}
	
	public static void listar () {
		for (Usuario usuario: UsuarioDAO.all()) 
			System.out.println(usuario);
	}
	
	public static void pesquisar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Id Usuário: ");
		
		System.out.println(UsuarioDAO.find(sc.nextInt()));	
	}
	
	public static void incluir() {
		usuario = entrada();
		UsuarioDAO.insert(usuario);
	}

	public static void alterar() {
		usuario = entrada();
		UsuarioDAO.update(usuario);
	}

	public static void excluir() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Id Usuário: ");
		int idUsuario = sc.nextInt();
		
		UsuarioDAO.delete(idUsuario);
	}
	
	public static Usuario entrada() {
		Scanner sc = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		System.out.print("Id Usuário: ");
		usuario.setIdUsuario(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Nome: ");
		usuario.setNome(sc.nextLine());
		
		System.out.print("Email: ");
		usuario.setEmail(sc.nextLine());
		
		System.out.print("Telefone: ");
		usuario.setTelefone(sc.nextLine());

		System.out.print("Endereço: ");
		usuario.setEndereco(sc.nextLine());
		
		System.out.println();
		
		return usuario;
	}
}
