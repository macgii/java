package aula_03;

import java.util.Scanner;

public class Exercicio4WhilePesquisa {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, genero, categoria, back = 0, front = 0, mobile = 0, full = 0;
		String continuar = "S";

		while (continuar.equalsIgnoreCase("S")) {

			System.out.println("Sua idade: ");
			idade = entrada.nextInt();

			System.out.println("Seu gênero: ");
			genero = entrada.nextInt();

			System.out.println("Sua categoria: ");
			categoria = entrada.nextInt();

			if (categoria == 1)
				back++;
			if (categoria == 2 && genero == 2)
				front++;
			if (categoria == 3 && genero == 1 && idade > 40)
				mobile++;
			if (categoria == 4 && genero == 2 && idade < 30)
				full++;

			System.out.println("Deseja continuar? (S/N): ");
			entrada.skip("\\R");
			continuar = entrada.nextLine().toUpperCase();
		}

		System.out.println("Total de pessoas desenvolvedores Backend: " + back);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + front);
		System.out.println("Total de homens desenvolvedores mobile maiores de 40 anos: " + mobile);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + full);
	}
}
