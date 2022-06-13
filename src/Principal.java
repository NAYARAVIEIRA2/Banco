public class Principal {
	public static void main(String[] args) {

		Cliente mariaJose = new Cliente("Maria José", "000.000.000-01");
		ContaCorrente cc = new ContaCorrente(25987, 1973, mariaJose);

		cc.depositar(100.00);
		cc.sacar(50.00);
		cc.depositar(150.00);

		
		Cliente carlosHenrrique = new Cliente("Carlos Henrique", "000.000.000-02");
		ContaPoupanca cp = new ContaPoupanca(26997, 1973, carlosHenrrique);

		cp.depositar(200.00);
		cp.sacar(30);
		cp.depositar(50);
		cp.sacar(25);

		System.out.println("***Dados Bancario Conta Corrente **");
		System.out.println(" Nome do Cliente : " + cc.getCliente().getNome());
		System.out.println(" Agencia : " + cc.getAgencia());
		System.out.println(" Numero da conta : " + cc.getNumero());
		System.out.println("  Saldo:" + cc.getSaldo());
		System.out.println("============================================");

		System.out.println("***Dados Bancario Conta Poupanca**");
		System.out.println("Nome do Cliente: " + cp.getCliente().getNome());
		System.out.println("Agencia : " + cp.getAgencia());
		System.out.println("Numero da conta : " + cp.getNumero());
		System.out.println("Saldo:" + cp.getSaldo());

	}
}