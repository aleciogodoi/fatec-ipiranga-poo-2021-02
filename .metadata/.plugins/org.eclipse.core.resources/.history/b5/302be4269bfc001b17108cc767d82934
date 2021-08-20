import java.util.Scanner;

public class JogoDaVelha {

	static String[][] tabuleiro = 
	{
		{".", ".", "."},
		{".", ".", "."},
		{".", ".", "."}
	};

	public static void main(String[] args) {
		imprime();
		entradaDados();
		imprime();
	}
	
	public static void entradaDados() {
	    int linha, coluna;
	    Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner

	    do {
	    	System.out.print("Digite nr. linha (0 a 2): ");
	    	linha = meuScanner.nextInt();
	    } while (linha < 0 || linha > 2);
	    
	    do {
	    	System.out.print("Digite nr. coluna (0 a 2): ");
	    	coluna = meuScanner.nextInt();
	    }  while (coluna < 0 || coluna > 2);
	    
	    tabuleiro[linha][coluna]= "X";
	}
	
	public static void imprime() {
		for (int linha=0; linha < tabuleiro.length; linha++) {
			for(int coluna=0; coluna < tabuleiro[0].length;  coluna++) {
				System.out.print(tabuleiro[linha][coluna]+" ");
			}
			System.out.println();
		}
	}

}
