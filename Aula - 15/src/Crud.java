import java.sql.Connection;
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
		System.out.println();
		opcao = sc.nextInt();
		return opcao;
	}

}
