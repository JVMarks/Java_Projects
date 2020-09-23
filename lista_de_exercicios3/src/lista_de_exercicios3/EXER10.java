package lista_de_exercicios3;

import java.util.Scanner;

public class EXER10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner keyboard = new Scanner(System.in);
     int quantidade, valor1=1, valor2=1,resultado;
     
     System.out.println("Quantos termos você quer ter?");
     quantidade = keyboard.nextInt();
      
     if(quantidade == 1){
		 System.out.print("1");
	 }else if(quantidade == 2){
		 System.out.print("2");
	 } else {
		 System.out.print(valor1 + " " + valor2 + " ");
		 for(int contador=3;contador<=quantidade;contador++){
   		 resultado = valor1 + valor2 ;
   		 System.out.print(resultado + " ");
   		 valor1= valor2;
   		 valor2 = resultado;
   		 }
     }
     
     keyboard.close();
	}

}//fim