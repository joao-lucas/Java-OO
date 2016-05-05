
public class Bicicleta extends Veiculo {
	public void pedalar(int velocidade) {
		velocidade = velocidade + 2;
		System.out.println("Padalando... Velocidade: " + velocidade + "km/h");
	}
	public void empinarBike(double forca){
		if(forca<5000.0){
			System.out.println("Não foi possivel empinar a bike. Falta Força");
		} else {
			System.out.println("You are the Champion");
		}
	}
}
