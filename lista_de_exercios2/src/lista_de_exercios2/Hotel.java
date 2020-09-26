package lista_de_exercios2;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner teclado = new Scanner(System.in);
    double conta, taxa;
    int dias;
    
    System.out.print("Quantos dias você Ficou -->");
    dias = teclado.nextInt();
    
    if( dias> 15 ) {
    	taxa = 15.50;
    } else if(dias == 15) {
    	taxa = 36.00;
    } else {
    	taxa = 58.00;
    }
    
    conta = 150 * dias + taxa* dias;
    System.out.println("VOCÊ DEVERA PAGAR:"+ " R$" + conta);
    
    teclado.close();
	}

}
