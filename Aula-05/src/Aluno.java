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
		return "Aluno [Nome=" + nome + ", Matricula=" + matricula + ", Nota1=" + nota1 + ", Nota2=" + nota2
				+ ", Nota Reavaliação=" + notaReavaliacao + ", Média=" + calcularMedia()
				+ ", Média Final=" + calcularMediaFinal() + "]";
	}
	
	public double calcularMedia() {
		return ( nota1 + nota2 ) / 2;
	}
	
	public double calcularMediaFinal() {
		if (calcularMedia() >= 6)
			return calcularMedia();
		else
			return ( calcularMedia() + notaReavaliacao ) / 2;
	}
}
