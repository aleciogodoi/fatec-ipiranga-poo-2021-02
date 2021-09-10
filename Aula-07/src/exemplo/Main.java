package exemplo;

public class Main {

	public static void main(String[] args) {
		Pessoa p01 = new Pessoa();
		System.out.println(p01);
		
		Pessoa p02 = new Pessoa("121212109", "Ana");
		System.out.println(p02);
		
		p02.entradaDados();
		System.out.println(p02);

		Pessoa p03 = new Pessoa("Carlos");
		System.out.println(p03);
	}

}

