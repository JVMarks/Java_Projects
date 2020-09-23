package lista_de_exercicios3;

import java.util.Scanner;

public class robocod {

	public static void main(String[] args) {

		// Bruno Fogaça 84743
		// Diego Ferreira Barbosa 85263
		// Gabriel Coelho Cruz 85248
		// João Victor Marks de Farias Delgado 84596
		// Willian Augusto Rocha dos Santos 85023

		Scanner teclado = new Scanner(System.in);
		int cargaRobo;
		int cargaAtual = 0;


		int distancia1, distancia2, distancia3, distancia4, distancia5;
		String direcao1, direcao2, direcao3, direcao4, direcao5;

		System.out.print("Digite a carga da bateria do Robô: ");
		cargaRobo = teclado.nextInt();

		// a carga do robo é de 135V
		if ((cargaRobo >= 135) && (cargaRobo <= 500)) {

			System.out.print("Digite a primeira direção em que o Robô andará: ");
			direcao1 = teclado.next();

			if (direcao1.equalsIgnoreCase("finalizar")) {
				System.out.println("O programa foi finalizado.");
				System.exit(0);
			}

			while (direcao1.equalsIgnoreCase("tras")) {
				System.out.print("Direção incorreta, digite novamente: ");
				direcao1 = teclado.next();
			}
			while (direcao1.equalsIgnoreCase("direita")) {
				System.out.print("Direção incorreta, digite novamente: ");
				direcao1 = teclado.next();
			}
			while (direcao1.equalsIgnoreCase("esquerda")) {
				System.out.print("Direção incorreta, digite novamente: ");
				direcao1 = teclado.next();
			}

			if (direcao1.equals("frente")) {
				System.out.print("Digite a distância em que o Robô andará: ");
				distancia1 = teclado.nextInt();

				while (distancia1 == 5) {

					cargaAtual = cargaRobo - 5 * distancia1;
					System.out.println("Carga da Bateria atual: " + cargaAtual);
					break;
				}
					System.out.print("Digite a segunda direção em que o Robô andará: ");
					direcao2 = teclado.next();

					if (direcao2.equalsIgnoreCase("finalizar")) {
						System.out.println("O programa foi finalizado.");
						System.exit(0);
					}

					while (direcao2.equalsIgnoreCase("tras")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao2 = teclado.next();
					}
					while (direcao2.equalsIgnoreCase("frente")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao2 = teclado.next();
					}
					while (direcao1.equalsIgnoreCase("esquerda")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao2 = teclado.next();
					}

					if (direcao2.equals("direita")) {
						System.out.print("Digite a distância em que o Robô andará: ");
						distancia2 = teclado.nextInt();

						while (distancia2 == 7) {
							cargaAtual = cargaAtual - 5 * distancia2;
							System.out.println("Carga da Bateria atual: " + cargaAtual);
							break;
						}
					}
				
			
					System.out.print("Digite a terceira direção em que o Robô andará: ");
					direcao3 = teclado.next();

					if (direcao3.equalsIgnoreCase("finalizar")) {
						System.out.println("O programa foi finalizado.");
						System.exit(0);
					}

					while (direcao3.equalsIgnoreCase("tras")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao3 = teclado.next();
					}
					while (direcao3.equalsIgnoreCase("frente")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao3 = teclado.next();
					}
					while (direcao3.equalsIgnoreCase("direita")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao3 = teclado.next();
					}

					if (direcao3.equals("esquerda")) {
						System.out.print("Digite a distância em que o Robô andará: ");
						distancia3 = teclado.nextInt();

						while (distancia3 == 6) {
							cargaAtual = cargaAtual - 5 * distancia3;
							System.out.println("Carga da Bateria atual: " + cargaAtual);
							break;
						}
					}
					
					System.out.print("Digite a quarta direção em que o Robô andará: ");
					direcao4 = teclado.next();

					if (direcao4.equalsIgnoreCase("finalizar")) {
						System.out.println("O programa foi finalizado.");
						System.exit(0);
					}

					while (direcao4.equalsIgnoreCase("tras")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao4 = teclado.next();
					}
					while (direcao4.equalsIgnoreCase("frente")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao4 = teclado.next();
					}
					while (direcao1.equalsIgnoreCase("direita")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao4 = teclado.next();
					}

					if (direcao4.equals("esquerda")) {
						System.out.print("Digite a distância em que o Robô andará: ");
						distancia4 = teclado.nextInt();

						while (distancia4 == 5) {
							cargaAtual = cargaAtual - 5 * distancia4;
							System.out.println("Carga da Bateria atual: " + cargaAtual);
							break;
						}
					}
					
					System.out.print("Digite a quinta direção em que o Robô andará: ");
					direcao5 = teclado.next();

					if (direcao5.equalsIgnoreCase("finalizar")) {
						System.out.println("O programa foi finalizado.");
						System.exit(0);
					}

					while (direcao5.equalsIgnoreCase("tras")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao5 = teclado.next();
					}
					while (direcao5.equalsIgnoreCase("frente")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao5 = teclado.next();
					}
					while (direcao5.equalsIgnoreCase("esquerda")) {
						System.out.print("Direção incorreta, digite novamente: ");
						direcao5 = teclado.next();
					}

					if (direcao5.equals("direita")) {
						System.out.print("Digite a distância em que o Robô andará: ");
						distancia5 = teclado.nextInt();

						while (distancia5 == 4) {
							cargaAtual = cargaAtual - 5 * distancia5;
							System.out.println("Carga da Bateria atual: " + cargaAtual);	
							break;
						}
						
					}
			} 
			System.out.println("Parabéns, você alcançou o troféu!!");
			System.out.println("Carga da Bateria restante = " + cargaAtual);
			System.out.println("O Robô percorreu a distância de 27 cm até seu objetivo final.");
			
		} else {
				System.out.println("Bateria informada errada.");
				System.exit(0);
		
			
		}
	}

}