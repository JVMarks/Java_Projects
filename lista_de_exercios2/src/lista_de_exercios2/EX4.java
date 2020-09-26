package lista_de_exercios2;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int resultado,numero, nu_a, nu_b, nu_c;
		
		System.out.println("Digite no minimo 3 digitos : ");
		numero = teclado.nextInt();
		
		nu_a = numero%10 ;
	    nu_b = numero%100/10 ;
	    nu_c = numero/100 ;
	    
	    resultado = nu_a * 100 + nu_b * 10 + nu_c  ;
	    
	    System.out.println("Seu algarismo alcontrario é -->" + resultado);
		
		
		teclado.close();
	}

}
