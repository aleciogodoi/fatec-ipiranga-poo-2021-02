package Exercicio_02;

public class Teste {

	public static void main(String[] args) {
		Veiculo[] veiculos = new Veiculo[5];
		veiculos[0] = new Veiculo("XXX-0909", 1983);
		veiculos[1] = new Veiculo("YYY-2202", 2018);
		veiculos[2] = new Onibus("ZZZ-3030", 2010, 46);
		veiculos[3] = new Onibus("KXP-1521", 2015, 50);
		veiculos[4] = new Caminhao("TXT-1409", 2020, 4);

		for(int i=0; i < veiculos.length; i++) {
			System.out.println(veiculos[i]);
		}
	}
}
