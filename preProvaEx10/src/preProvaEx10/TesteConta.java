package preProvaEx10;

public class TesteConta {
	public static void main(String[] args) {
		ContaBancaria cliente1 =  new ContaBancaria();
		ContaBancaria cliente2 = new ContaBancaria();
		
		//cliente1.limite = 1000.0;
		cliente1.nome();
		cliente1.saldo();
		cliente1.imprimirNomedoDonodaConta();
		cliente1.limite();
		//cliente1.
		//cliente1.numeroConta = 123;
		
		//cliente2.limite = 1000.0;
		
		//cliente2.nome();
		//cliente2.imprimirNomedoDonodaConta();
		//cliente2.saldo = 7000.0;
		//cliente2.numeroConta = 321;
		
		//cliente1.sacar(cliente1.saldo);
		//cliente1.depositar(cliente1.saldo);
		//cliente1.imprimirNomedoDonodaConta();
		
		//System.out.println("Saldo cliente 1: " + cliente1.saldo);
		//System.out.println("Saldo cliente 2: " + cliente2.saldo);
		//cliente1.transfere(cliente2);
		
		//System.out.println("VALORES DENTRO DO MAIN");
		//System.out.println("Saldo cliente 1 " + cliente1.saldo);
		//System.out.println("Saldo cliente 2 " + cliente2.saldo);
	}
}