import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo_ArrayList {

	static Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
	public static void main(String[] args) {
		/*
		String[] nomes = new String[5];
		nomes[0] = "Ana";
		nomes[1] = "Carolina";
		nomes[2] = "Arthur";
		nomes[3] = "Pedro";
		nomes[4] = "Sara";*/

		ArrayList<String> carros = new ArrayList<String>();
		
		int opcao=0;
		do {
			opcao=menu();
			switch (opcao) { 
				case 1: {
					carros.add(entradaCarro());
					break;
				}
				case 2: {
					imprimir(carros);
					break;
				}
				case 3: {
					int indice = carros.indexOf(entradaCarro());
					if (indice != -1)
						carros.remove(indice);
					else
						System.out.println("Carro n�o encontrado!!!");
					break;
				}
				case 4: {
					carros.clear();
					break;
				}
			}
		} while (opcao !=0 );
		System.out.println("\nFIM");
	}
	
	public static String entradaCarro() {
		System.out.print("Carro: ");
		String item = meuScanner.nextLine();
		return item;
	}
	
	public static void imprimir (ArrayList<String> carros) {
		for(int i=0; i < carros.size(); i++) {
			System.out.println(carros.get(i));
		}
	}
	
	public static int menu() {
		System.out.println(	"\n0 - Sair\n"
							+ "1 - Incluir\n"
							+ "2 - Imprimir\n"
							+ "3 - Excluir\n"
							+ "4 - Limpar\n");
		System.out.print("Escolha uma op��o: ");
		int opcao = meuScanner.nextInt();
		meuScanner.nextLine();
		return opcao;
	}

}
