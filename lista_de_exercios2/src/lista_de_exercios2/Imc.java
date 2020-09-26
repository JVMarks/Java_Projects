package lista_de_exercios2;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner teclado = new Scanner(System.in);
      double IMC, peso, altura;
      
      System.out.println("Indique seu Peso(Kg) -->");
      peso = teclado.nextDouble();
      
      System.out.println("Indique sua Altura(m)^2 -->");
      altura = teclado.nextDouble();
      
      IMC = peso/Math.pow(altura, 2) ;
      
      System.out.println("Seu Índice de Massa Corporal é -->" + IMC );
      
      teclado.close();
	}

}
