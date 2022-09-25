
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //NO BORRAR esta notacion, ya que no sobreescribiria el metodo padre.
	public boolean retirar(double valor) {
		// TODO Auto-generated method stub
		double comision = 0.2;
		return super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;
	}
	
}
