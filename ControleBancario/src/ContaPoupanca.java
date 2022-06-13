
public abstract class ContaPoupanca extends Conta {

	
	
	public ContaPoupanca(String cliente, double saldo, int agencia, int numero) {
		super(cliente, saldo, agencia, numero);

	}
	
    public boolean sacar(double valor ) {
	     saldo = saldo-valor;
	     double saldo = super.getSaldo();
	     if ( saldo > valor) {
	    	 System.out.println("Saque Realizado com Sucesso!");
	    	 return true;
	     }
	     
		return false;
		
}
}
