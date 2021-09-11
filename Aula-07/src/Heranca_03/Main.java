package Heranca_03;

public class Main {
	public static void main(String[] args) {
		Data d01 = new Data(1, 5, 2010);
		Data d02 = new Data(15, 12, 2015);
		System.out.println(d01);
		System.out.println(d02);

		Pessoa p01 = new Pessoa("Ana", "121212-09", d01);
		Pessoa p02 = new Pessoa("Manuel", "98765431-77", new Data(22, 7, 2000));

		System.out.println(p01);
		System.out.println(p02);
	}
}
