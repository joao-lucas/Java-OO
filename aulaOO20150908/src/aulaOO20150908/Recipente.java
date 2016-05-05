package aulaOO20150908;

public class Recipente {
	private int capacidade = 1000;
	int quantidade = 0;

	public void armazenar(int quant) {
		if ((quant + quantidade) <= capacidade) {
			quantidade = quantidade + quant;
			System.out.println("liquido armazenado: " + quantidade);
		} else {
			System.out.println("o liquido excedeu o recipiente: " + quantidade);
		}
	}

	public int ObterQuantida() {
		return quantidade;
	}

}