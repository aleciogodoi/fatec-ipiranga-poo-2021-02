public class Aluno {
	// Atributos
	String nome;
	String matricula;
	Double nota1;
	Double nota2;
	Double notaReavaliacao;
	// Construtor vazio
	Aluno(){
	}
	// Construtor com parametros
	Aluno(String nome, String matricula,
		  Double nota1, Double nota2,
		  Double notaReavaliacao) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaReavaliacao = notaReavaliacao;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", notaReavaliacao=" + notaReavaliacao + ", Média=" + calcularMedia() + "]";
	}
	
	public double calcularMedia() {
		return ( nota1 + nota2 ) / 2;
	}

}
