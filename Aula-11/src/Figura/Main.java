package Figura;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(new Retangulo("azul", 5, 7));
		figuras.add(new Quadrado("amarelo", 5));
		figuras.add(new Triangulo("vermelho", 5, 9));
		figuras.add(new Circulo("verde", 5));
		
		for(Figura f: figuras) {
			System.out.println(f);
			f.draw();
		}
		
	}

}
