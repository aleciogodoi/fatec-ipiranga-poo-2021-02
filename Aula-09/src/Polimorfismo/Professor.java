package Polimorfismo;

public class Professor extends Pessoa {
	private String codigo;
	
	public Professor() {
	}
	public Professor(String nome, String identidade,
					 Data dtNascimento, String codigo ) {
		super(nome, identidade, dtNascimento); // chama o construtor da classe Mãe (superclasse)
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Professor [codigo=" + codigo +", "+super.toString()+ "]";
	}
}
