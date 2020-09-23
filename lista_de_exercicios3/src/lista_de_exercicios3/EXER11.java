package lista_de_exercicios3;

import java.util.Scanner;

public class EXER11 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in)) {
			int n,x ;
			double y= 0.0;
			
			System.out.println("Informe o valor de N maior que zero -->");
			n = keyboard.nextInt();
			
			if(n > 0) {
				for(x=1;x<=n;x++){
					y = y + x/Math.sqrt(x); //converção de tipos ou Cast
				}
				System.out.println(y);
			} else {
				System.out.println("O valor de N tem quer ser maior que 0");
			}
			
			keyboard.close();
		}
	}

}
