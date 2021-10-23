import java.util.Random;

public class Papagaio extends Ave {

	public Papagaio() {
	}

	public Papagaio(String nome) {
		super(nome);
	}

	@Override
	public void voar() {
		System.out.println("Sou um pagagaio... Estou voando...");
	}
	
	@Override
	public void emitirSom() {
		Random rnd = new Random();
		String[] falas = {"Quero biscoito!","Você já ouviu aquela piada do papagaio...","Tudo bem?","Como vai?"};
		System.out.println("Sou um pagagaio... Estou falando...");
		System.out.println("Meu nome é "+this.getNome());
		System.out.println(falas[rnd.nextInt(falas.length)]);
	}

}
