
public class OperadoresRelacionais {

	public static void main(String[] args) {
		System.out.println("5 == 3 -> "+ (5 == 3) );
		System.out.println("5 == 5 -> "+ (5 == 5) );
		System.out.println("5 > 3 -> "+ (5 > 3) );
		System.out.println("5 > 5 -> "+ (5 > 5) );
		System.out.println("5 >= 3 -> "+ (5 >= 3) );
		System.out.println("5 <= 5 -> "+ (5 <= 5) );
		System.out.println("5 != 3 -> "+ (5 != 3) );
		System.out.println("5 != 5 -> "+ (5 != 5) );
		
		System.out.println("5 != 5 && 6 > 3 -> "+ (5 != 5 && 6 > 3) );
		System.out.println("5 != 5 || 6 > 3 -> "+ (5 != 5 || 6 > 3) );
		System.out.println("5 != 5 || 6 > 3 && 1 < 0 -> "+ (5 != 5 || 6 > 3 && 1 < 0) );		
		
	}

}
