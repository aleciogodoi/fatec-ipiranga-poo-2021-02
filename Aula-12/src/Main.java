public class Main {
	public static void main(String[] args) {
		Papagaio loro = new Papagaio("Loro José");
		loro.emitirSom();
		loro.voar();
		System.out.println();
		
		Gato bichano = new Gato("Bichano","Angora");
		bichano.amamentar();
		bichano.emitirSom();
		bichano.brincar();
		bichano.levarPassear();
		bichano.alimentar();
		bichano.levarVeterinario();
		System.out.println();
		
		Cachorro bidu = new Cachorro("Bidu","Vira-latas",3);
		bidu.amamentar();
		bidu.emitirSom();
		bidu.brincar();
		bidu.levarPassear();
		bidu.alimentar();
		bidu.levarVeterinario();
		System.out.println();
		
		Cavalo corcel = new Cavalo("Corcel");
		corcel.amamentar();
		corcel.emitirSom();
		corcel.alimentar();
		corcel.levarVeterinario();
		System.out.println();
		
	}
}
