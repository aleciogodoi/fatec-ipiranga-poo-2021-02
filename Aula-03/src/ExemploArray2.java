import java.util.Random;

public class ExemploArray2 {
	public static void main(String[] args) {
		int[] inteiros = new int[20];  // criando um array com 20 elementos
		Random rnd = new Random();     // criando um objeto do tipo randomico

		System.out.println(rnd.nextInt(100));
		
		for(int i=0; i < inteiros.length; i++) {
			inteiros[i] = rnd.nextInt(100);
			System.out.println("inteiros["+i+"]="+inteiros[i]);
		}
	}
}
