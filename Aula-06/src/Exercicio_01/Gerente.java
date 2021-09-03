package Exercicio_01;

public class Gerente extends Funcionario {
	private int senha;
	
	public Gerente() {
	}

	public Gerente(String n, String c, double s, int senha) {
		super(n, c, s);
		this.senha = senha;
	}

	public boolean autentica(int pass) {
		return true;
	}

	@Override
	public String toString() {
		return "Gerente [senha=" + senha + "] - " + super.toString();
	}
	
}
