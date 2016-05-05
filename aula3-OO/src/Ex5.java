import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		// MOSTRA O MAIOR VALOR
		
		Scanner teclado = new Scanner(System.in);
		int maior = 0;
		for (int i = 0; i < 4; i++) {
			System.out.println("Entre com um valor: ");
			int numero = teclado.nextInt();

			if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println("Maior Numero:" + maior);
	}

}
