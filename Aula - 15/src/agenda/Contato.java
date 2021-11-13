package agenda;

public class Contato {
	private static int contador;
	private int id;
	private String nome; 
	private String telefone;  
	
	Contato() {
		this.contador++;
		this.id = contador;
	}
	
	Contato(String nome, String telefone) {
		this();						// chama o construtor sem parametro
		this.nome = nome;
		this.telefone = telefone;
	}

	public static int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
		this.id = this.contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return id + "," + nome + "," + telefone +"\n";
	}
}
