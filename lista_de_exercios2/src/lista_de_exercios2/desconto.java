package lista_de_exercios2;

import java.util.Scanner;

public class desconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);
	     double valortotal, valorPagar, desconto;
	      
	     System.out.print("Valor da compra --> ");
	     valortotal = teclado.nextDouble();
	     
	      if(valortotal > 1000 ) {
	    	  valorPagar = valortotal * 0.85 ; //100% - 15% --> 85%
	      } else {
	    	  valorPagar = valortotal * 0.92 ; //100% - 8% --> 92%
	      }
	      desconto = valortotal - valorPagar;   
	      
	      System.out.println("Valor da compra:" + " " + valorPagar);
	      System.out.println("Valor da compra:" + " " + desconto);
	      
	       teclado.close();
	}

}
