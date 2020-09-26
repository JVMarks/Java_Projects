package lista_de_exercios2;

import java.util.Scanner;

public class Mevalor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner teclado = new Scanner(System.in);
      double Mont, Cap, i ;
      int  Meses;
      
      System.out.println("Informe o capital:");
      Cap = teclado.nextDouble();
      
      
      System.out.println("Informe a Taxa de juros:");
      i = teclado.nextDouble();
      
      System.out.println("Informe os Meses:");
      Meses = teclado.nextInt();
      
      Mont = Cap *Math.pow(1 + i/100, Meses);
      
      System.out.println("" + Mont);
      
      teclado.close();
	}

}
