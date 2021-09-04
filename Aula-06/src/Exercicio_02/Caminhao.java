package Exercicio_02;

public class Caminhao extends Veiculo {
	private int eixos;
	
	Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	@Override
	public String toString() {
		return "Caminhao [eixos=" + eixos + "] - " + super.toString();
	}

		
}
