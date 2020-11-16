package exercicios;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		float salario = scan.nextFloat();
		
		int percentual = 0;
		float aumento = 0;
		float novoSal = 0;
		
		if(salario <= 280) {
			percentual = 20;
			aumento = salario * (percentual / 100f);
			novoSal = salario + aumento;
		}else if(salario <= 700) {
			percentual = 15;
			aumento = salario * (percentual / 100f);
			novoSal = salario + aumento;
		}else if(salario <= 1500) {
			percentual = 10;
			aumento = salario * (percentual / 100f);
			novoSal = salario + aumento;
		}else {
			percentual = 5;
			aumento = salario * (percentual / 100f);
			novoSal = salario + aumento;
		}
		
		System.out.println("Salário antes do reajuste: R$ "+salario);
		System.out.println("Percentual de reajuste: "+percentual+"%.");
		System.out.println("Valor do aumento: R$ "+aumento);
		System.out.println("Salário reajustado: R$ "+novoSal);
		
		scan.close();
	}
}
