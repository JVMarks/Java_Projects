package lista_de_exercios2;

import java.util.Scanner;

public class ValorY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);
	     int X ;
		 double Y;
	       
	       System.out.print("Valor  de X--->");
	        X = teclado.nextInt();
	        
	        if( X>5 || X<-5 ) {
	        	 Y = 8/Math.sqrt(Math.pow(X,2) - 25);
	        	 
	        	 System.out.println("y =" + Y );
	        } else {
	        	 System.out.println("não pode ser feita a conta");	 
	        }
	       
	       teclado.close();
	}

}
