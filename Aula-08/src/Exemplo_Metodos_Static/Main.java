package Exemplo_Metodos_Static;

public class Main {

	public static void main(String[] args) {

		System.out.println("5^3="+FuncoesMatematicas.exponencial(5, 3));
		System.out.println("5!="+FuncoesMatematicas.fatorial(5));
		System.out.println("fibo(1)="+FuncoesMatematicas.fibo(1));
		System.out.println("fibo(2)="+FuncoesMatematicas.fibo(2));
		System.out.println("fibo(3)="+FuncoesMatematicas.fibo(3));
		System.out.println("fibo(4)="+FuncoesMatematicas.fibo(4));
		System.out.println("fibo(5)="+FuncoesMatematicas.fibo(5));
		System.out.println("fibo(6)="+FuncoesMatematicas.fibo(6));

		System.out.println("5+2="+FuncoesMatematicas.soma(5,2));
		
		System.out.println("max(5,2)="+FuncoesMatematicas.max(5, 2));
		

	}

}
