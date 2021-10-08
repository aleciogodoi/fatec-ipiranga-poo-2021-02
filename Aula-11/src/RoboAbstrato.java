public abstract class RoboAbstrato {
	private String nomeDoRob�;
	private int posi��oXAtual, posi��oYAtual;
	private short dire��oAtual;

	RoboAbstrato(String n, int px, int py, short d) {
		nomeDoRob� = n;
		posi��oXAtual = px;
		posi��oYAtual = py;
		dire��oAtual = d;
	}

	public abstract void move(int passos);

	public void moveX(int passos) {
		posi��oXAtual += passos;
	}

	public void moveY(int passos) {
		posi��oYAtual += passos;
	}

	public void mudaDire��o(short novaDire��o) {
		dire��oAtual = novaDire��o;
	}

	public short qualDire��oAtual() {
		return dire��oAtual;
	}

	@Override
	public String toString() {
		return "RoboAbstrato [nomeDoRob�=" + nomeDoRob� + ", posi��oXAtual=" + posi��oXAtual + ", posi��oYAtual="
				+ posi��oYAtual + ", dire��oAtual=" + dire��oAtual + "]";
	}

	
}