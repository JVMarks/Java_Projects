package lista_de_exercios2;

import java.util.Scanner;

public class equacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner teclado = new Scanner(System.in);
    double a,b,c;
    double x1, x2,delta;
    
    System.out.print("DIGITE O VALOR DE A --->");
    a = teclado.nextDouble();
    
    if( a == 0 ) {
    	System.out.println("Não é uma equação de 2º");
    } else {
    	 System.out.print("DIGITE O VALOR DE B --->");
    	    b = teclado.nextDouble();
    	    
    	 System.out.print("DIGITE O VALOR DE C --->");
    	   c = teclado.nextDouble();
    	   
    	   delta = Math.pow(b,2) - 4 * a * c ;
    	   if (delta < 0) {
    		   System.out.println("Não a numero real na equação");
    	   }else {
    		   x1 = (-b - Math.sqrt(delta))/(2 * a);
    		   x2 = (-b + Math.sqrt(delta))/(2 * a);
    		   
    		   System.out.println("x1 é = "+ x1);
    		   System.out.println("x2 é ="+ x2);
    	   }
    	   
    }
    
    
  
    
    
    
    teclado.close();
	}

}
