
public class Pessoa {
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	} 

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	String nome;
	int idade;
	String email;
	/*
	 * public Pessoa() { System.out.println("construtor"); }
	 * 
	 * public Pessoa(String nome) { this.nome = nome; }
	 * 
	 * public Pessoa(String nome, int idade) { this.nome = nome; this.idade =
	 * idade; }
	 * 
	 * public Pessoa(int idade, String nome) { this.nome = nome; this.idade =
	 * idade; }
	 * 
	 * public Pessoa(String nome, int idade, String email) { this.nome = nome;
	 * this.idade = idade; this.email = email; }
	 * 
	 * public Pessoa(int idade, String email, String nome) { this.nome = nome;
	 * this.idade = idade; this.email = email; }
	 */
}
