import java.util.Scanner;

public class Recipiente {
	double capacidade;
	double quantidade;

	public boolean adicionar(double qtd) {

		this.quantidade = quantidade + qtd;
		System.out.println("Quantidade: " + this.quantidade);
		return true;
	}

	public boolean remover(double qtd) {
		this.quantidade = quantidade - qtd;
		System.out.println("Quantidade: " + this.quantidade);
		return true;
	}

	public void esvaziar() {
		this.quantidade = 0;
		System.out.println("Esvaziado! Qtd: " + this.quantidade);
	}

	public double getCapacidade() {
		return capacidade;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setSubstancia(Substancia sub) {
		Scanner n = new Scanner(System.in);
		System.out.println("Nome Substacia: ");
		sub.nome = n.nextLine();

		if (sub.inflavel == false) {
			System.out.println("Não Inflavel!");
		} else {
			System.out.println("Substancia Inflavel!");
		}

		// System.out.println("Inflavel true ou false?");
		// sub.inflavel = n.nextBoolean();
		// return null;
	}

	public Class<Substancia> getSubstancia() {
		return Substancia.class;
	}

}
