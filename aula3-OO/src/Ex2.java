import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// LE SE O NUMEOR É UM OU DOIS
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com valor: ");
		int entrada = teclado.nextInt();
		
		switch(entrada){
		case 1:
			System.out.println("UM");
			break;
		case 2:
			System.out.println("DOIS");
			break;
		default:
				System.out.println("numero invalido");
		}

	}

}
