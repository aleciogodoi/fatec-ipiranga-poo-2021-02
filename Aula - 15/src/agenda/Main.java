package agenda;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int opcao = 0;
		Agenda agenda = new Agenda();
		
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				agenda.adicionar();
				break;
			case 2:
				try {
					System.out.println(agenda.consultar());
				} catch (ContatoException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				agenda.listar();
				break;
			}
			
		} while(opcao!=0);
		System.out.println("\nF I M");
	}
	
	public static int menu() {
		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		
		String menu = "1 - Adicionar\n"
					+ "2 - Consultar\n"
					+ "3 - Listar\n"
					+ "0 - Sair\n"
					+ "Opção: ";
		
		System.out.print(menu);
		opcao = scan.nextInt();
		return opcao;
	}
}
