
public abstract class Conta {
	    Cliente cliente;
	    double saldo;
	    int agencia;
	    int numero;


	    double sacar;  
	  
	    public abstract  boolean sacar( double valor );
	    
	    public void depositar(double valor ){
	        this.saldo += valor; 
	        
	        
	    }
	    public abstract boolean transfere( double valor, Conta D);
	      

	    public Conta(int numero, int agencia, Cliente cliente) {
	    	this.saldo = 0;
	        this.numero=numero;
	        this.agencia=agencia;
	        this.cliente=cliente;
	    }

	    public Cliente getCliente() {
	        return cliente;
	    }

	    public void setCliente(Cliente Cliente) {
	        this.cliente = Cliente;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	 

	    public int getAgencia() {
	        return agencia;
	    }
	   
}


