public class RoboSimples extends RoboAbstrato {

	RoboSimples(String n, int px, int py, short d) {
		super(n, px, py, d);
	}

	public void move(int passos) {
		switch (qualDireçãoAtual()) {
		case 0:
			moveX(+passos);
			break;
		case 90:
			moveY(+passos);
			break;
		case 180:
			moveX(-passos);
			break;
		case 270:
			moveY(-passos);
			break;
		}
	}

}
