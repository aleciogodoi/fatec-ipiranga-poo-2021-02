import java.util.Scanner;  // Importando a Classe Scanner

public class EntradaDados {
	public static void main(String[] args) {
		// variaveis
		// <tipo> <nome>
		String nome;
		float peso;
		int idade;
		float altura; 
		
	    Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
	    System.out.print("Nome: ");
	    nome = meuScanner.nextLine();                // L� os dados digitados
	    System.out.print("Peso: ");
	    peso = meuScanner.nextFloat();                // L� os dados digitados
	    System.out.print("Idade: ");
	    idade = meuScanner.nextInt();                // L� os dados digitados
	    System.out.print("Altura: ");
	    altura = meuScanner.nextFloat();                // L� os dados digitados

		System.out.println("Nome: " + nome);
		System.out.printf("%s%3.1f%n","Peso: ", peso);
		System.out.printf("%s%d%n","Idade: ", idade);
		System.out.printf("%s%3.1f%n","Altura: ", altura);
		//System.out.printf("%s%s","Nome: ",nome);
		meuScanner.close();
	}
}
