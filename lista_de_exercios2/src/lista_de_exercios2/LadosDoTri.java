package lista_de_exercios2;

import java.util.Scanner;

public class LadosDoTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner teclado = new Scanner(System.in);
     int a, b, c ;
     
     System.out.print("Quanto Vale o Lado A --->");
     a = teclado.nextInt();
     
     System.out.print("Quanto Vale o Lado B --->");
     b = teclado.nextInt();
     
     System.out.print("Quanto Vale o Lado C --->");
     c = teclado.nextInt();
     
     
     if( a < b+c && b < a+c && c < a+b ){
    	 System.out.println("É um Triangulo");
     } else {
    	 System.out.println("Isso ai ta muito errado irmão");
     }
     
     //if( a >= b+c || b >= a+c || c >= a+b ){
    	//System.out.println("É um Triangulo");
     //}
     
     
     teclado.close();
	}

}
