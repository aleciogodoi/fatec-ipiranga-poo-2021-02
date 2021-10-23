import java.util.Random;

public class Cachorro extends Mamifero implements AnimalEstimacao {
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
	
	@Override
	public void brincar() {
		Random rnd = new Random();
		String[] brincadeiras = {"Pegando a bolinha...","Brincando de correr...","Brincando na piscina..."};
		System.out.println(brincadeiras[rnd.nextInt(brincadeiras.length)]);		
	}
	
	@Override
	public void levarPassear() {
		System.out.println("Dando um role...");
	}

}
