public class TesteAluno {
	public static void main(String[] args) {
		Aluno aluno01 = new Aluno("Alana", "1010-1", 10.0, 10.0, 0.0);
		Aluno aluno02 = new Aluno("Matheus", "1010-2", 8.0, 3.0, 3.0);

		System.out.println(aluno01.toString());
		System.out.println(aluno01.calcularMedia());	
		
		aluno02.setNotaReavaliacao(7.0);
		System.out.println(aluno02.toString());
		System.out.println("Média: "+aluno02.calcularMedia());
		System.out.println("Média Final: "+aluno02.calcularMediaFinal());
		System.out.println("Aprovado:"+aluno02.getAprovado());
		System.out.println(aluno02.getNota1());
		
	}
}
