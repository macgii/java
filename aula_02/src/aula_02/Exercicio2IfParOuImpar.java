package aula_02;

import java.util.Scanner;

public class Exercicio2IfParOuImpar {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0)
		{
			if(numero<0)
				System.out.println("O número " + numero + " é par e negativo.");
			else {
				System.out.println("O número " + numero + " é par e positivo.");
			}
		}
		else
		{
			if(numero<0)
				System.out.println("O número " + numero + " é ímpar e negativo.");
			else
				System.out.println("O número " + numero + " é ímpar e positivo.");
		}
	}
}
