
public abstract class Conta {
	
	private String cliente;
	protected double saldo;
	private int agencia;
	private int numero;
	
	
	double sacar;

	public abstract boolean sacar(double valor);
	
	public void deposita(double valor) {
		this.saldo =+ valor;
		
	}
	
	public abstract boolean transfere( double saldo,Conta destino);
	
	public Conta(String cliente, double saldo, int agencia, int numero) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}
	
	
	

}
