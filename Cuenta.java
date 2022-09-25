
public abstract class Cuenta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente cliente = new Cliente();
	private static int total;
	
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100; // esto significa que cada nueva cuenta incia con este saldo declarado.
		total++;
		System.out.println("Creando una nueva cuenta con un saldo de " + this.saldo);
		System.out.println("El total de ceuntas hasta ahora es de = " + total);
	}

	public static int getTotal() {
		return Cuenta.total;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("El valor numero NO puede ser menor o igual a cero");
			return;
		}
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("El valor agencia NO puede ser menor o igual a cero");
			return;
		}
		this.agencia = agencia;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public abstract void depositar(double valor);

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (retirar(valor)) {
			cuenta.depositar(valor);
			return true;
		}
		return false;

	}
}
