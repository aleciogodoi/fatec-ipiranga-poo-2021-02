package Exercicio_02;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Veiculo v01 = new Veiculo();
		
		Scanner meuScanner = new Scanner(System.in);
		System.out.print("Entre com a placa: ");
		v01.setPlaca(meuScanner.nextLine());
		System.out.print("Entre com o ano: ");
		v01.setAno(meuScanner.nextInt());
		
		System.out.println(v01);
	}

}
