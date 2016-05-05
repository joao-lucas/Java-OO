
public class Jogador {
	public String nome;
	public String time;
	public int vida;
	private Arma equip;

	/*
	 * public int alterarVida(Jogador player) { int novaVida = player.vida -
	 * 100; player.vida = novaVida;
	 * 
	 * if (player.vida < 0) { System.out.println("Morreu"); } else {
	 * System.out.println("Cuidado! Vida: " + player.vida); } return
	 * player.vida; }
	 */
	public void levarDano(int dano) {
		vida = vida - dano;
		System.out.println(">" + nome + " Levou dano de:" + dano);
		if (vida <= 0) {
			System.out.println(">" + nome + " Morreu!");
		} else {
			System.out.println(">" + nome + " vida: " + vida);
		}
	}

	public void curar(int heathPack) {
		vida = vida + heathPack;
		System.out.println(">" + nome + " foi curado!");
		if (vida > 100) {
			vida = 100;
		}
		System.out.println(">" + nome + " vida:" + vida);
	}

	public void alterarArma(Arma novaArma) {
		equip = novaArma;
		System.out.println("Nova Arma: " + equip.modelo);
	}

	public void ataca(Arma minhaArma) {
		minhaArma.atirar();
		System.out.println("O jogador " + nome + " atacou");
	}
}