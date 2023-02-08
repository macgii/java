package aula_01;

import java.util.Scanner;

public class DiferencaEntreValores {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		int numeroUm, numeroDois, numeroTres, numeroQuatro, diferenca;
		
		System.out.println("Digite um número: ");
		numeroUm = entrada.nextInt();
		
		System.out.println("Digite outro número: ");
		numeroDois = entrada.nextInt();
		
		System.out.println("Digite outro número: ");
		numeroTres = entrada.nextInt();
		
		System.out.println("Digite outro número: ");
		numeroQuatro = entrada.nextInt();
		
		diferenca = (numeroUm * numeroDois) - (numeroTres * numeroQuatro);
		
		System.out.println("Diferença: " + diferenca);
		entrada.close();
		
		
	}
}
