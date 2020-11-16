package exercicios;

import java.util.Scanner;

// Cristain Gabriel Butzke

public class Questao01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Altura: ");
		float altura = scan.nextFloat();
		System.out.println("Peso: ");
		float peso = scan.nextFloat();
		System.out.println("Sexo: m para masculino / f para feminino: ");
		char sexo = scan.next().charAt(0);
		
		float pesoIdeal = 0f;
		
		if(sexo == 'm') 
			pesoIdeal = (float) ((72.7*altura) - 58);
		else 
			pesoIdeal = (float) ((62.1*altura) - 44.7);
		
		
		String situacao = "";
		
		if(peso > pesoIdeal)
			situacao = "acima do peso.";
		else if(peso < pesoIdeal)
			situacao = "abaixo do peso.";
		else
			situacao = "no peso ideal.";
		
		System.out.println("Altura: "+altura+"m. Peso: "+peso+" kg. Sexo: "+sexo+".");
		System.out.println("O peso ideal para você é "+pesoIdeal+" kg, e você está "+situacao);
	}
	
}
