package lista_de_exercicios3;

import java.util.Scanner;

public class EXER5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner teclado = new Scanner(System.in);
      int valor,contador, fatorial;
      
      //entrada de dado
      do { 	 
          System.out.print("Digite seu valor Positivo -->");
          valor = teclado.nextInt(); 
          if( valor < 0){
        	  System.out.println("O valor de ser inteiro e positivo");
          }           
        }while(valor < 0); //repete enquanto o valor for positivo
    
      //calcular o fatorial do numero informado
      fatorial = contador = 1 ;
      while(contador <= valor) {
    	  fatorial = fatorial * contador;
    	  contador++; //contador + 1;
      }
      
      System.out.println("Seu resoltado é --->" + fatorial);
      
      teclado.close();
	}

}
