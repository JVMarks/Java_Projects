package lista_de_exercicios3;

import java.util.Scanner;

public class EXER9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner keyboard = new Scanner(System.in);
     int valor1, valor2, resultado=0;
     
     System.out.println("Digite seu 1� valor --->");
     valor1 = keyboard.nextInt();
     
     System.out.println("Digite seu 2� valor --->");
     valor2 = keyboard.nextInt();
     
     if (valor1 >= 0 && valor2 >= 0){
    	for(int contador = 1; contador <= valor2; contador++) {//� uma estrutura de repeti��o(usamos quando sabemos a quantidade)
    		resultado = resultado + valor2; //resultado +=   		
    	} 
    	System.out.println(resultado);
     }else {
    	 System.out.println("Os valores devem ser positivos");
     }
     
     keyboard.close();
	}

}