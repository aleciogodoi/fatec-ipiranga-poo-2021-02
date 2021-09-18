package Exemplo_Atributos_Static;

public class Main {

	public static void main(String[] args) {

		System.out.println("Total Pessoas="+Pessoa.getTotalPessoas());
		Pessoa p01 = new Pessoa(1, "Pedro");
		System.out.println("Total Pessoas="+Pessoa.getTotalPessoas());

		Pessoa p02 = new Pessoa(2, "Mateus");
		System.out.println("Total Pessoas="+Pessoa.getTotalPessoas());
		
		Pessoa p03 = new Pessoa(10, "Ana");
		System.out.println("Total Pessoas="+Pessoa.getTotalPessoas());
	}

}
