public class TesteAluno {
	public static void main(String[] args) {
		Aluno aluno01 = new Aluno("Alana", "1010-1", 10.0, 10.0, 0.0);
		
		System.out.println(aluno01.toString());
		System.out.println(aluno01.calcularMedia());
		
	}
}
