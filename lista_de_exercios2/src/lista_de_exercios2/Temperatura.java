package lista_de_exercios2;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner teclado = new Scanner(System.in);
       int cels;
       double fahre;
       
       System.out.println("Quantos Graus celsius estão na sua cidade:");
       cels = teclado.nextInt();
       
       fahre = (9 * (cels))/5 + 32;
       
       System.out.println("Seu resultado em Graus fahrenheit São:" + fahre );
       
       
       teclado.close();
	}

}
