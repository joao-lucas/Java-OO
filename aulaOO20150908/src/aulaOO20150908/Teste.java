package aulaOO20150908;

public class Teste {

	public static void main(String[] args) {

		Recipente r = new Recipente();

		r.quantidade = 120;
		r.armazenar(100);

		System.out.println(r.quantidade);

		System.out.println("Quantidade: " + r.ObterQuantida());
	}

}
