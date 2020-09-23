package lista_de_exercicios3;

import java.util.Scanner;

public class Repetidor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner teclado = new Scanner(System.in);
      int val1, val2, contador;
      
      
      System.out.print("Digite o Valor 1 --->");
      val1 = teclado.nextInt();

      System.out.print("Digite o Valor 2 --->");
      val2 = teclado.nextInt();
      
      if(val1 > 0 && val2 > 0 && val2 > val1 ){
    	contador = val1;
    	while(contador <= val2) {
    		System.out.println(contador);
    		contador = contador + 1;
    	}
      } else {
    	  System.out.println("Deu Pau na maquina!!");
      }
      
     
      teclado.close();
	}

}