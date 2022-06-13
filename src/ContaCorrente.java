
	public class ContaCorrente extends Conta {



	public ContaCorrente(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}

	@Override
	public boolean sacar(double valor) {
		saldo = saldo - valor - 0.1;
		double saldo = super.saldo;
		if (saldo > valor) {
			System.out.println("Saque Realizado com sucesso!");
			return true;

		}
		System.out.println("Saldo insuficiente");
		return false;
	}

	@Override
	public boolean transfere(double valor, Conta D) {
		return true;

	}

	public String getNumero() {
		// TODO Auto-generated method stub
		return null;
	}


			
		}


		


