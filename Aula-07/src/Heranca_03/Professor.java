package Heranca_03;

public class Professor extends Pessoa {
	private String codigo;
	
	public Professor(String codigo, String nome, String identidade,
					 Data dtNascimento ) {
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
