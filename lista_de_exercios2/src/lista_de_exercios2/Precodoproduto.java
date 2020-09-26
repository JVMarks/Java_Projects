package lista_de_exercios2;

import java.util.Scanner;

public class Precodoproduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner teclado = new Scanner(System.in);
       int Cod,c4, c5;
       int Preco, p1, p2, p3p4;
       
       System.out.println("Informe o Codigo de Barras -->");
       Cod = teclado.nextInt();
       
       p3p4 = Cod/1000;
       c4 = Cod % 100/10;
       c5 = Cod % 10;
       p2 = (c4 * c5) % 10;
       p1 =p3p4 % 10;
       
       Preco = p1*1000+p2*100+p3p4;
       
       System.out.println("O valor a ser pago é R$" + Preco);
       
       
       teclado.close();
	}

}//fim

//THE BUG
//BREACKPOINT
//DEBUG AS
