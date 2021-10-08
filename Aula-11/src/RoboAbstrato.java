public abstract class RoboAbstrato {
	private String nomeDoRobô;
	private int posiçãoXAtual, posiçãoYAtual;
	private short direçãoAtual;

	RoboAbstrato(String n, int px, int py, short d) {
		nomeDoRobô = n;
		posiçãoXAtual = px;
		posiçãoYAtual = py;
		direçãoAtual = d;
	}

	public abstract void move(int passos);

	public void moveX(int passos) {
		posiçãoXAtual += passos;
	}

	public void moveY(int passos) {
		posiçãoYAtual += passos;
	}

	public void mudaDireção(short novaDireção) {
		direçãoAtual = novaDireção;
	}

	public short qualDireçãoAtual() {
		return direçãoAtual;
	}

	@Override
	public String toString() {
		return "RoboAbstrato [nomeDoRobô=" + nomeDoRobô + ", posiçãoXAtual=" + posiçãoXAtual + ", posiçãoYAtual="
				+ posiçãoYAtual + ", direçãoAtual=" + direçãoAtual + "]";
	}

	
}