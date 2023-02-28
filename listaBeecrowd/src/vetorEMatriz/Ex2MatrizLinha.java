package vetorEMatriz;

import java.util.Scanner;

public class Ex2MatrizLinha {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		Double Matriz[][] = new Double[12][12];
		double numero, soma = 0;

		for (int linha = 0; linha < Matriz.length; linha++) {
			for (int coluna = 0; coluna < Matriz.length; coluna++) {
				numero = entrada.nextDouble();

				Matriz[linha][coluna] = numero;

			}
		}

		for (int linha = 0; linha < Matriz.length; linha++) {
			for (int coluna = 0; coluna < Matriz.length; coluna++) {

				if (linha == 2) 
					soma += Matriz[linha][coluna];
				
			}
		}
		
		System.out.printf("%.1f", soma);
	}

}
