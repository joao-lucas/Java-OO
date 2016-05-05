package preProvaEx10;

import java.util.Scanner;

/*10) Crie uma classe ContaBancaria guarde informação de: nuemero de conta, nome
do dono na conta, saldo, limite. Que tenha as operações para: sacar uma
quantidade x de dinheiro, depositar uma quantidade x de dinheiro, imprimir
o nome do dono da conta, mostrar o saldo atual da conta, transferir uma
quantidade x de dinheiro para outra conta. Faça um programa para testar
o exercicio*/

public class ContaBancaria {
	private int numeroConta;
	private String nome;
	private double saldo;
	private double limite;

	public void sacar(double saldo) {
		Scanner quantidade = new Scanner(System.in);
		System.out.println("Saldo Atual: " + saldo);
		System.out.println("Quantidade a sacar: ");
		double quant = quantidade.nextDouble();

		if (quant > saldo) {
			System.out.println("Saldo Insuficiente!");
		} else {
			saldo = saldo - quant;
			System.out.print("Novo Saldo: " + saldo);
		}
	}

	public void depositar(double saldo) {
		Scanner deposito = new Scanner(System.in);
		System.out.println("Saldo Atual: " + saldo);
		System.out.print("Entre com o valor a ser depositado: ");
		double dep = deposito.nextDouble();
		saldo = saldo + dep;
		System.out.println("Saldo depois do Deposito: " + saldo);
	}

	public void imprimirNomedoDonodaConta() {
		System.out.println("Nome: " + nome);
	}

	public void transfere(ContaBancaria dest) {
		Scanner valor = new Scanner(System.in);
		System.out.println("Entre com o valor a ser transferido: ");
		double transfereValor = valor.nextDouble();
		if (transfereValor > this.saldo) {
			System.out.println("Saldo Insuficiente! ");
		} else {
			dest.saldo = dest.saldo + transfereValor;
			this.saldo = this.saldo - transfereValor;
			// System.out.println("VALORES DENTRO DO METODO TRANSFERIR");
			// System.out.println("Saldo conta destino: " + dest);
			// System.out.println("Saldo conta que fez o deposito: " +
			// this.saldo);
		}
	}
 
	public void mostrarSaldo(ContaBancaria saldo) {
		System.out.println("Saldo: " + saldo);
	}

	public void nome() {
		Scanner n = new Scanner(System.in);
		System.out.println("Digite o Nome: ");
		String novoNome = n.nextLine();
		this.nome = novoNome;
	}

	public void saldo() {
		Scanner s = new Scanner(System.in);
		System.out.println("Saldo: ");
		double saldoConta = s.nextDouble();
	}
	public void limite(){
		Scanner l = new Scanner(System.in);
		System.out.println("Limite: ");
		double lim = l.nextDouble();
		System.out.println("Saldo de " + this.nome + " é de : " + this.saldo);
		System.out.println("Limite: " + lim);
	}
}