package Polimorfismo_Sobrecarga;

public class Main {

	public static void main(String[] args) {
		int[] x = {7, 9, 4, 3, 8, 12, 15, 21, 1, 2, 53};
		System.out.println(FuncoesMatematicas.soma(5, 7));
		System.out.println(FuncoesMatematicas.soma(5.5f, 7.3f));
		System.out.println(FuncoesMatematicas.soma("Olá ", "Mundo!"));
		System.out.println(FuncoesMatematicas.soma(x));
		System.out.println(FuncoesMatematicas.soma(10));
		
	}

}
