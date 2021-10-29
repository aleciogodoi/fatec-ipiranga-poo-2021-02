import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {
		String n1="", n2="";
		int a=0, b=0;	
		boolean excecao = true;
		
		do {
			try {
				n1 = JOptionPane.showInputDialog("1o. Numero inteiro:");
				n2 = JOptionPane.showInputDialog("2o. Numero inteiro:");
				a = Integer.valueOf(n1);
				b = Integer.valueOf(n2);
				excecao = false;
			} catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,
						"Digite somente numeros inteiros\n"+
						ex.getMessage()+"\n"+ex.getStackTrace());
				excecao = true;
			}
		} while(excecao);

		JOptionPane.showMessageDialog(null, "a+b="+(a+b));

	}

}
