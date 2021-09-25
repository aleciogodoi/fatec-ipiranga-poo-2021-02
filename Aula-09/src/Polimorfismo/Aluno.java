package Polimorfismo;

public class Aluno extends Pessoa {
	
	private String ra;
	private int nrFaltas;
	
	public Aluno(String nome, String identidade, Data dtNascimento,
			String ra, int nrFaltas) {
		super(nome, identidade, dtNascimento);
		this.ra = ra;
		this.nrFaltas = nrFaltas;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public int getNrFaltas() {
		return nrFaltas;
	}

	public void setNrFaltas(int nrFaltas) {
		this.nrFaltas = nrFaltas;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nrFaltas=" + nrFaltas +", "+ super.toString() +"]";
	}
}
