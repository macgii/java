package aula_02;

import java.util.Scanner;

public class Exercicio1IfTresInteiros {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int a, b, c, soma;
		
		System.out.println("Digite um valor para A: ");
		a = entrada.nextInt();
		System.out.println("Digite um valor para B: ");
		b = entrada.nextInt();
		System.out.println("Digite um valor para C: ");
		c = entrada.nextInt();
		
		soma = a + b;
		
		if(soma>c)
		{
			System.out.println(soma + " é maior que " + c);
		}
		else if(soma<c)
		{
			System.out.println(soma + " é menor que " + c);
		}
		else if(soma==c)
		{
			System.out.println(soma + " é igual a " + c);
		}
		
		System.out.println("");
		

	}

}
