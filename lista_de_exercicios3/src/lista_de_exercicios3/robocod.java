package lista_de_exercicios3;

import java.util.Scanner;

public class robocod {

	public static void main(String[] args) {

		// Bruno Foga�a 84743
		// Diego Ferreira Barbosa 85263
		// Gabriel Coelho Cruz 85248
		// Jo�o Victor Marks de Farias Delgado 84596
		// Willian Augusto Rocha dos Santos 85023

		Scanner teclado = new Scanner(System.in);
		int cargaRobo;
		int cargaAtual = 0;


		int distancia1, distancia2, distancia3, distancia4, distancia5;
		String direcao1, direcao2, direcao3, direcao4, direcao5;

		System.out.print("Digite a carga da bateria do Rob�: ");
		cargaRobo = teclado.nextInt();

		// a carga do robo � de 135V
		if ((cargaRobo >= 135) && (cargaRobo <= 500)) {

			System.out.print("Digite a primeira dire��o em que o Rob� andar�: ");
			direcao1 = teclado.next();

			if (direcao1.equalsIgnoreCase("finalizar")) {
				System.out.println("O programa foi finalizado.");
				System.exit(0);
			}

			while (direcao1.equalsIgnoreCase("tras")) {
				System.out.print("Dire��o incorreta, digite novamente: ");
				direcao1 = teclado.next();
			}
			while (direcao1.equalsIgnoreCase("direita")) {
				System.out.print("Dire��o incorreta, digite novamente: ");
				direcao1 = teclado.next();
			}
			while (direcao1.equalsIgnoreCase("esquerda")) {
				System.out.print("Dire��o incorreta, digite novamente: ");
				direcao1 = teclado.next();
			}

			if (direcao1.equals("frente")) {
				System.out.print("Digite a dist�ncia em que o Rob� andar�: ");
				distancia1 = teclado.nextInt();

				while (distancia1 == 5) {

					cargaAtual = cargaRobo - 5 * distancia1;
					System.out.println("Carga da Bateria atual: " + cargaAtual);
					break;
				}
					System.out.print("Digite a segunda dire��o em que o Rob� andar�: ");
					direcao2 = teclado.next();

					if (direcao2.equalsIgnoreCase("finalizar")) {
						System.out.println("O programa foi finalizado.");
						System.exit(0);
					}

					while (direcao2.equalsIgnoreCase("tras")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao2 = teclado.next();
					}
					while (direcao2.equalsIgnoreCase("frente")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao2 = teclado.next();
					}
					while (direcao1.equalsIgnoreCase("esquerda")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao2 = teclado.next();
					}

					if (direcao2.equals("direita")) {
						System.out.print("Digite a dist�ncia em que o Rob� andar�: ");
						distancia2 = teclado.nextInt();

						while (distancia2 == 7) {
							cargaAtual = cargaAtual - 5 * distancia2;
							System.out.println("Carga da Bateria atual: " + cargaAtual);
							break;
						}
					}
				
			
					System.out.print("Digite a terceira dire��o em que o Rob� andar�: ");
					direcao3 = teclado.next();

					if (direcao3.equalsIgnoreCase("finalizar")) {
						System.out.println("O programa foi finalizado.");
						System.exit(0);
					}

					while (direcao3.equalsIgnoreCase("tras")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao3 = teclado.next();
					}
					while (direcao3.equalsIgnoreCase("frente")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao3 = teclado.next();
					}
					while (direcao3.equalsIgnoreCase("direita")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao3 = teclado.next();
					}

					if (direcao3.equals("esquerda")) {
						System.out.print("Digite a dist�ncia em que o Rob� andar�: ");
						distancia3 = teclado.nextInt();

						while (distancia3 == 6) {
							cargaAtual = cargaAtual - 5 * distancia3;
							System.out.println("Carga da Bateria atual: " + cargaAtual);
							break;
						}
					}
					
					System.out.print("Digite a quarta dire��o em que o Rob� andar�: ");
					direcao4 = teclado.next();

					if (direcao4.equalsIgnoreCase("finalizar")) {
						System.out.println("O programa foi finalizado.");
						System.exit(0);
					}

					while (direcao4.equalsIgnoreCase("tras")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao4 = teclado.next();
					}
					while (direcao4.equalsIgnoreCase("frente")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao4 = teclado.next();
					}
					while (direcao1.equalsIgnoreCase("direita")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao4 = teclado.next();
					}

					if (direcao4.equals("esquerda")) {
						System.out.print("Digite a dist�ncia em que o Rob� andar�: ");
						distancia4 = teclado.nextInt();

						while (distancia4 == 5) {
							cargaAtual = cargaAtual - 5 * distancia4;
							System.out.println("Carga da Bateria atual: " + cargaAtual);
							break;
						}
					}
					
					System.out.print("Digite a quinta dire��o em que o Rob� andar�: ");
					direcao5 = teclado.next();

					if (direcao5.equalsIgnoreCase("finalizar")) {
						System.out.println("O programa foi finalizado.");
						System.exit(0);
					}

					while (direcao5.equalsIgnoreCase("tras")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao5 = teclado.next();
					}
					while (direcao5.equalsIgnoreCase("frente")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao5 = teclado.next();
					}
					while (direcao5.equalsIgnoreCase("esquerda")) {
						System.out.print("Dire��o incorreta, digite novamente: ");
						direcao5 = teclado.next();
					}

					if (direcao5.equals("direita")) {
						System.out.print("Digite a dist�ncia em que o Rob� andar�: ");
						distancia5 = teclado.nextInt();

						while (distancia5 == 4) {
							cargaAtual = cargaAtual - 5 * distancia5;
							System.out.println("Carga da Bateria atual: " + cargaAtual);	
							break;
						}
						
					}
			} 
			System.out.println("Parab�ns, voc� alcan�ou o trof�u!!");
			System.out.println("Carga da Bateria restante = " + cargaAtual);
			System.out.println("O Rob� percorreu a dist�ncia de 27 cm at� seu objetivo final.");
			
		} else {
				System.out.println("Bateria informada errada.");
				System.exit(0);
		
			
		}
	}

}