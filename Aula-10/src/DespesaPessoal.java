import java.time.LocalDate;
import java.util.ArrayList;

public class DespesaPessoal {
	private String cpf;
	ArrayList<Despesa> despesas;
	
	DespesaPessoal (String cpf) {
		this.cpf = cpf;
		despesas = new ArrayList<Despesa>();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(ArrayList<Despesa> despesas) {
		this.despesas = despesas;
	}

	@Override
	public String toString() {
		return "DespesaPessoal [cpf=" + cpf + ", despesas=" + despesas + "]";
	}

	public double getTotal() {
		return 0;
	}

	public double getTotal(int mes, int ano) {
		return 0;
	}
	
	public double getTotal(LocalDate data) {
		return 0;
	}

	public void imprime() {
		
	}
	
	public void imprime(int mes, int ano) {
		
	}
	
	public void imprime(LocalDate data) {
		
	}
	
}
