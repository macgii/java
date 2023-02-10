package aula_02;

import java.util.Scanner;

public class Exercicio8ContaBancaria {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int opcao;
		float saldo, valorSaque, novoSaldo, deposito;
		saldo = 1000.00f;
		
		System.out.println("Escolha uma opção: \n1 Saldo \n2 Saque \n3 Depósito");
		opcao = entrada.nextInt();
		
		switch(opcao)
		{
		case 1:
			System.out.println("Operação - Saldo");
			System.out.println("Valor do saldo:  R$" + saldo);
			break;
		case 2:
			System.out.println("Operação - Saque");
			System.out.println("Valor do saque: ");
			valorSaque = entrada.nextFloat();
			novoSaldo = saldo - valorSaque;
			if(valorSaque>saldo)
			{
				System.out.println("Saldo insulficiente!");
			}else
			{
				System.out.println("Saldo atual: R$" + saldo);
			}	
			break;
		case 3:
				System.out.println("Operação - Depósito");
				System.out.println("Valor do depósito: R$");
				deposito = entrada.nextFloat();
				novoSaldo = saldo + deposito;
				System.out.println("Saldo atual: R$" + novoSaldo);
			break;
			default:
				System.out.println("Operação inválida!");
		}

	}

}
