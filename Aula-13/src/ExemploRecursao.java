
public class ExemploRecursao {

	public static void main(String[] args) {
		System.out.println(fatorial(5)); // 5! = 5*4*3*2*1 = 120
	}
	
	public static int fatorial (int n) {
		if (n <= 1)
			return 1;
		return n * fatorial(n-1);
	}

}
