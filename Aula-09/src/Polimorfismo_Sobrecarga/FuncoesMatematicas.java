package Polimorfismo_Sobrecarga;
public class FuncoesMatematicas {
	public static int soma(int a, int b) {
		return a+b;
	}
	
	public static float soma(float a, float b) {
		return a+b;
	}

	public static String soma(String a, String b) {
		return a+b;
	}

	public static int soma(int[] a) {
		int total=0;
		//for(int n: a) 
		//	total += n;	
		for(int i=0; i < a.length; i++) 
			total += a[i];
		return total;
	}
	
	public static int soma(int a) {
		return 2*a;
	}

	public static float soma(float x, int y) {
		return x + y;
	}
	
	public static float soma(int x, float y) {
		return x + y;
	}
	
}
