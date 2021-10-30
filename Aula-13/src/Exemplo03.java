import java.io.FileNotFoundException;

public class Exemplo03 {

	public static void main (String []args) {
		abrirArquivo();
		System.out.printf("F I M");
	}
	
	public static void abrirArquivo() {
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!!!");
			e.printStackTrace();
		} 
	} 
	
}