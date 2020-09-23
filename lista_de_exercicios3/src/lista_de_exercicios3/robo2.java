package lista_de_exercicios3;

import java.util.Scanner;

public class robo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner keyboard = new Scanner(System.in);
		
		int i_charge_robot, i_cm = 0, i_movement;
		String s_direction;
		boolean a = true;
		
		System.out.println("Bem-vindo ao labirinto da NEXTWAVE! Será que consegue chegar até o final?\n");
		
		System.out.print("Digite a quantidade de carga que o robo deverá ter: ");
		i_charge_robot = keyboard.nextInt();
		
		if(i_charge_robot < 100) {
			System.out.println("Game Over -> você precisa de mais carga!!!");
			System.out.println("\nCalma! Pense em outra estratégia e tente denovo!!!");
			
			System.exit(1);
		} else {
			
			/*============================\\
			||            FASE 1          ||
			\\============================*/
			
			System.out.print("Diga qual direção ele deve que andar: ");
			s_direction = keyboard.next().toLowerCase();	
			
			if(s_direction.equals("finalizar")) {
				System.out.println("Jogo finalizado, volte sempre para mais desafios!");
				System.exit(1);
			}
			
			while (s_direction.equals("direita")) {
				System.out.println("Indica a distância que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					break;
				}
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
			}
			while (s_direction.equals("cima")) {
				System.out.println("Direção incorreta, Indica a distância que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
				
			}
			while (s_direction.equals("esquerda")) {
				System.out.println("Direção incorreta, Indica a distância em CM que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
			}
				
			if(s_direction.equals("baixo")) {
		
				do {
					System.out.println("Indica a distância em CM que seu robo deve andar: ");
					i_movement = keyboard.nextInt();
					
					i_charge_robot = i_charge_robot - i_movement;
					
					if(i_charge_robot <= 0) {
						System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
						System.exit(1);
					} 
					
					if ( i_movement >= 12 && i_movement <= 14 ) {
						i_cm = i_cm + i_movement; //Concatenando o quanto em CM ele andou durante o labirinto
						System.out.println("Carga atual da bateria: " + i_charge_robot);
						 a = false;
						 break;
					}
					
					System.out.println("\n\n\nErro direção incorreta!!!");
					System.out.println("Carga atual da bateria: " + i_charge_robot);
					
					
				}while (a);
				
				
					//System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
					//s_direction = keyboard.next();
			}
			else {
				System.out.println("Você deve digitar direções válidas!");
				System.exit(1);
			}
			
			
			
			
			
			
		
			
			
			/*============================\\
			||            FASE 2          ||
			\\============================*/
			System.out.print("BOA, você passou dessa fase diga qual direção ele deve que andar: ");
			s_direction = keyboard.next().toLowerCase();		
			
			if(s_direction.equals("finalizar")) {
				System.out.println("Jogo finalizado, volte sempre para mais desafios!");
				System.exit(1);
			}
			
			while (s_direction.equals("baixo")) {
				System.out.println("Direção incorreta, Indica a distância que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
			}
			while (s_direction.equals("cima")) {
				System.out.println("Direção incorreta, Indica a distância que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
				
			}
			while (s_direction.equals("esquerda")) {
				System.out.println("Direção incorreta, Indica a distância em CM que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
			}
				
			if(s_direction.equals("direita")) {
				a = true;
				do {
					System.out.println("Indica a distância em CM que seu robo deve andar: ");
					i_movement = keyboard.nextInt();
					
					i_charge_robot = i_charge_robot - i_movement;
					
					if(i_charge_robot <= 0) {
						System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
						System.exit(1);
					} 
					
					if (i_movement >= 7 && i_movement <= 9) {
						i_cm = i_cm + i_movement; //Concatenando o quanto em CM ele andou durante o labirinto
						System.out.println("Carga atual da bateria: " + i_charge_robot);
						 a = false;
						 break;
					}
	
					System.out.println("\n\n\nErro direção incorreta!!!");
					System.out.println("Carga atual da bateria: " + i_charge_robot);
					
					
				}while (a);
			} else {
				System.out.println("Você deve digitar direções válidas!");
				System.exit(1);
			}
			
			
			
			
			
			
			
			
			/*============================\\
			||            FASE 3          ||
			\\============================*/
			
			System.out.print("BOA, você passou dessa fase diga qual direção ele deve que andar: ");
			s_direction = keyboard.next().toLowerCase();		
			
			if(s_direction.equals("finalizar")) {
				System.out.println("Jogo finalizado, volte sempre para mais desafios!");
				System.exit(1);
			}
			
			while (s_direction.equals("direita")) {
				System.out.println("Direção incorreta, Indica a distância que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
			}
			while (s_direction.equals("cima")) {
				System.out.println("Direção incorreta, Indica a distância que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
				
			}
			while (s_direction.equals("esquerda")) {
				System.out.println("Direção incorreta, Indica a distância em CM que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
			}
				
			if(s_direction.equals("baixo")) {
				a = true;
				do {
					System.out.println("Indica a distância em CM que seu robo deve andar: ");
					i_movement = keyboard.nextInt();
					
					i_charge_robot = i_charge_robot - i_movement;
					
					if(i_charge_robot <= 0) {
						System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
						System.exit(1);
					} 
					
					if (i_movement >= 23 && i_movement <= 25) {
						i_cm = i_cm + i_movement; //Concatenando o quanto em CM ele andou durante o labirinto
						System.out.println("Carga atual da bateria: " + i_charge_robot);
						a = false;
						break;
					}
					
	
					System.out.println("\n\n\nErro direção incorreta!!!");
					System.out.println("Carga atual da bateria: " + i_charge_robot);
				}while (a);
			} else {
				System.out.println("Você deve digitar direções válidas!");
				System.exit(1);
			}

			/*============================\\
			||            FASE 4          ||
			\\============================*/
			System.out.print("BOA, você passou dessa fase diga qual direção ele deve que andar: ");
			s_direction = keyboard.next().toLowerCase();		
			
			if(s_direction.equals("finalizar")) {
				System.out.println("Jogo finalizado, volte sempre para mais desafios!");
				System.exit(1);
			}
			
			while (s_direction.equals("baixo")) {
				System.out.println("Direção incorreta, Indica a distância que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
			}
			while (s_direction.equals("cima")) {
				System.out.println("Direção incorreta, Indica a distância que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
				
			}
			while (s_direction.equals("esquerda")) {
				System.out.println("Direção incorreta, Indica a distância em CM que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
			}
				
			if(s_direction.equals("direita")) {
				a = true;
				do {
					System.out.println("Indica a distância em CM que seu robo deve andar: ");
					i_movement = keyboard.nextInt();
					
					i_charge_robot = i_charge_robot - i_movement;
					
					if(i_charge_robot <= 0) {
						System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
						System.exit(1);
					} 
					
					if (i_movement >= 24 && i_movement <= 28) {
						i_cm = i_cm + i_movement; //Concatenando o quanto em CM ele andou durante o labirinto
						System.out.println("Carga atual da bateria: " + i_charge_robot);
						a = false;
						 break;
					}
	
					System.out.println("\n\n\nErro direção incorreta!!!");
					System.out.println("Carga atual da bateria: " + i_charge_robot);
					
				}while (a);
			} else {
				System.out.println("Você deve digitar direções válidas!");
				System.exit(1);
			}
			/*============================\\
			||            FASE 5          ||
			\\============================*/
			System.out.print("BOA, você passou dessa fase diga qual direção ele deve que andar: ");
			s_direction = keyboard.next().toLowerCase();		
			
			if(s_direction.equals("finalizar")) {
				System.out.println("Jogo finalizado, volte sempre para mais desafios!");
				System.exit(1);
			}
			
			while (s_direction.equals("baixo")) {
				System.out.println("Direção incorreta, Indica a distância que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
			}
			while (s_direction.equals("direita")) {
				System.out.println("Direção incorreta, Indica a distância que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);
				}
				
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
				
			}
			while (s_direction.equals("esquerda")) {
				System.out.println("Direção incorreta, Indica a distância em CM que seu robo deve andar: ");
				i_movement = keyboard.nextInt();
				
				i_charge_robot = i_charge_robot - i_movement;
				
				if(i_charge_robot <= 0) {
					System.out.println("GAME-OVER");
					System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
					System.exit(1);;
				}
				System.out.print("Seu robô esta indo pelo caminho errado, que bom que voltou para o lugar que você estava, indica uma nova DIREÇÃO para seu robo seguir: ");
				s_direction = keyboard.next();
			}
				
			if(s_direction.equals("cima")) {
				a = true;
				do {
					System.out.println("Indica a distância em CM que seu robo deve andar: ");
					i_movement = keyboard.nextInt();
					
					i_charge_robot = i_charge_robot - i_movement;
					
					if(i_charge_robot <= 0) {
						System.out.println("A bateria do seu robô acabou, mas calma pense em outra estratégia e tente novamente!");
						System.exit(1);
					} 
					
					if (i_movement >= 32 && i_movement <= 34) {
						i_cm = i_cm + i_movement; //Concatenando o quanto em CM ele andou durante o labirinto
						System.out.println("Carga atual da bateria: " + i_charge_robot);
						 a = false;
						 break;
					}
					
					
				}while (a);
			} else {
				System.out.println("Você deve digitar direções válidas!");
				System.exit(1);
			}
			
			System.out.println("\n\n\nParabéns!!! Você terminou o nosso labirinto!!");
			System.out.println("Este é o restante da sua bateria:" + i_charge_robot);
			System.out.println("Durante o labirinto você andou: " + i_cm + " CM");
			
			
			
			
			
			
			
			keyboard.close();
		}
	}

}
