
public class Main {

	public static void main(String[] args) {
		RoboSimples robo01 =  new RoboSimples("Robo XPTO", 0, 0, (short) 90);
		System.out.println(robo01);
		robo01.move(10);
		System.out.println(robo01);

	}

}
