import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		//SOMA DE VALORES
		
		int soma = 0;
		int meta = 1;
		int entrada = 0;

		Scanner teclado = new Scanner(System.in);
		while (soma < meta) {
			System.out.println("Entre com o numero:");
			entrada = teclado.nextInt();
			if (entrada < 0) {
				continue;
			}
				soma = soma + entrada;
			System.out.println("a soma:" + soma);
		}
	}

}
