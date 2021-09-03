package Exercicio_01;

public class Main {

	public static void main(String[] args) {
		Funcionario func01 = new Funcionario("Pedro", "1212121-09", 5234.21);
		System.out.println(func01);
		
		Gerente ger01 = new Gerente("Alex", "22212121-87", 9765.87, 1234);
		System.out.println(ger01);
	}

}
