public class Aluno {
	// Atributos
	String nome;
	String matricula;
	private double nota1;
	private double nota2;
	private double notaReavaliacao;
	private boolean aprovado; 
	
	// Construtor vazio
	Aluno(){
	}
	// Construtor com parametros
	Aluno(String nome, String matricula,
		  double nota1, double nota2,
		  double notaReavaliacao) {
		this.nome = nome;
		this.matricula = matricula;
		setNota1(nota1);
		setNota2(nota2);
		setNotaReavaliacao(notaReavaliacao);
		aprovado = (calcularMediaFinal() >= 6);
	}
	@Override
	public String toString() {
		return "Aluno [Nome=" + nome + ", Matricula=" + matricula + ", Nota1=" + nota1 + ", Nota2=" + nota2
				+ ", Nota Reavaliação=" + notaReavaliacao + ", Média=" + calcularMedia()
				+ ", Média Final=" + calcularMediaFinal() 
				+ ", Aprovado="+aprovado+ "]";
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
	
	public boolean getAprovado() {
		return aprovado;
	}

	public void setNota1(double n1) {
		if (n1>=0 && n1<=10) {
			nota1 = n1;
			aprovado = (calcularMediaFinal() >= 6);
		} else {
			System.out.println("Nota 1="+n1+ " - Valor Inválido!");
		}
	}

	public void setNota2(double n2) {
		if (n2>=0 && n2<=10) {
			nota2 = n2;
			aprovado = (calcularMediaFinal() >= 6);
		} else {
			System.out.println("Nota 2="+n2+ " - Valor Inválido!");
		}
	}

	public void setNotaReavaliacao(double n) {
		if (n>=0 && n<=10) {
			notaReavaliacao = n;
			aprovado = (calcularMediaFinal() >= 6);
		} else {
			System.out.println("Nota Reavaliação="+n+ " - Valor Inválido!");
		}
	}
	public double getNota1() {
		return nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public double getNotaReavaliacao() {
		return notaReavaliacao;
	}
}
