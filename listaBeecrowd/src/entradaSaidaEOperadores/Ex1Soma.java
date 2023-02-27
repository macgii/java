package entradaSaidaEOperadores;

import java.util.Scanner;

public class Ex1Soma {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int a, b, soma;
		
		System.out.println("Digite o 1º número: ");
		a = entrada.nextInt();
		System.out.println("Digite o 2º número: ");
		b = entrada.nextInt();
		
		soma = a + b;
		System.out.println("SOMA = " + soma);

	}

}
