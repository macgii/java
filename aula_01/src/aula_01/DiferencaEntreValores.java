package aula_01;

import java.util.Scanner;

public class DiferencaEntreValores {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		float numeroUm, numeroDois, numeroTres, numeroQuatro, diferenca;
		
		System.out.println("Digite um número: ");
		numeroUm = entrada.nextFloat();
		
		System.out.println("Digite outro número: ");
		numeroDois = entrada.nextFloat();
		
		System.out.println("Digite outro número: ");
		numeroTres = entrada.nextFloat();
		
		System.out.println("Digite outro número: ");
		numeroQuatro = entrada.nextFloat();
		
		diferenca = (numeroUm * numeroDois) - (numeroTres * numeroQuatro);
		
		System.out.println("Diferença: " + diferenca);
		entrada.close();
		
		
	}
}
