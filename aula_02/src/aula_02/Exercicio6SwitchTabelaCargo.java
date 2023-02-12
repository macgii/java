package aula_02;

import java.util.Scanner;

public class Exercicio6SwitchTabelaCargo {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		String nome;
		int codigoCargo;
		float salario, novoSalario;
		
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Digite o código do seu cargo: ");
		codigoCargo = entrada.nextInt();
		
		System.out.println("Informe o valor do seu salário: ");
		salario = entrada.nextFloat();
		
		switch(codigoCargo)
		{
		case 1:
			novoSalario = salario + ( 0.1f * salario);
			System.out.printf("Nome do colaborador: %s \nCargo: Gerente \nSalário: R$%.2f", nome, novoSalario);
			break;
		case 2:
			novoSalario = salario + ( 0.07f * salario);
			System.out.printf("Nome do colaborador: %s \nCargo: Vendedor \nSário: R$%.2f", nome, novoSalario);
			break;
		case 3:
			novoSalario = salario + ( 0.09f * salario);
			System.out.printf("Nome do colaborador: %s \nCargo: Supervisor \nSalário: R$%.2f", nome, novoSalario);
			break;
		case 4:
			novoSalario = salario + ( 0.06f * salario);
			System.out.printf("Nome do colaborador: %s \nCargo: Motorista \nSalário: R$%.2f", nome, novoSalario);
			break;
		case 5:
			novoSalario = salario + ( 0.05f * salario);
			System.out.printf("Nome do colaborador: %s \nCargo: Estoquista \nSalário: R$%.2f", nome, novoSalario);
			break;
		case 6:
			novoSalario = salario + ( 0.08f * salario);
			System.out.printf("Nome do colaborador: %s \nCargo: Técnico de TI \nSalário: RS%.2f", nome, novoSalario);
			break;
			default:
				System.out.println("Código inválido!");
		}

	}

}
