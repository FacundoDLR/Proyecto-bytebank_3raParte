package banco.tests;

public class TestArrayDePrimitivos {

	public static void main(String[] args) {
		int[] edades = new int[5];
		
		for (int i=0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}	System.out.println("Fin bucle");
		
		edades[0] = 29;
        edades[1] = 39;
        edades[2] = 49;
        edades[3] = 59;
        edades[4] = 69;
        
        int edad4 = edades[3];

        System.out.println(edad4);
        System.out.println(edades.length);
        System.out.println("Imprimiendo bucle ⬇️");
        for (int i=0; i < edades.length; i++) {
        	
			System.out.println(edades[i]);
		}
	}
}
