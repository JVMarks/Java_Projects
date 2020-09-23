package Exercicios;

import java.util.Scanner;

//Joao Victor Marks F. Delgado RM: 84596
//Willian Augusto Rocha dos Santos RM: 85023
//Bruno Fogaça RM: 84743
public class EXER4 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in)) {
			long num;
			int usuario;
			int contador = 1;
			int diferenca, pot;
			int somaQ = 0, quadradoS = 0;
			
			do{
				System.out.print("Digite um valor (inteiro e positivo)--> ");
				num = keyboard.nextLong();
				
				if(num >= 0) {
					
					for(; contador <= num; contador++) {
						somaQ += Math.pow(contador, 2);
						quadradoS += contador;
						pot = (int) Math.pow(quadradoS, 2);
						
						diferenca = pot - somaQ;
						
						System.out.println(diferenca);
								
					}
				}else {
					System.out.println("O valor deve ser inteiro e positivo!!");
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

}//fim

//A soma dos quadrados dos primeiros dez números naturais é:  
	 
//1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 + 9^2 + 10^2 = 385 
 
//O  quadrado da soma dos primeiros 10 números naturais é: 
 
//(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10)2 = 552 = 3025 