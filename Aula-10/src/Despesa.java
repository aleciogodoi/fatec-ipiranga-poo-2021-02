import java.time.LocalDate;

public class Despesa {
	private LocalDate data;
	private String descDespesa;
	private double valor;
	
	Despesa(LocalDate data, String descDespesa, double valor){
		this.data = data;
		this.descDespesa = descDespesa;
		this.valor = valor;
	}
	
	public LocalDate getData() {
		return this.data;
	}

	public String getDescDespesa() {
		return descDespesa;
	}

	public void setDescDespesa(String descDespesa) {
		this.descDespesa = descDespesa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Despesa [data=" + data + ", descDespesa=" + descDespesa + ", valor=" + valor + "]";
	}
}
