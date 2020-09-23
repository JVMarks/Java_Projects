package lista_de_exercicios3;

import java.util.Scanner;

public class EXERCICO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner teclado = new Scanner(System.in);
      int valor,contador= 1;
      int maior = Integer.MIN_VALUE;
         
      while(contador <= 5) {
    	 System.out.print("Informe seu valor -->");
    	 valor = teclado.nextInt();
    	 if(valor > maior) {
    		 maior = valor;
    	 }
    	 contador = contador + 1;
      }
      
      System.out.println("Maior valor" + maior );
      
      
      teclado.close();
	}

}
