package aula_02;

import java.util.Scanner;

public class Exercicio7SwitchCalculadora {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		float numero1, numero2, resultado;
		int opcao;
		
		System.out.println("Digite o 1º número: ");
		numero1 = entrada.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		numero2 = entrada.nextFloat();
		
		System.out.println("Ecolha uma operação matemática: \n1- Soma \n2- Subtração \n3- Multiplicação \n4- Divisão");
		opcao = entrada.nextInt();
		
		
		switch(opcao)
		{
		case 1:
			resultado = numero1 + numero2;
			System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, resultado);
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, resultado);
			break;
			default:
				System.out.println("Operação inválida!");
		}
	}

}
