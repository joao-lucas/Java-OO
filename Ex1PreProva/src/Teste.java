
public class Teste {

	public static void main(String[] args) {
		Recipiente r = new Recipiente();
		Substancia s = new Substancia();
		s.inflavel = true;
		//s.nome = "Fumaça";
		
		r.adicionar(1000);
		r.setSubstancia(s);
		//r.getQuantidade();
		
		
		r.getSubstancia();
		
	}

}
