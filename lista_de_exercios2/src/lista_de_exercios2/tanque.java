package lista_de_exercios2;

import java.util.Scanner;

public class tanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double latas, custo ;
		double area, r, h ;
		
		System.out.println("Qual é o valor do seu R (raio)");
		r = teclado.nextDouble();
		
		System.out.println("Qual é o valor do seu H (Altura)");
		h = teclado.nextDouble();
		
		area = 2 * Math.PI * r * (h+r);
		
		latas =  area/3/5;
		custo = latas * 190;
		
		System.out.println("Você devera comprar:" + latas +" " + "latas");
		System.out.println("Custo Total R$" + custo);
		
		
		
		teclado.close();

	}

} //Pi esta em uma classe Math.
