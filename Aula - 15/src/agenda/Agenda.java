package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	private ArrayList<Contato> contatos;
	
	Agenda() {
		contatos = new ArrayList<Contato>();
		this.carga();
	}
	
	public Contato consultar() throws ContatoException {
		Contato contato = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNome: ");
		String nome = sc.nextLine();
		
		for (Contato c: getContatos()) {
			if (c.getNome().equalsIgnoreCase(nome) )
				contato = c;
		}
		
		if (contato == null) {
			throw new ContatoException("Contato Não Existe!");
		}
		return contato;
	}
	
	public ArrayList<Contato> carga() {
		ArrayList<String> dados = Arquivo.ler(); 
		for (String dado: dados) {
			
			Contato contato = new Contato();
			String[] aux = dado.split(",");
			
			contato.setId(Integer.valueOf(aux[0]));
			contato.setNome(aux[1]);
			contato.setTelefone(aux[2]);
			
			contatos.add(contato);
		}
		return contatos;
	}
	
	public void adicionar() {
		Contato contato = entrada();
		contatos.add(contato);
		Arquivo.gravar(contato.toString());
	}
	
	public void listar() {
		System.out.println();
		for (Contato contato: this.getContatos())
			System.out.print(contato.toString());
		System.out.println();
	}
	
	public Contato entrada() {
		Contato contato = new Contato();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNome: ");
		String nome = sc.nextLine();

		System.out.print("Telefone: ");
		String telefone = sc.nextLine();

		contato.setNome(nome);
		contato.setTelefone(telefone);
		
		System.out.println();
		return contato;
	}
	
	public ArrayList<Contato> getContatos(){
		return contatos;
	}
	
}
