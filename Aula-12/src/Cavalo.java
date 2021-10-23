
public class Cavalo extends Mamifero implements AnimalDomesticado{

	public Cavalo() {
	}

	public Cavalo(String nome) {
		super(nome);
	}

	@Override
	public void amamentar() {
		System.out.println("Estou amamentando...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Estou relinchando...");
	}

	@Override
	public void levarVeterinario() {
		System.out.println("Estou doente...");
	}

	@Override
	public void alimentar() {
		System.out.println("Hora da merenda!");
	}

}
