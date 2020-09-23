package lista_de_exercicios3;

import java.util.Random;
import java.util.Scanner;

public class palpite {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
	    Scanner keyboard = new Scanner(System.in)) {
		Random gerador = new Random();
		
		 int valor = gerador.nextInt(100)+1;//()%100 é diferente de (100) 
		 int palpite;
		 int total = 1;
		 
		 boolean repetir = true;
		 
		 while(repetir) {
			 System.out.println("Palpite --->");
			 palpite = keyboard.nextInt();
			  if(valor == palpite) {
				  System.out.println("PARABÉNS MEU CONSAGRADO voce acertou " + total +" palpites");
			      repetir = false;
			  } else if(valor > palpite) {
				  System.out.println("Valor secreto é maior que o palpite");   		  
			  } else {
				  System.out.println("Valor secreto é menor que o palpite");
			  }
			 total++;
		 }
		 
	}
     //double media = gerador.nextDouble();
     //System.out.println(valor);
     //System.out.println(media);
	
	}

}