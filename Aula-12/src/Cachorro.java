
public class Cachorro extends Mamifero{
	private String raca;
	private float tamanho;
	
	public Cachorro() {
	}

	public Cachorro(String nome, String raca, float tamanho) {
		super(nome);
		this.raca = raca;
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void amamentar() {
		System.out.println("Amamentando...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Au!!Au!!");
	}

}
