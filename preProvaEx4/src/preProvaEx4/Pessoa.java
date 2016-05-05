package preProvaEx4;

import java.util.Scanner;

/*
4) Crie uma classe Pessoa que possua os atributos: nome, endereço, telefone, email e idade. 
Crie os métodos para alterar: nome, endereço, telefone, email e idade (o método para alterar 
idade  deve  se  chamar  “fazerAniversario”  que  irá  aumentar  a  idade  em  1  ano  imprimir  uma 
mensagem na tela informando quantos anos a Pessoa está fazendo. Crie uma classe para testar 
o exercício.*/
public class Pessoa {
	String nome;
	String endereco = "Santa Edwiges";
	String telefone = "4391815219";
	String email = "joaolucas@linuxmail.org";
	int idade = 20;
	
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

