package Figura;

public class Quadrado extends Retangulo {

	public Quadrado(String cor, double lado) {
		super(cor, lado, lado);
	}

	@Override
	public String toString() {
		return "Quadrado [Lado=" + getLado1() + ", area()=" + area() + ", getCor()=" + getCor() + "]";
	}
	
}
