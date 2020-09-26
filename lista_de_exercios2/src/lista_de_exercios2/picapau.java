package lista_de_exercios2;

import java.util.Scanner;

public class picapau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner teclado = new Scanner(System.in);
       int prodM,prodsema ;
 
       System.out.println("endique a produção Semanal:");
       prodsema = teclado.nextInt();
       
       prodM = -(prodsema * 4)/10 +prodsema  ;
       
       System.out.println("seu resultado do mes é:" + prodM);
       
       
       teclado.close();
	}

}
