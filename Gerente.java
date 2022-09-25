
public class Gerente extends Autenticable {

	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		return super.getSalario() + this.getSalario() * 0.05; 
	}
}
