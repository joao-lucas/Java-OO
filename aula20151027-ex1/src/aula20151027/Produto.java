package aula20151027;

public class Produto {
	private String nome;
	private String fornecedor;
	private final Double PRECO = 9.99;
	private static Double precoDeCompra;
	private static double peso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Double getPreco() {
		return precoDeCompra;
	}
	public void setValor(Double preco) {
		this.precoDeCompra = preco;
	}
	
	
	public Produto(String nome){
		this.nome =  nome;
	}
	public Produto(String nome, String fornecedor, Double preco){
		this.nome = nome;
		this.fornecedor = fornecedor;
		this.precoDeCompra = preco;
		
	}
	static void alteraPeso(double novoPeso){
		peso = novoPeso;
	}
	
}
