package extra;

import java.util.Scanner;

public class ExercicioDois {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String args[]) {
		
		int numeroUm, numeroDois, soma, subtracao, multiplicacao, divisao;
		
		System.out.println("Digite o 1º número: ");
		numeroUm = entrada.nextInt();
		
		System.out.println("Digite o 2º número: ");
		numeroDois = entrada.nextInt();
		
		soma = numeroUm + numeroDois;
		subtracao = numeroUm - numeroDois;
		multiplicacao = numeroUm * numeroDois;
		divisao = numeroUm / numeroDois;
		
		System.out.println("Soma: " + soma + "\nSubtração: " + subtracao + "\nMultiplicação: " + multiplicacao + "\nDivisão: " + divisao);
		
	}
	
}
