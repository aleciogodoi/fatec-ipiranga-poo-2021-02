import java.util.Scanner;  // Importando a Classe Scanner
public class DesvioCondicional {
	public static void main(String[] args) {
		
	    Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
	    int n;
	    
	    System.out.print("Digite um número: ");
		n = meuScanner.nextInt();
		
		if (n % 2 == 0) {
			System.out.println(n+" é par!");
		}
		else {
			System.out.println(n+" é ímpar!");		
		}
	}
}
