import java.util.Scanner;

public class NumeroComplexo {
	double imaginario, real;

	public void inicializaNumero(double r, double i) {
		this.real = r;
		this.imaginario = i;
	}

	public void imprimeNumero() {
		System.out.println(this.real + " + " + this.imaginario + "i");
	}
	public boolean eIgual(double i, double r){
		this.imaginario = i;
		this.real = r;
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Entre com o Real: ");
		double re = n.nextDouble();
		
		System.out.println("Entre com o Imaginario: ");
		double im = n.nextDouble();
		
		if(re == this.real && im == this.imaginario){
			System.out.println("São Iguais!");
			return true;
		} else {
			System.out.println("São Diferentes!");
			return false;
		}
		
		//return true;
	} 
}