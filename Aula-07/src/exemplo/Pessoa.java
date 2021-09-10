package exemplo;
import java.util.Scanner;
public class Pessoa {
	private String cpf;
	private String nome;
	
	public Pessoa() {
		this.entradaDados();
	}
	
	public Pessoa(String cpf, String nome) {
		this.setCpf(cpf);
		this.nome = nome;
	}	
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + "]";
	}
	public void entradaDados() {
		Scanner meuScanner = new Scanner(System.in);
		System.out.print("Nome: ");
		this.nome = meuScanner.nextLine();
		System.out.print("CPF: ");
		this.cpf = meuScanner.nextLine();
	}
	public static void hello() {
		System.out.println("Hello");
	}
}
