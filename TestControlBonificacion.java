
public class TestControlBonificacion {

	public static void main(String[] args) {
		
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		ControlBonificaciones controlBonificacion = new ControlBonificaciones();
		
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);

	}
}
