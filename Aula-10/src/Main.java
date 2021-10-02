import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	static int dia;
	static int mes;
	static int ano;
	static String itemDespesa;
	static double valor;
	static Scanner sc = new Scanner(System.in);
	static DespesaPessoal despesas;
	
	public static void main(String[] args) {
		int opcao=0;
		
		System.out.print("\nCPF: ");
		despesas = new DespesaPessoal(sc.nextLine());

		String menu= "\nControle despesas CPF: "+despesas.getCpf()+"\n"
				+ "Escolha uma das Opções:\n"
				+ "1 - Lançamentos de despesas\n"
				+ "2 - Total geral de despesas\n"
				+ "3 - Total de despesas mês/ano\n"
				+ "4 - Total de despesas dia/mês/ano\n"
				+ "5 - Imprimir todas as despesas\n"
				+ "6 - Imprimir despesas mês/ano\n"
				+ "7 - Imprimir despesas dia/mês/ano\n"
				+ "0 - Sair\n"
				+ "Opção: ";
		
		do {
			System.out.print(menu);
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				entradaDespesas();
				break;
			case 2:
				System.out.println("\nTotal das Despesas: "+despesas.getTotal());
				break;
			case 3:
				entradaMes();
				entradaAno();
				System.out.println("\nTotal das Despesas "+mes+"/"+ano+": "+despesas.getTotal(mes, ano));
				break;
			case 4:
				entradaDia();
				entradaMes();
				entradaAno();
				System.out.println("\nTotal das Despesas "+mes+"/"+ano+": "+despesas.getTotal(LocalDate.of(ano, mes, dia)));
				break;
			case 5:
				despesas.imprime();
				break;
			case 6:
				entradaMes();
				entradaAno();
				despesas.imprime(mes, ano);
				break;
			case 7:				
				entradaDia();
				entradaMes();
				entradaAno();
				despesas.imprime(LocalDate.of(ano, mes, dia));
				break;
			}
			
		} while(opcao!=0);
		
		System.out.println("F I M");
	}
	
	public static void entradaDespesas() {
		entradaDia();
		entradaMes();
		entradaAno();
		sc.nextLine();
		System.out.print("\nDespesa: ");
		itemDespesa = sc.nextLine();

		System.out.print("\nValor: ");
		valor = sc.nextDouble();
		despesas.getDespesas().add(new Despesa(LocalDate.of(ano, mes, dia), itemDespesa, valor));
	}

	public static void entradaDia() {
		System.out.print("\nDia: ");
		dia = sc.nextInt();
	}
	public static void entradaMes() {
		System.out.print("\nMês: ");
		mes = sc.nextInt();
	}
	public static void entradaAno() {
		System.out.print("\nAno: ");
		ano = sc.nextInt();		
	}
}
