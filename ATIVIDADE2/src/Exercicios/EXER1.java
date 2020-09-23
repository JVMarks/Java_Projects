package Exercicios;

import java.util.Scanner;

//Joao Victor Marks F. Delgado RM: 84596
//Willian Augusto Rocha dos Santos RM: 85023
//Bruno Fogaça RM: 84743
public class EXER1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner keyboard = new Scanner(System.in);
      String conceito, usuario;
      int contador;
      		 
		 do {
	  	     contador = 1;
	    	 while(contador == 1 ){
	    		 
	    		 System.out.print("Informe o Conceito -->");
	    	     conceito = keyboard.nextLine();
	    		 
	    		 if (conceito.equalsIgnoreCase("E")) {    	    	  
	   			  System.out.println("<--- Excelente ---> ");
	   		  }else if (conceito.equalsIgnoreCase("B")) {   	    	  
	   	    	  System.out.println("<--- Bom ---> ");
	      	      }else if (conceito.equalsIgnoreCase("M")) {    	    	  
	   	    	  System.out.println("<--- Médio ---> ");    	    	  
	   	      }else if (conceito.equalsIgnoreCase("R")) {
	   	    	  System.out.println("<--- Reprovado ---> ");    	    	  
	   	      }else if (conceito.equalsIgnoreCase("D")) {    	    	  
	   	    	  System.out.println("<--- Desistente ---> ");    	    	  
	   	      }else if (conceito.equalsIgnoreCase("T")) {    	    	  
	   	    	  System.out.println("<--- Trancado ---> ");    	    	  
	   	      } else {
	   	    	  System.out.println("Este conceito não existe ou não é cadastrado :c");
	   	      }
	    		    contador = contador + 1;  
	    			}    	 
	    	 System.out.println("Escreva sim ou nao para fazer uma nova consulta -->");
	     	 usuario = keyboard.nextLine();
	     	 
	     	 if(usuario.equalsIgnoreCase("nao")){
	     		 System.out.println("Encerramos o codigo!!");
	     	 }
	     	 
	     }while(usuario.equalsIgnoreCase("sim"));
			  
      keyboard.close();
	}

}//fim

//conceito Descrição 
//E Excelente 
//B Bom 
//M Médio 
//R Reprovado 
//D Desistente 
//T Trancado 