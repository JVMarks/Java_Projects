package lista_de_exercios2;

import java.util.Scanner;

public class MEDIA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner teclado = new Scanner(System.in);
   double nota1, nota2, media;
   
   System.out.print("NOTA 1 -->");
   nota1 = teclado.nextDouble();
   
   System.out.print("NOTA 2 -->");
   nota2 = teclado.nextDouble();
   
   media = (nota1+nota2)/2;
   
   System.out.println("M�dia -->" + media);
   
   if(media>= 6){
	   System.out.println("Parabens voc� passou!!");
   }else if(media<=4) {
	   System.out.println("Voc� est� Reprovado");
   }else {
	   System.out.println("Voc� pegou DP");
   }
   
   teclado.close();
	}

}
