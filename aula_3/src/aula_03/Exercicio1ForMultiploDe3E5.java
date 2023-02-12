package aula_03;

import java.util.Scanner;

public class Exercicio1ForMultiploDe3E5 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int numero1, numero2, i;

		System.out.println("Digite o 1º número: ");
		numero1 = entrada.nextInt();

		System.out.println("Digite o 2º número: ");
		numero2 = entrada.nextInt();

		if (numero1 < numero2) {
			System.out.println("No intervalo entre " + numero1 + " e " + numero2 + ":");
			for (i = numero1; i <= numero2; i++) {
				if (i % 3 == 0 && i % 5 == 0){
					System.out.println(i + " é múltiplo de 3 e 5.");
				}
			}
		} else {
			System.out.println("Intervalo inválido!");
		}
	}
}