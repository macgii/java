package aula_03;

import java.util.Scanner;

public class Exercicio6DoWhileMediaMultiplosDeTres {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int numero, quantidade = 0;
		float soma = 0, media;
		
		do {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			if(numero % 3 == 0) {
				soma = soma + numero;
				if(numero!=0) {
					quantidade++;
				}
			}
		}while(numero!=0);
		media = soma / quantidade;
		System.out.printf("Media: %.1f", media);
	}
}
