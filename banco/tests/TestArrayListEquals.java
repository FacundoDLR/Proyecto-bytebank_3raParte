package banco.tests;

import java.util.ArrayList;

import banco.modelo.Cuenta;
import banco.modelo.CuentaCorriente;

public class TestArrayListEquals {

	public static void main(String[] args) {
		
	    ArrayList<Cuenta> lista = new ArrayList<Cuenta>();

	    Cuenta cc1 = new CuentaCorriente(22, 22);
	    Cuenta cc2 = new CuentaCorriente(22, 22);

	    lista.add(cc1);
	    
	    boolean existe = lista.contains(cc2); //nuevo

	    System.out.println("Ya existe? " + existe);

	    for(Cuenta cuenta : lista){
	        System.out.println(cuenta);
	    }
	    
	    boolean igual = cc1.equals(cc2);
	    System.out.println(igual); //debe imprimir true
	}
}
