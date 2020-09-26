package lista_de_exercios2;

import java.util.Scanner;

public class binario {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int bin, bit1, bit2, bit3, bit4, resultado;
		
		System.out.println("Digite apenas 0 e 1 -->");
		bin = teclado.nextInt();
		
		//processamento de dados
		bit1 = bin/1000;
		bit2 = bin%1000/100 ;
		bit3 = bin%100/10;
		bit4 = bin%10;
		
		resultado = bit4 + bit3 *2 + bit2 *4 + bit1*8; 
		
		//saida
		System.out.println( bin + " Seu resultado é: " + resultado);
		
	    teclado.close();
	}

}//fim
