package banco.tests;
import banco.modelo.Cuenta;
import banco.modelo.CuentaCorriente;
import banco.modelo.SaldoInsuficienteException;

public class TestSacar {

	 public static void main(String[] args) {
         Cuenta cuenta = new CuentaCorriente(123, 321);

         cuenta.depositar(200.0);

         try {
             cuenta.retirar(200.0);
         } catch(SaldoInsuficienteException ex) {
             System.out.println("Exception: " + ex.getMessage());
             ex.printStackTrace();
         }

         System.out.println("El saldo de la cuents es de " + "$" +cuenta.getSaldo());
     }
}
