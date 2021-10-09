package Figura;

public class Circulo extends Figura{
	private double raio;
	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
	@Override
	public void draw() {
		System.out.println("Desculpe! Não consigo desenhar!!!");
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getDiametro() {
		return raio * 2;
	}
	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", area()=" + area() + ", getDiametro()=" + getDiametro() + ", getCor()="
				+ getCor() + "]";
	}
	
}
