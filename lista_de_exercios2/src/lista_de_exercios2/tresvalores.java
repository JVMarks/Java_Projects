package lista_de_exercios2;

import java.util.Scanner;

public class tresvalores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner teclado = new Scanner(System.in);
    int vl1,vl2,vl3;
    
    System.out.print("Digite o valor1 -->");
    vl1 = teclado.nextInt();
       
    System.out.print("Digite o valor2 -->");
    vl2 = teclado.nextInt();
    
    if(vl1 == vl2){
    	System.out.println("Não Pode continuar");
    } else {
    	  System.out.print("Digite o valor3 -->");
    	   vl3 = teclado.nextInt();
    	   
    	   if(vl3 == vl2 || vl3 == vl1){
    		   System.out.println("Não Pode continuar");
    	   }    else if(vl1 < vl2 && vl1 < vl3) {
    		   System.out.println("menor =" + vl1);
    	   } else if(vl2 < vl3) {
    		   System.out.println("meno =" + vl2 );
    	   } else {
    		   System.out.println("meno =" + vl3 );
    	   }
    }
    
  
    
    teclado.close();
	}

}
