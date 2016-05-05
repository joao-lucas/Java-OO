package ex;

public class Recipiente {
	int capacidade = 10;
	int quantidade = 0;

	public void add(int q) {
		quantidade = quantidade + q;
		// System.out.println("Quantidade: " + quantidade);
		q = q + 100;
		System.out.println("quant recipiente: " + q);
	}
	
	public void adicionarProduto(Produto p){
		p.nome = "Amarelo";
		
		
	}

}
