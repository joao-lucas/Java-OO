
public class Mesa {
	String mesa;
	int qtdRefeicao, qtdSobremesa, qtdBebida;
	boolean estado;
	
	public void mudaEstado(boolean novoEstado){
		this.estado = novoEstado;
}
	void realizaPedido(int refeicao, int sobremesa, int bebida){
		this.qtdRefeicao = qtdRefeicao +  refeicao;
		this.qtdSobremesa = qtdSobremesa + sobremesa;
		this.qtdBebida =  qtdBebida +  bebida;
	}
	public int verificaRefeicao(){
		return qtdRefeicao;
	}
	public int verificaSobremesa(){
		return qtdSobremesa;
	}
	public int verificaBebida(){
		return qtdBebida;
	}
	
	

}
