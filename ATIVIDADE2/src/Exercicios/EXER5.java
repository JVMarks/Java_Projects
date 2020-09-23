package Exercicios;

import java.util.Scanner;

//Joao Victor Marks F. Delgado RM: 84596
//Willian Augusto Rocha dos Santos RM: 85023
//Bruno Fogaça RM: 84743
public class EXER5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double n, usuario;
		double condicao; 
		
		do {
			System.out.print("Informe um numero (inteiro e positivo) --> ");
			n = keyboard.nextInt();
			
			if(n < 1) {
				System.out.println("O valor digitado deve ser INTEIRO e POSITIVO!!");
			}else {
				condicao = Math.sqrt(8*n + 1);
				
				if (condicao == Math.floor(condicao)) {
					System.out.println("É triangular!");
				}else {
					System.out.println("NÃO é triangular!!");
				}
			}
					
			System.out.println("Para realisar outra consulta digite 1 ou para encerrar Digite 0 --->");
			usuario = keyboard.nextInt();
			
			if(usuario == 0){
	     		 System.out.println("Encerramos o codigo!!");
	     	     }
		}while(usuario == 1);
		
		keyboard.close();
	}

}