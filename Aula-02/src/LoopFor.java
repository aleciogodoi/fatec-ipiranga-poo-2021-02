import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
	    Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
	    int n;

	    for (int i=1; i < 4; i++) {
		    System.out.print("Digite um n�mero: ");
			n = meuScanner.nextInt();
			
			if (n % 2 == 0) {
				System.out.println(n+" � par!");
			}
			else {
				System.out.println(n+" � �mpar!");		
			}
	    }
	}
}
