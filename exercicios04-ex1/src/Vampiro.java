
public class Vampiro extends Pessoa {
	String anodeTransformacao;
	int numerosdeVitimas;
	String tipoSanguineoPredileto;

	public void morder() {
		System.out.println("Voce Mordeu!");
	}

	public void transformar() {
		System.out.println("Voce Transformou!");
	}

	public String getAnodeTransformacao() {
		return anodeTransformacao;
	}

	public void setAnodeTransformacao(String anodeTransformacao) {
		this.anodeTransformacao = anodeTransformacao;
	}

	public int getNumerosdeVitimas() {
		return numerosdeVitimas;
	}

	public void setNumerosdeVitimas(int numerosdeVitimas) {
		this.numerosdeVitimas = numerosdeVitimas;
	}

	public String getTipoSanguineoPredileto() {
		return tipoSanguineoPredileto;
	}

	public void setTipoSanguineoPredileto(String tipoSanguineoPredileto) {
		this.tipoSanguineoPredileto = tipoSanguineoPredileto;
	}

}
