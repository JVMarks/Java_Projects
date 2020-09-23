package Exercicios;

import java.util.Scanner;

//Joao Victor Marks F. Delgado RM: 84596
//Willian Augusto Rocha dos Santos RM: 85023
//Bruno Fogaça RM: 84743
public class EXER3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		long num;
		int cont = 1, usuario;
		
		
			do {
				
				System.out.print("Digite um valor (inteiro positivo) --> ");
				num = keyboard.nextLong();
				if(num > 0) {
					
			while(num != 0) {
				num = num/10; 
				cont++;
			} 
			System.out.print("O numero é composto por --> ");
			System.out.print(cont-1);
			System.out.println(" Digitos!");
				} else {
					System.out.println("Para descobir quantos digitos tem um valor, o valor deve ser positivo!!!");
				}
			
			System.out.println("Para realisar outra consulta digite 1 para encerrar Digite 0 --->");
			usuario = keyboard.nextInt();
			
			if(usuario == 0){
	     		 System.out.println("Encerramos o codigo!!");
	     	     }
			
			}while(usuario == 1);

		keyboard.close();
	}
}