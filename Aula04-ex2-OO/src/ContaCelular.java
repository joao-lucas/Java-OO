public class ContaCelular {
	public double credito;
	public String nome;
	public String operadora;

	public ContaCelular(String o, String n, double c) {
		operadora = o;
	
		 nome = n;
		credito = c;

	}

	public void inserirCredito(double valor) {
		credito = credito + valor;
		System.out.println(" Saldo atual: " + nome + "oi " + credito);
	}
	public void ligar(long numero){
		if(credito >= 0.75){
			credito = credito - 75;
			System.out.println("A ligação foi efetuada para o numero: " + numero);
			System.out.println("O saldo atual de : " + nome + "credito: " + credito);
		
		} else {
			System.out.println("Você não possui saldo suficiente! ");
			System.out.println("Saldo atual: " + credito);
		}
		
	}

}
