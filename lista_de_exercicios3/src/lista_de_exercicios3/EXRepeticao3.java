package lista_de_exercicios3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EXRepeticao3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner arquivo = new Scanner(new File("arquivo.smn"));
		int valor, contador=1;
		int maior = Integer.MIN_VALUE ;//fazemos de forma contraria para descobrir o menor valor
		
		while(arquivo.hasNextInt()) {
			valor = arquivo.nextInt();
			System.out.println(valor);
			contador = contador + 1;
			if (valor > maior) {
				maior = valor;
			}
		}
		
		System.out.println(contador);
		System.out.println("Maior valor é --->" + maior);
		
		arquivo.close();
	}

}
