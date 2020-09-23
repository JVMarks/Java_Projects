package lista_de_exercicios3;

import java.util.Scanner;

public class XYZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner teclado = new Scanner(System.in);
       int x,y,z, aux;
       
       System.out.print("INFORME O 1º VALOR ---->");
       x = teclado.nextInt();
       
       System.out.print("INFORME O 2º VALOR ---->");
       y = teclado.nextInt();
       
       System.out.print("INFORME O 3º VALOR ---->");
       z = teclado.nextInt();
       
       if(x>y){
    	   aux = x; //variavel auxiliar 
    	   x = y;
    	   y = aux;
    	   
       }
       
       if(x > z){
    	   aux = x;
    	   x = z;
    	   z = aux;	   
       }
       
       if(y > z){
    	   aux = y;
    	   y = z;
    	   z = aux;	   
       }
       
       System.out.println("VALOR 1°" + x);
       System.out.println("VALOR 2°" + y);
       System.out.println("VALOR 3°" + z);
       
       teclado.close();
	}

}
