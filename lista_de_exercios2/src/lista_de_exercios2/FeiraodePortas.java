package lista_de_exercios2;

import java.util.Scanner;

public class FeiraodePortas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner teclado = new Scanner(System.in);
       double valorTotal, porcas, arruelas, parafusos ;
       
       System.out.println("Quantidade de Porcas:");
       porcas = teclado.nextDouble();
       
       System.out.println("Quantidade de Arruelas:");
       arruelas = teclado.nextDouble();
       
       System.out.println("Quantidade de Parafusos:");
       parafusos = teclado.nextDouble();
 
       
       valorTotal = (porcas * 0.50 - 10/100) + (arruelas * 0.45 - 30/100) + (parafusos * 0.30 - 20/100);
       
       System.out.println("Valor das Compras de Roberto foi de R$" + valorTotal);
       
       teclado.close();
	}

}
