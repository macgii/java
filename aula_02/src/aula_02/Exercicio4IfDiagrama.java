package aula_02;

import java.util.Scanner;

public class Exercicio4IfDiagrama {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		String animal01, animal02, animal03;

		System.out.println("Digite o 1º animal: ");
		entrada.skip("\\R?");
		animal01 = entrada.nextLine();

		System.out.println("Digite o 2º animal: ");
		entrada.skip("\\R?");
		animal02 = entrada.nextLine();

		System.out.println("Digite o 3º animal: ");
		entrada.skip("\\R?");
		animal03 = entrada.nextLine();

		if (animal01.equalsIgnoreCase("Vertebrado")) {
			if (animal02.equalsIgnoreCase("Ave")) {
				if (animal03.equalsIgnoreCase("Aguia"))
					;
				else
					System.out.println("pomba");
			} else {
				if (animal03.equalsIgnoreCase("Onivoro"))
					System.out.println("Homem");
				else
					System.out.println("Vaca");
					}
		} else {
			if (animal02.equalsIgnoreCase("Inseto")) {
				if (animal03.equals("Hematofogo"))
					System.out.println("Pulga");
				else
					System.out.println("Lagarta");
			} else {
				if (animal03.equalsIgnoreCase("Hematofogo"))
					System.out.println("Sanguessuga");
				else
					System.out.println("Minhoca");
			}
		}
	}
}
