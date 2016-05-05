class TesteJogador {
	public static void main(String[] args) {

		 Jogador joao = new Jogador();
		 Jogador lucas = new Jogador();

		 joao.vida = 100;
		 lucas.vida = 90;

		lucas.equipamento = "facao";
		joao.equipamento = "faca";

		joao.verEquipamento();
		lucas.verEquipamento();

		joao.verVida();
		lucas.verVida();

		System.out.println();
		
	}

}
