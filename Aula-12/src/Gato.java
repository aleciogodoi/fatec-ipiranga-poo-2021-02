
public class Gato extends Mamifero {
	private String raca;
	
	public Gato() {
	}

	public Gato(String nome, String raca) {
		super(nome);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void amamentar() {
		System.out.println("Estou amamentando...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Miau!");
		
	}

}
