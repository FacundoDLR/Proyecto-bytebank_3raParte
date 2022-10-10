package banco.tests;

import banco.modelo.CuentaCorriente;

public class TestArrayReferencias {

	public static void main(String[] args) {
		
		CuentaCorriente[] cuentas = new CuentaCorriente[5];
		
		CuentaCorriente cc1 = new CuentaCorriente(22, 11);
        CuentaCorriente cc2 = new CuentaCorriente(22, 22);

        cuentas[0] = cc1;
        cuentas[1] = cc2;
        
        System.out.println(cuentas[0].getNumero());
        
        int[] refs = {1,2,3,4,5};
        
        for (int i = 0; i < refs.length; i++) {
        	System.out.println(refs[i]);
        }
	}
}
