package aula_02;

import java.util.Scanner;

public class Exercicio5SwitchLanche {
	static Scanner entrada= new Scanner (System.in);
	public static void main(String[] args) {
		
		int produto, quantidade;
		double valorTotal;
		
		System.out.println("Digite o código do produto: \n"
				+ "1 Cachorro Quente R$ 10.00 uni\n"
				+ "2 X-Salada R$ 15.00 uni\n"
				+ "3 X-Bacon R$ 18.00 uni\n"
				+ "4 Bauru R$ 12.00 uni \n"
				+ "5 Refrigerante R$ 8.00 uni \n"
				+ "6 Suco de laranja R$ 13.00 uni");
		produto = entrada.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = entrada.nextInt();
		
		switch(produto)
		{
		case 1:
			valorTotal = quantidade * 10.00;
			System.out.printf("Produto: Cachorro Quente \nValor total: R$ %.2f", valorTotal);
			break;
		case 2:
			valorTotal = quantidade * 15.00;
			System.out.printf("Produto: X-Salada \nValor total: R$ %.2f",  valorTotal);
			break;
		case 3:
			valorTotal = quantidade * 18.00;
			System.out.printf("Produto: X-Bacon \nValor total: R$ %.2f", valorTotal);
			break;
		case 4:
			valorTotal = quantidade * 12.00;
			System.out.printf("Produto: Bauru \nValor total: R$ %.2f", valorTotal);
			break;
		case 5:
			valorTotal = quantidade * 8.00;
			System.out.printf("Produto: Refrigerante \nValor total: R$ %.2f", valorTotal);
			break;
		case 6:
			valorTotal = quantidade * 13.00;
			System.out.printf("Produto: Suco de laranja \nValor total: R$ %.2f", valorTotal);
			break;
			default:
				System.out.println("Produto não encontrado.");
		}
		

	}

}
