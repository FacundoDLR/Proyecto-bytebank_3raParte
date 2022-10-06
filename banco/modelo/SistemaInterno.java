package banco.modelo;

public class SistemaInterno {

	private String clave = "12345";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeInciarSesion = gerente.iniciarSesion(clave);
		if(puedeInciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		}else {
			System.out.println("Error login");
			return false;
		}
	}
}
