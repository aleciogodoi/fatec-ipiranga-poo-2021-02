package Heranca_03;

public class Funcionario extends Pessoa{
	private Data dtAdmissao; 
	private float salario;
	
	public Funcionario(String nome, String identidade, Data dtNascimento, 
						Data dtAdmissao, float salario) {
		super(nome, identidade, dtNascimento);
		this.dtAdmissao = dtAdmissao;
		this.salario = salario;
	}

	public Data getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(Data dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [dtAdmissao=" + dtAdmissao + ", salario=" + salario + "]";
	}

}
