package teste20150928;

public class TesteAlterar {
	public static void main(String[] args) {
	
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Joao";
		
		System.out.println("Nome: " + pessoa1.nome);
		
		pessoa1.alterarNome(pessoa1.nome);
		
	}
	
}
