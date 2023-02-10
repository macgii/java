package aula_03;

import java.util.Scanner;

public class Exercicio3WhileIdade {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int idade , menorVinteUm = 0, maiorCinquenta = 0;
		
		System.out.println("Digite sua idade? ");
		idade = entrada.nextInt();
		
		while(idade>0) 
		{
			
			if(idade<21)
			{
				menorVinteUm++;
			}
			else if(idade>50)
			{
				maiorCinquenta++;
			}
			System.out.println("Digite sua idade? ");
			idade = entrada.nextInt();
			
		}
		System.out.println("Pessoas com menos de 21 anos: " + menorVinteUm);
		System.out.println("Pessoas com mais de 50 anos: " + maiorCinquenta);
	}
}
