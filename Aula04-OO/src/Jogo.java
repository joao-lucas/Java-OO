public class Jogo {

	public static void main(String[] args) {

		Jogador player1 = new Jogador();
		player1.nome = "JoaoLucas";
		player1.time = "ContraTerrorista";
		player1.vida = 100;

		Jogador player2 = new Jogador();
		player2.nome = "MarioDoido";
		player2.time = "Terrorista";
		player2.vida = 100;
		/*
		 * System.out.println("---------------------------------");
		 * System.out.println("Nome Player1: " + player1.nome + " -" + " Time: "
		 * + player1.time); System.out.println("Nome Player2: " + player2.nome +
		 * " -" + " Time: " + player2.time);
		 * System.out.println("---------------------------------");
		 * 
		 * // player1.alterarVida(player1);
		 * 
		 * player1.levarDano(100); player2.levarDano(20); player1.curar(5);
		 * System.out.println();
		 */

		Arma ak = new Arma();
		Arma vaquinha = new Arma();
		
		vaquinha.modelo = "Faca";
		ak.modelo = "Metralhadora";
		
		player1.alterarArma(ak);
		
		player1.ataca(ak);
		player2.ataca(vaquinha);
		

	}
}
