package lista_de_exercicios3;

import java.util.Scanner;

public class EXER4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner teclado = new Scanner(System.in);
     int valor,contador, resultado;
     int resp;
     
     do { 	 
         System.out.print("Digite seu valor -->");
         valor = teclado.nextInt(); 
         contador = 0;
         while(contador <= 10) {   	    	 
    	      resultado = valor * contador;
    	      System.out.println(valor + " * " + contador + " = " + resultado);
    	      contador = contador + 1;//contador++ 
         }
          System.out.print("Digite 1 para nova tabuada ou 0 para finalizar -->");
          resp = teclado.nextInt();
       }while(resp == 1); //repete enquanto a condição for verdadeira(true)
     
     teclado.close();
	}
// possuimos tres tipos de estruturas de reptição while, do-while, 
}
