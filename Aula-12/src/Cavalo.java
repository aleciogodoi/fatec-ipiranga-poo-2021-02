
public class Cavalo extends Mamifero{

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

}
