package aula_04;

import java.util.Scanner;

public class Exercicio3Matriz {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int linha, coluna, soma1 = 0, soma2 = 0;

		System.out.println("Digite os numeros para uma matriz 3x3: ");

		for (linha = 0; linha < matriz.length; linha++) {
			for (coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = entrada.nextInt();
			}
		}

		System.out.println("Elementos da diagonal principal: ");
		for (linha = 0; linha < matriz.length; linha++) {
			System.out.println(matriz[linha][linha] + " ");
		}

		System.out.println("\nElementos da diagonal secundária: ");
		for (linha = 0; linha < matriz.length; linha++) {
			System.out.println(matriz[linha][matriz.length - linha - 1] + " ");
		}

		for (linha = 0; linha < 3; linha++) {
			soma1 += matriz[linha][linha];
			soma2 += matriz[linha][3 - linha - 1];
		}

		System.out.println("\nA soma da diagonal principal: " + soma1);
		System.out.println("\nA soma da diagonal secundária: " + soma2);

	}

}
