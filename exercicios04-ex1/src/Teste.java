
public class Teste {
	public static void main(String[] args) {
		Vampiro n = new Vampiro();
		n.nome= "EuSouoVampiroDoidao";
		
		n.numerosdeVitimas = 100;
		n.setNome("Joao");
		n.getNome();
		
		//System.out.println("Nome:" + n.nome);
		
		Bicicleta b =  new Bicicleta();
		b.pedalar(100);
		b.empinarBike(6000);
	}
}
