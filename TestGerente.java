
public class TestGerente {

	public static void main(String[] args) {
		
		//Funcionario gerente = new Funcionario();
		Gerente gerente = new Gerente();
		gerente.setSalario(3500);
		gerente.setTipo(1);
		
		gerente.setClave("AluraCursosOnline");
		System.out.println(gerente.getBonificacion());
		
		System.out.println(gerente.iniciarSesion("AluuraCursosOnline"));
	}
}
