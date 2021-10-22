public abstract class Animal {
	private String nome;
	
	Animal(){
	}
	
	Animal(String nome) {
		this.nome = nome;
	}
	
	public abstract void emitirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
