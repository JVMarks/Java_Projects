package lista_de_exercios2;

import java.util.Scanner;

public class parouimpar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner teclado = new Scanner(System.in);
       double valor;
       
       System.out.print("Valor --->");
       valor = teclado.nextDouble();
       
   
       
       System.out.println("Seu valor é:" + " " + valor );
       
       if( valor % 2 != 0){
    	   System.out.println("Impar");
       } else {
    	   System.out.println("Par");
       }
    	  
       teclado.close();
	}
}
