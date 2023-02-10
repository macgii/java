package aula_02;

import java.util.Scanner;

public class Calculadora {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String args[]) {
		
		double n1, n2;
		
		System.out.println("Digite o 1° número: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite o 2° número: ");
		n2 = entrada.nextDouble();
		
		System.out.println("O número " + n1 + " elevado ao número " + n2 + " é igual a: " + Math.pow(n1, n2));
		
		System.out.println("A raiz quadrada do número " + n1 + " é igual a: " + Math.sqrt(n1));
		
		System.out.println("Pré incremento: ");
		System.out.println(n1);
		System.out.println(++n1);
		
		System.out.println("Pós incremento: ");
		System.out.println(n2);
		System.out.println(n2++);
		System.out.println(n2);
	}
}
