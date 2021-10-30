public class Exemplo04 {
	public static void main(String[] args) {	
		ContaCorrente c1 = new ContaCorrente("Joaquim","123");
		System.out.println(c1.toString());
		
		try {
			c1.deposito(-100);
		} catch (ContaException ex) {
			ex.printStackTrace();
		}
		
		ContaCorrente c2 = new ContaCorrente("Antonio","8780");	
		System.out.println(c2.toString());
		try {
			c1.deposito(100);
		} catch (ContaException ex) {
			ex.printStackTrace();
		} 
		
		try {
			c1.tranferencia(150, c2); 
		} catch (ContaException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("F I M");
	}
}
