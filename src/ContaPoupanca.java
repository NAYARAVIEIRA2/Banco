
public class ContaPoupanca extends Conta {



	public ContaPoupanca(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
		
	}

	public boolean sacar(double valor) {
		saldo = saldo - valor;

		double saldo = super.saldo;
		if (saldo > valor) {
			System.out.println("Saque Realizado com sucesso!");
			return true;
		}

		return false;
	}

	public boolean transfere(double valor, Conta D) {
		return false;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao e possivel valores negativos");
			return;
		}

		this.numero = numero;

	}

	}


