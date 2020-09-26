package lista_de_exercios2;

import java.util.Scanner;

public class Mcqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner teclado = new Scanner(System.in);
    double velocidade, Distancia, consumo;
    int tempo;
    
    System.out.println("Informe o tempo gasto:");
    tempo = teclado.nextInt();
    
    System.out.println("Informe a velocidade:");
    velocidade = teclado.nextDouble();
    
    Distancia = tempo * velocidade;
    consumo = Distancia/ 12;
    
    System.out.println("Sua distancia é -->" + Distancia);
    System.out.println("Seu consumo foi -->" + consumo);
    
    
    
    
    teclado.close();
	}

}
