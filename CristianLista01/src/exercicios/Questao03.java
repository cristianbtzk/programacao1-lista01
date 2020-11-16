package exercicios;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um valor para ser sacado: ");
		int valor = scan.nextInt();
		
		if(valor < 10 || valor > 600) {
			System.out.println("O valor deve estar entre R$ 10 e R$ 600.");
		}else {
		
			int notas = 0;
			
			notas = valor / 100;
			valor %= 100;
			
			if (notas > 0)
				System.out.println(notas+ " nota(s) de R$ 100.");
			
			notas = valor / 50;
			valor %= 50;
			
			if (notas > 0)
				System.out.println(notas+ " nota(s) de R$ 50.");
			
			notas = valor / 10;
			valor %= 10;
			
			
			if (notas > 0)
				System.out.println(notas+ " nota(s) de R$ 10.");
			
			notas = valor / 5;
			valor %= 5;
			
			if (notas > 0)
				System.out.println(notas+ " nota(s) de R$ 5.");
			
			notas = valor / 1;
			valor %= 1;
			
			if (notas > 0)
				System.out.println(notas+ " nota(s) de R$ 1.");
		}
	}
}
