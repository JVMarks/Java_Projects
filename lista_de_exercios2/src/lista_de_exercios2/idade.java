package lista_de_exercios2;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner teclado = new Scanner(System.in);
      int idadeAtual, idadefut ;
      
      System.out.print("Digite sua idade --->");
      idadeAtual = teclado.nextInt();
      
      
      idadefut = idadeAtual + 30;
      
      
      System.out.println("SUA IDADE ATUAL É --->" + idadeAtual + " " + "ANOS");
      System.out.println("EM 2050 VOCÊ TERA --->" + idadefut + " " + "ANOS" );
      
      teclado.close();
	}

}
