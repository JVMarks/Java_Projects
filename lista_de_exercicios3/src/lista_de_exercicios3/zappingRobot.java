package lista_de_exercicios3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class zappingRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Bruno Foga�a 84743
				// Diego Ferreira Barbosa 85263
				// Gabriel Coelho Cruz 85248
				// Jo�o Victor Marks de Farias Delgado 84596
				// Willian Augusto Rocha dos Santos 85023
		
		       //classes:Random, Scanner, BigDecimal, RoundingMode.HALF_EVEN
		      
				int medidaSala;
				Scanner teclado = new Scanner(System.in);
				Random gerador = new Random();
				double dados;
				int passos = 0;
				int direcao = -1;
				int direcaorep = -1;

				System.out.print("Digite a medida da sala: " + "\n");
				medidaSala = teclado.nextInt();

				while (true) {

					direcao = gerador.nextInt(4) + 1;

					if (direcaorep != direcao) {
						System.out.println("A dire��o �: " + direcao + "\n"
								+ "Lembrando as dire��es ser�o indicadas atrav�s de n�meros, sendo: 1�FRENTE, 2�TR�S, 3�DIREITA e 4�ESQUERDA");

						passos = passos + 10;
						dados = gerador.nextDouble();
						BigDecimal bd = new BigDecimal(dados).setScale(4, RoundingMode.HALF_EVEN); //RoundingMode.HALF_EVEN
						System.out.println("\n" + "Dado Coletado = " + bd.doubleValue());

						if (dados >= 0 && dados <= 0.4589) {
							System.out.println(
									"O rob� encontrou uma col�nia de v�rus e acionou a emiss�o de raios UV para desinfetar o ambiente."
											+ "\n");

						} else if (dados > 0.4589 && dados < 0.7999) {
							System.out.println(
									"O Rob� encontrou um ser humano e ir� escolher outra dire��o para movimentar-se." + "\n");
							direcaorep = direcao;

						} else if (dados >= 0.7999) {
							System.out.println(
									"O Rob� encontrou um obst�culo e ir� escolher outra dire��o para movimentar-se." + "\n");
							direcaorep = direcao;
						}

						if (passos == medidaSala) {
							System.out.println("O rob� percorreu e analisou toda a sala, com o total de: " + passos + "cm");
							System.exit(0);

						}
					}

				}
		
		
	}

}
