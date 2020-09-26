package lista_de_exercios2;

import java.util.Scanner;

public class TomadaDeDecisao1SIS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner teclado = new Scanner(System.in);
       double nota1, nota2, media;
       
       System.out.print("Nota 1");
       nota1 = teclado.nextDouble();
       System.out.print("Nota 2");
       nota2 = teclado.nextDouble();
       
       media = (nota1 + nota2 )/2;
       
       System.out.println("Sua media é" + media);
       
       if(media >=6){
    	   System.out.println("APROVADO");
       }
       else {
    	   System.out.println("REPROVADO");
       }
       
    	  
       teclado.close();
	}
	
	

}
