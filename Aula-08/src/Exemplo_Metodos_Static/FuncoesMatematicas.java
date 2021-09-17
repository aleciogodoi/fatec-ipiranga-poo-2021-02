package Exemplo_Metodos_Static;

public class FuncoesMatematicas {
	public static int exponencial(int x, int y) {
		if (y == 0)
			return 1;
		return x * exponencial(x, y - 1);
	}

	public static int fatorial(int x) {
		if (x == 0)
			return 1;
		return x * fatorial(x - 1);
	}
	
	public static int fibo(int n) {
		if (n < 2)
			return n;
		return fibo(n-1) + fibo(n-2);
	}
	
	public static int soma(int a, int b) {
		return a+b;
	}
	
	public static int max(int a, int b) {
		if (a > b)
			return a;
		else 
			return b;
	}
}