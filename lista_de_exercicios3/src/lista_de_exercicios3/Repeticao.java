package lista_de_exercicios3;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner teclado = new Scanner(System.in);
     String usuario;
     int contador;
     	
     do {
  	     contador = 2;
    	 while(contador <= 130 ){
    	       System.out.println(contador);	
    	          contador = contador + 2;
    			}    	 
    	 System.out.println("escreva sim ou nao para continuar -->");
     	 usuario = teclado.nextLine();
     	 
     	 if(usuario.equalsIgnoreCase("nao")){
     		 System.out.println("encerramos o codigo!!");
     	 }
     	 
     }while(usuario.equalsIgnoreCase("sim"));
		
		
     teclado.close();
	}

}