package lista_de_exercios2;

import java.util.Scanner;

public class SalarioProf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
        double salarioTotal, SB, HA, DSR ;
        int aulas, horasaulas ;
        
        System.out.println("Quantas aulas você Aplicou na semana -->");
        aulas = teclado.nextInt();
        
        System.out.println("Quantas Horas por Aula-->");
        horasaulas = teclado.nextInt();
        
        SB = aulas * 4.5 * horasaulas;
        HA = Math.pow(5/100, SB);
        DSR = SB/1/6 + HA ;
        
        salarioTotal = SB + HA + DSR;
        
        System.out.println("Seu Salario é" + salarioTotal);
        
        teclado.close();
	}

}
