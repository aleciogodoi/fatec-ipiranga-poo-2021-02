public class Main {
	public static void main(String[] args) {
		Papagaio loro = new Papagaio("Loro Jos�");
		loro.emitirSom();
		loro.voar();
		
		Gato bichano = new Gato("Bichano","Angora");
		bichano.amamentar();
		bichano.emitirSom();
		bichano.brincar();
		bichano.levarPassear();

		Cachorro bidu = new Cachorro("Bidu","Vira-latas",3);
		bidu.amamentar();
		bidu.emitirSom();
		bidu.brincar();
		bidu.levarPassear();

		Cavalo corcel = new Cavalo("Corcel");
		corcel.amamentar();
		corcel.emitirSom();
	}
}
