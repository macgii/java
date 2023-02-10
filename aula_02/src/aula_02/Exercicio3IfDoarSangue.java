package aula_02;

import java.util.Scanner;

public class Exercicio3IfDoarSangue {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		String nome;
		boolean doacao;

		System.out.println("Nome do doador: ");
		nome = entrada.nextLine();

		System.out.println("Idade do doador: ");
		idade = entrada.nextInt();

		System.out.println("É a primeira doação? ");
		doacao = entrada.hasNext();

		if (idade >= 60 && idade <= 69) {
			if (doacao) {
				System.out.println(nome + " não está apto a doar sangue!");
			} else
				System.out.println(nome + " está apto a doar sangue!");
		} else if (idade >= 18 && idade < 60) {
			System.out.println(nome + " está apto a doar sangue!");
		} else {
			System.out.println(nome + " não está apto a doar sangue!");
		}
	}
}
