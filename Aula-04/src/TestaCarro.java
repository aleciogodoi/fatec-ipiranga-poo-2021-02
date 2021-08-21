public class TestaCarro
{
	public static void main(String[] args) {
	    Carro carro1 = new Carro();
	    Carro carro2 = new Carro();
	    
	    carro1.marca = "VW";
	    carro1.modelo = "UP";
	    carro1.cor = "amarelo";
	    carro1.ano = 2019;
	    
	    carro2.marca = "Fiat";
	    carro2.modelo = "147";
	    carro2.cor = "azul";
	    carro2.ano = 1978;
	    
	    System.out.printf("Marca: %s, Modelo: %s, Cor: %s, Ano: %d\n", carro1.marca, carro1.modelo,  carro1.cor, carro1.ano);
	    System.out.printf("Marca: %s, Modelo: %s, Cor: %s, Ano: %d\n", carro2.marca, carro2.modelo,  carro2.cor, carro2.ano);
	    
	    // Array de carros
	    Carro [] carros = new Carro[3];
	    carros[0] = new Carro();
	    carros[1] = new Carro();
	    carros[2] = new Carro();
	    
	    carros[0].marca = "Fiat";
	    carros[0].modelo = "Elba";
	    carros[0].cor = "marrom";
	    carros[0].ano = 1989;

	    carros[1].marca = "Ferrari";
	    carros[1].modelo = "F40";
	    carros[1].cor = "vermelha";
	    carros[1].ano = 1992;

	    carros[2].marca = "GM";
	    carros[2].modelo = "Chevete";
	    carros[2].cor = "prata";
	    carros[2].ano = 1994;
	    
	    for (int i = 0; i < carros.length; i++) {
	         System.out.printf("Marca: %s, Modelo: %s, Cor: %s, Ano: %d\n", carros[i].marca, carros[i].modelo,  carros[i].cor, carros[i].ano);
	    }
	}
}