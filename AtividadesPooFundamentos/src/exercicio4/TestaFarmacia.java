package exercicio4;

import java.util.Scanner;

public class TestaFarmacia {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		long id;
		String nome, nomeComercial, fabricante, foto;
		float preco;

		System.out.println("\nId: ");
		id = entrada.nextLong();

		System.out.println("\nNome: ");
		entrada.skip("\\R?");
		nome = entrada.nextLine();

		System.out.println("Nome Comercial: ");
		nomeComercial = entrada.nextLine();

		System.out.println("Fabricante: ");
		fabricante = entrada.nextLine();

		System.out.println("Foto: ");
		foto = entrada.nextLine();

		System.out.println("Preço: ");
		preco = entrada.nextFloat();

		/*
		 * Farmacia f1 = new Farmacia(1, "Dipirona", "Novalgina", "Teuto", "-", 10.0f);
		 * Farmacia f2 = new Farmacia(2, "Paracetamol", "Tylenol", "Neo Quimica", "-",
		 * 20.0f);
		 * 
		 * f1.visualizar(); f2.visualizar();
		 */

	}

}
