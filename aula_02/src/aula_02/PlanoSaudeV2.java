package aula_02;

import java.util.Scanner;

public class PlanoSaudeV2 {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int opcao;
		
		System.out.println("Qual sua faixa etária?\n"
				+ "1° Até 10 anos.\n"
				+ "2º Entre 10 e 29 anos.\n"
				+ "3º Entre 45 e 59 anos.\n"
				+ "4º Entre 59 e 65 anos.\n"
				+ "6º Maior que 65 anos.");
		opcao = entrada.nextInt();
		
		switch(opcao)
		{
		case 1:
			System.out.println("Valor do Plano de saúde: R$ 100,00");
			break;
		case 2:
			System.out.println("Valor do Plano de saúde: R$ 200,00");
			break;
		case 3:
			System.out.println("Valor do Plano de saúde: R$ 300,00");
			break;
		case 4:
			System.out.println("Valor do Plano de saúde: R$ 500,00");
			break;
		case 5:
			System.out.println("Valor do Plano de saúde: R$ 600,00");
			break;
		case 6:
			System.out.println("Valor do Plano de saúde: R$ 1000,00");
			break;
			default:
				System.out.println("Faixa etária inválida!");
		}
		
	}

}
