
public class Arma {
	String modelo;
	private int municao = 500;
	
	public void atirar() {
		int municaoAtual = municao - 1;
		System.out.println("Arma " + modelo + " foi usada");
		System.out.println("Municao: " + municaoAtual);
		//return municaoAtual;
		
	}

}
