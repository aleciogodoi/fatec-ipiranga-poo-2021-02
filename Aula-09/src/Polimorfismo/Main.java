package Polimorfismo;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Manuel", "98765431-77", new Data(22, 7, 2000)) );
		pessoas.add(new Professor("Beatriz", "09876541-09",new Data(10, 9, 1999), "1212121") );
		pessoas.add(new Aluno ("Cristina", "09876543-11", new Data(1, 1, 2001), "098712", 10 ));
		pessoas.add(new Funcionario ("Cristina", "032122", new Data(1, 1, 1990), new Data(5, 7, 2015), 5932.76f ));
		pessoas.add(new Gerente ("Claudia", "77779-05", new Data(18, 10, 1982)
									, new Data(13, 9, 2015), 15932.76f, "TI", new Data(13, 9, 2018)  ));

		for (int i=0; i < pessoas.size(); i++)
			System.out.println(pessoas.get(i).toString());
		
	}
}
