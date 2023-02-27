package lacoRepeticao;

import java.util.Scanner;

public class Ex2QuadradoDePares {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int n, multi, i;

		System.out.println("Digite um numero: ");
		n = entrada.nextInt();

		for (i = 1; i <= n; i++) {
			if (n > 5 && n < 2000) {
				if (i % 2 == 0) {

					multi = i * i;

					System.out.println(i + " ^ 2 = " + multi);
				}
			}
		}
	}
}
