import java.util.Scanner;

public class Main {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Entre com primeiro valor: ");
		float n1 = scanner.nextFloat();

		System.out.println("Entre com segundo valor: ");
		float n2 = scanner.nextFloat();

		double soma = n1 + n2;
		double subt = n1 - n2;
		double mult = n1 * n2;
		double div = n1 / n2;

		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + subt);
		System.out.println("Multiplicacao: " + mult);
		System.out.println("Divisao:" + div);
	}
}
