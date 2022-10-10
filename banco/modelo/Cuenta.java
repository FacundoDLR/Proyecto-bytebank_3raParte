package banco.modelo;

/**
 * Cuenta va a crear nuevas instancias de CuentaCorriente, CuentaAhorro
 * @version 1.0.1
 * @author facuj
 *
 */

public abstract class Cuenta {
	
	// public      // Accesible desde cualquier parte 
	// --default   // Accesible dentro del paquete
	// --protected // default + clases hijas
	// ---private  // solo desde la clase misma
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente cliente = new Cliente();
	private static int total;
	
	/**
	 * Constructor para inicializar el objeto Cuenta a partir da agencia y numero
	 * @param agencia
	 * @param numero
	 */
	
	public Cuenta(int agencia, int numero) {
		if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Número de cuenta inválido");
        }
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

	/**
	 * Este metodo retira el dinero de la cuenta y si ocurre un error lanza una excepcion.
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void retirar(double valor) throws SaldoInsuficienteException {
		
		if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        };

        this.saldo -= valor;     
	};

	/**
	 * Este metodo sirve para retirar dinero de la cuenta actual para depositarlo en una cuenta destino.
	 * @param valor
	 * @param cuenta
	 * @throws SaldoInsuficienteException
	 */
	public void transferir(double valor, Cuenta cuenta) throws SaldoInsuficienteException {
		
		this.retirar(valor);
		cuenta.depositar(valor);
	}
	
	/**
	 * Este metodo verificará si una cuenta es igual a otra.
	 * @param otra
	 * @return
	 */
	@Override
	public boolean equals(Object ref){

		Cuenta otra = (Cuenta) ref;
		
	    if(this.agencia != otra.agencia){
	        return false;
	    }

	    if(this.numero != otra.numero){
	        return false;
	    }

	    return true;
	}
}
