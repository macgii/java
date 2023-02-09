package extra;

import java.util.Scanner;

public class ExercicioUm {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String args[]) {
		
		int numeroUm, numeroDois, soma;
		
		System.out.println("Digite o 1º número: ");
		numeroUm = entrada.nextInt();
		
		System.out.println("Digite o 2º número: ");
		numeroDois = entrada.nextInt();
		
		soma = numeroUm + numeroDois;
		System.out.println("Soma: " + soma);
		
	}
}
