package lista_de_exercicios3;

import java.util.Scanner;

public class EmpresaXPTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);
		   String  cargo ;
		   double salario, anosdeempresa ;
	       double salarionovo, diferenca, taxa ;
	       
	       System.out.print("Informe seu Cargo --->");
	       cargo = teclado.nextLine();

	       System.out.print("Informe tempo de servi�o em anos --->");
	       anosdeempresa = teclado.nextDouble();
	       
	       System.out.print("Informe seu Salario atual --->R$");
	       salario = teclado.nextDouble();
	       
	       if (cargo.equalsIgnoreCase("gerente")) {
	    	  
	    	  if(anosdeempresa>=5){
	    		  taxa = 10;
	    	  }else if(anosdeempresa>=3){
	    		 taxa = 9; 
	    	  }else {
	    		 taxa = 8;
	    	  }
	    	   
	       } else if (cargo.equalsIgnoreCase("engenheiro")){
	    	   
	    	   if(anosdeempresa>=5){
		    		  taxa = 11;
		    	  }else if(anosdeempresa>=3){
		    		 taxa = 9; 
		    	  }else {
		    		 taxa = 8;
		    	  }
	    	   
	       } else if (cargo.equalsIgnoreCase("t�cnico")) {
	    	  
	    	   if(anosdeempresa>=5){
		    		  taxa = 12;
		    	  }else if(anosdeempresa>=3){
		    		 taxa = 11; 
		    	  }else {
		    		 taxa = 10;
		    	  }
	    	   
	       } else {
	    	   
	    	   taxa = 5;
	    	   
	       }
	       
	       
	      salarionovo = salario + salario*taxa/100;
	      diferenca = salarionovo - salario;
	      
	      System.out.println("Salario atual � --->R$" + salario); 
	      System.out.println("Parabens seu Salario Novo � --->R$" + salarionovo); 
	      System.out.println("Sua diferen�a � --->R$" + diferenca); 
	      
	      teclado.close();
	}
}