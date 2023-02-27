package lacoCondicional;

import java.util.Scanner;

public class Ex4DDD {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;

		System.out.println("Digite o DDD desejado: ");
		numero = entrada.nextInt();

		if (numero == 11) {
			System.out.println("São Paulo");
		} else if (numero == 19) {
			System.out.println("Campinas");
		} else if (numero == 21) {
			System.out.println("Rio de Janeiro");
		} else if (numero == 27) {
			System.out.println("Vitoria");
		} else if (numero == 31) {
			System.out.println("Belo Horizonte");
		} else if (numero == 32) {
			System.out.println("Juiz de Fora");
		} else if (numero == 61) {
			System.out.println("Brasilia");
		} else if (numero == 71) {
			System.out.println("Salvador");
		} else {
			System.out.println("DDD não cadastrado.");
		}
	}
}
