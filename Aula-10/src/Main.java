import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		DespesaPessoal dp01 = new DespesaPessoal("112.121.098-97");
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 8, 29), "Conta de Luz", 102.23 ));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 8, 29), "Mercado", 140.43 ));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 8, 30), "Internet", 108.09 ));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 8, 30), "Feira", 60.76 ));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 9, 29), "Conta de Luz", 102.23 ));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 9, 29), "Mercado", 55.43 ));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 9, 30), "Internet", 108.09 ));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 9, 30), "Feira", 31.76 ));
		System.out.println(dp01);
		System.out.println("Total: "+dp01.getTotal());
		System.out.println("Total 08/2021: "+dp01.getTotal(8, 2021));
		System.out.println("Total 09/2021: "+dp01.getTotal(9, 2021));
	}

}
