
public class TesteDAO {

	public static void main(String[] args) {
		for (Usuario usuario: UsuarioDAO.all()) 
			System.out.println(usuario);

		System.out.println(UsuarioDAO.find(2));
		System.out.println(UsuarioDAO.find(10));
		//UsuarioDAO.delete(20);
		
		//UsuarioDAO.insert(new Usuario(20, "Carolina", "carolina@gmail.com", "(11) 91111-0000", "Rua das Acácias, 564"));
		//UsuarioDAO.update(new Usuario(20, "Carolina Silva", "carolina@gmail.com", "(11) 91111-0000", "Rua das Acácias, 5641"));

	}

}
