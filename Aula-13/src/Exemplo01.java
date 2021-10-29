
public class Exemplo01 {
	
	public static void main(String[] args) {
		int a = 7, b = 0;
		String valor = "12.6fd";
		
		int[] v = {6, 8, 9, -2, 10};

		System.out.printf("a+b=%d\n", (a+b));
		System.out.printf("a-b=%d\n", (a-b));
		System.out.printf("a*b=%d\n", (a*b));
		
		try {
			System.out.printf("a*b=%d\n", (a/b));
		} catch (ArithmeticException ex)  {
			System.out.printf("Voce nao pode dividir um inteiro por ZERO!\n");
		} finally {
			System.out.printf("Passei pelo ponto 1\n");
		}
		
		try {
			System.out.printf("%d\n", v[4]);
			System.out.printf("%.2f\n", (Float.valueOf(valor)*5) );
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();	
		} finally {
			System.out.printf("Passei pelo ponto 2\n");
		}
		
		try {
			System.out.printf("%.2f\n", (Float.valueOf(valor)*5) );
		} catch (NumberFormatException ex) {
			System.out.printf("Problema: "+ex.getMessage()+"\n");
		} finally {
			System.out.printf("Passei pelo ponto 3\n");
		}
		
		System.out.printf("F I M");
		
	}

}
