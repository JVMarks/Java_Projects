package lista_de_exercios2;

import java.util.Scanner;

public class farmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner teclado = new Scanner(System.in);
     String nome, genero;
     
     System.out.println("Informe o seu nome --> ");
     nome = teclado.nextLine();
     
     System.out.println(nome);
     
     System.out.println("Informe o seu genero --> ");
     genero = teclado.nextLine();
     
     System.out.println(genero);
     

     
     teclado.close();
	}

}
