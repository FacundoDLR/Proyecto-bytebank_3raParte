package banco.tests;

import banco.modelo.CuentaCorriente;
import banco.modelo.Cuenta;
import banco.modelo.CuentaAhorros;

public class TestArrayDeReferencia {

	public static void main(String[] args) {
		
		Cuenta[] cuentas = new Cuenta[5];
        CuentaCorriente cc1 = new CuentaCorriente(22, 11);
        cuentas[0] = cc1;

        CuentaAhorros cc2 = new CuentaAhorros(22, 22);
        cuentas[1] = cc2;    

        System.out.println( cuentas[1].getNumero()  );

        CuentaCorriente ref = (CuentaCorriente) cuentas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
	}
}
