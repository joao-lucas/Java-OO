package ex;

public class ex01 {
	public static void main(String[] args) {
		Recipiente vasilha = new Recipiente();
		int q = 10;

		//System.out.println("Quant teste antes: " + q);
		//vasilha.add(q);
		//System.out.println("quant teste depois: " + q);
		//System.out.println("Vasilha: " + vasilha);
	
		Produto prod = new Produto();
		System.out.println("Produto adicionado antes: " + prod.nome);
		//prod.nome = "amarelo";
		vasilha.adicionarProduto(prod);
		System.out.println("Produto adicionando depois: " + prod.nome);
		
		
	}
	
}