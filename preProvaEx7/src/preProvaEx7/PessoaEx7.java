package preProvaEx7;

import java.util.Scanner;

/*7) Faça novamente o exercício 4 porém agora utilizando modificadores de acesso privado para 
os atributos e modificadores de acesso padrão para os métodos. 
*/

public class PessoaEx7 {
	private String nome;
	private String endereco = "Santa Edwiges";
	private String telefone = "4391815219";
	private String email = "joaolucas@linuxmail.org";
	private int idade = 20;
	
	public  String alterarNome(){
		System.out.println("Nome Atual: " + nome);
		System.out.print("> Novo Nome: ");
		Scanner nomeNovo = new Scanner(System.in);
		nome = nomeNovo.nextLine();
		return nome;
	}
	public String alterarEndereco(){
		System.out.println("Endereco Atual: " + endereco);
		System.out.print("> Novo endereco: ");
		Scanner novoEndereco = new Scanner(System.in);
		endereco = novoEndereco.nextLine();
		
		System.out.println(" > " + endereco);
		return endereco;
	}
	public String alterarTelefone(){
		System.out.println("Telefone Atual: " + telefone);
		System.out.print("> Novo Telefone: ");
		Scanner novoTelefone = new Scanner(System.in);
		telefone =  novoTelefone.nextLine();
		return telefone;
	}
	public String alterarEmail(){
		System.out.println("Email Atual: " + email);
		System.out.print("> Novo Telefone: ");
		Scanner novoEmail = new Scanner(System.in);
		email = novoEmail.nextLine();
		
		return email; 
	}
	public int alterarIdade(){
		System.out.println("Idade Atual: " + idade);
		System.out.print("> Nova Idade: ");
		Scanner novaIdade = new Scanner(System.in);
		idade = novaIdade.nextInt();
		
		return idade;
	}
	public void fazerAniversario(){
		System.out.println("FELIZ ANIVERSARIO!");
		int novaIdade = idade + 1;
		idade = novaIdade;
		
		System.out.println("Sua idade agora é: " + idade);
		
	}


}
