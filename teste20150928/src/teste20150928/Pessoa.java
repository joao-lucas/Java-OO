package teste20150928;

import java.util.Scanner;

/*
4) Crie uma classe Pessoa que possua os atributos: nome, endereço, telefone, email e idade. 
Crie os métodos para alterar: nome, endereço, telefone, email e idade (o método para alterar 
idade  deve  se  chamar  “fazerAniversario”  que  irá  aumentar  a  idade  em  1  ano  imprimir  uma 
mensagem na tela informando quantos anos a Pessoa está fazendo. Crie uma classe para testar 
o exercício.*/

public class Pessoa {
	String nome;
	String endereco;
	String email;
	String telefone;
	int idade;
	
	public void alterarNome(String nome){
		Scanner novoNovo = new Scanner(System.in);
		System.out.println("O SEGUINTE NOME SERA ALTERADO: " + nome);
		System.out.println("Novo nome: ");
		nome = novoNovo.nextLine();
	}

}
