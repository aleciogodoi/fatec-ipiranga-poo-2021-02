import java.util.Scanner;

public class LoopDoWhile {
	public static void main(String[] args) {
	    Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
	    int n;
	    int i=1;
	    do {
		    System.out.print("Digite um n�mero: ");
			n = meuScanner.nextInt();
			
			if (n % 2 == 0) {
				System.out.println(n+" � par!");
			}
			else {
				System.out.println(n+" � �mpar!");		
			}
			i++;
	    } while (i < 4);
	}

}
