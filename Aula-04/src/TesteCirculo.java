
public class TesteCirculo
{
	public static void main(String[] args) {
	     // Variaveis 
		int numero=8;
		int nota=7;
		float altura=1.6f;
		
		// Criando objetos da classe/tipo Circulo
		Circulo circulo1 = new Circulo();
		Circulo circulo2 = new Circulo();
		
		circulo1.mover(5.5f, 7.2f);
		circulo1.redimensionar(10f);
		System.out.println(circulo1.toString());
		System.out.println(circulo1.calcularArea());
		System.out.println(circulo2);
	
	}
}
