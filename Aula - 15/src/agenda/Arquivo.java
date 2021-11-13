package agenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Arquivo {
	private static String arquivo;
	private static File myObj;
	
	private static void criar() {
		arquivo = "agenda.txt";
		try {
			myObj = new File(arquivo);
			if (myObj.createNewFile()) {
				System.out.println("Arquivo criado: "+myObj.getName());
			}
		} catch (IOException e) {
			System.out.println("Ocorreu um Erro!");
			e.printStackTrace();
		}
	}
	
	public static void gravar(String dados) {
		FileWriter fw;
		criar();
		try {
			fw = new FileWriter(arquivo, true);   // Abre arquivo para gravação
			fw.write(dados);                      // Grava "dados"
			fw.close();                           // Fecha o arquivo
		} catch (IOException e) {
			System.out.println("Ocorreu um Erro!");
			e.printStackTrace();
		}
	}
	
	public static ArrayList<String> ler() {
		ArrayList<String> dados = new ArrayList<String>();
		criar();
		try {
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) 
				dados.add(myReader.nextLine());
			myReader.close();
		} catch (FileNotFoundException  e) {
			System.out.println("Ocorreu um Erro!");
			e.printStackTrace();
		}	
		return dados;
	}
	
}
