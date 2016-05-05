import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		System.out.print("Entre com um numero: ");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		// System.out.println("O numero digitado foi: " + numero);

		while (numero!=0) {
		
		if (numero >= 18) {
			System.out.println("Eh maior");
		} else if (numero < 18) {
			System.out.println("Eh menor");
		} else {
			System.out.println("num sei");
		}
	}
	}
}
