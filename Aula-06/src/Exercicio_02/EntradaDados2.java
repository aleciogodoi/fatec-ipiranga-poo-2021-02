package Exercicio_02;

import java.util.Scanner;

public class EntradaDados2 {

	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in);
		int n;
		
		System.out.print("Entre qtde. de veículos: ");
		n = meuScanner.nextInt();
		Veiculo[] veiculos = new Veiculo[n];
		
		
		for (int i = 0 ; i < n; i++) {
			meuScanner.nextLine();
			veiculos[i] = new Veiculo();
			System.out.print("Entre com a placa: ");
			veiculos[i].setPlaca(meuScanner.nextLine());
			System.out.print("Entre com o ano: ");
			veiculos[i].setAno(meuScanner.nextInt());
		}
		
//		System.out.println(v01);
	}

}
