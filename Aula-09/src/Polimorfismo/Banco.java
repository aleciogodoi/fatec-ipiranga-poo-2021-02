package Polimorfismo;

public class Banco {
	public static float emprestimo(Pessoa pessoa) {
		int valorEmprestimo=0;
		if (pessoa instanceof Professor)
			valorEmprestimo=1000;
		else if (pessoa instanceof Aluno)
			valorEmprestimo=500;
		else if (pessoa instanceof Gerente)
			valorEmprestimo=2500;		
		else if (pessoa instanceof Funcionario)
			valorEmprestimo=1500;
		return valorEmprestimo;
	}
}
