package banco.modelo;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //NO BORRAR esta notacion, ya que no sobreescribiria el metodo padre.
	public void retirar(double valor) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		double comision =  valor + 0.2;
		super.retirar(comision);;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;
	}
	
}
