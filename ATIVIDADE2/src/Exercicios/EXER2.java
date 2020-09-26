package Exercicios;

import java.util.Scanner;


public class EXER2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner keyboard = new Scanner(System.in);
	      String nome;
	      int kilowatt;
	      int contador, usuario;
	      double resultado, reais;
	            		 
			 do {
		  	    contador = 1;
		  	    reais=0;	    	 	    		 
		    		while(contador == 1) {
		    			 System.out.println("Informe seu nome --->");
			    		 nome = keyboard.nextLine(); 
			    		 
			    		 System.out.println("Informe a Quantidade em kilowatt do Mês --->");
			    		 kilowatt = keyboard.nextInt();
			    		 
			    		 if (kilowatt <= 199) {
			    			 reais = 1.20;		    			 
			    		 }else if (kilowatt <= 399 ) {
			    			 reais = 1.50;		 
			    		 }else if(kilowatt <= 599 ) {
			    			 reais = 1.80; 
			    		 }else {
			    			 reais = 2.00;
			    		 }
			    		 
			    		 resultado= kilowatt * reais;
			    		 
			    		 System.out.println("NOME DO USUARIO:" + nome);
			             System.out.println("NESSE MÊS VOCÊ DEVERA PAGAR R$" + resultado); 
			             
	        	    	 contador = contador + 1;
		    		}
		    		 
					System.out.print("Para realisar outra consulta digite 1 para encerrar Digite 0 --->");
					usuario = keyboard.nextInt();
					
					 if(usuario == 0){
			     		 System.out.println("Encerramos o codigo!!");
			     	     }
					 
				}while(usuario == 1);
					
				  
	      keyboard.close();		
	}

}//fim

//Quantidade (em kilowatt) Valor em reais (R$) por kilowatt
//Até 199 1,20 
//De 200 até 399 1,50 
//De 400 até 600 1,80 
//Acima de 600 2,00 
