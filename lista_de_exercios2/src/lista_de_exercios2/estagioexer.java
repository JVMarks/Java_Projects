package lista_de_exercios2;

import java.util.Scanner;

public class estagioexer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int  numero, resultado;
		
		System.out.println("digite seu numero de 0 a 60 -->");
		numero = teclado.nextInt();
		
		resultado = (numero + 1)%61;
		
		System.out.println("é:" + resultado);
		
		
        teclado.close();
      }

}//fim
