package banco.tests;

import banco.modelo.Cuenta;
import banco.modelo.CuentaCorriente;
import banco.modelo.GuardadorDeCuentas;

public class TestGuardador {
	
	public static void main(String[] args) {
		
	    GuardadorDeCuentas guardador = new GuardadorDeCuentas();

	    Cuenta cc = new CuentaCorriente(22, 11);
	    guardador.adicionar(cc);
	    
	    Cuenta cc2 = new CuentaCorriente(22, 22);
	    guardador.adicionar(cc2);

	    int tamano = guardador.getCantidadDeElementos();
	    System.out.println(tamano);

	    Cuenta ref = guardador.getReferencia(0);
	    System.out.println(ref.getNumero());
	}
}

