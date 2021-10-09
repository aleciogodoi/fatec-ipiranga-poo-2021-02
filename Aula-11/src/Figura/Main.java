package Figura;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(new Retangulo("azul", 5, 7));
		figuras.add(new Quadrado("amarelo", 5));
		
		System.out.println(figuras.get(0));
		figuras.get(0).draw();
		
		System.out.println(figuras.get(1));
		figuras.get(1).draw();
		
	}

}
