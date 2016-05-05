package preProvaEx8;

import java.util.Scanner;

import javax.print.attribute.standard.NumberUp;

/*8) Faça um programa que calcule o fatorial de um numero inserido aleatoriamente
pelo usuario que seja menor que 20*/

public class fatorial {
	public static void main(String[] args) {
       
		Scanner entrada = new Scanner(System.in);
        int numero, fatorial = 1;
        int contador = 1;

        do{
            System.out.print("Digite um Valor: ");
            numero = entrada.nextInt();
            
            for(int i = 1;i <= numero; i++){
                fatorial = fatorial * i;
            }
            
            System.out.println("!" + numero + " = " + fatorial);
            contador++;
            
       }while(contador < 20);
    }
}
