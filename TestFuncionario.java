
public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		
		diego.setNombre("Diego");
		diego.setDocumento("10384031");
		diego.setSalario(3000);
		diego.setTipo(0);
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
