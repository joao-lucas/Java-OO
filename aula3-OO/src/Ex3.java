import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		// CONTA ATÉ DETERMINADO NUMERO INFORMADO PELO USUARIO
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Até qual numero vai ser a contagem: ");
		int numero = teclado.nextInt();

		for (int i = 1; i < numero; i++) {
			System.out.println("" + i);
		}
	}

}
