package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio2FilaClientesBanco {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		Queue<String> clientes = new LinkedList<String>();

		int opcao = 6;
		String nome;

		do {
			System.out.println(
					"\nOpcões: \n1- Adicionar cliente \n2-Listar todos os clientes \n3-Retirar clientes da fila \n0-Sair");
			System.out.println("Digite uma opção: ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				entrada.skip("\\R?");
				nome = entrada.nextLine();
				clientes.add(nome);
				System.out.println("Fila: ");
				clientes.forEach(System.out::println);
				System.out.println("Cliente adicionado!");
				break;
			case 2:
				System.out.println("Lista de clientes na fila: ");
				clientes.forEach(System.out::println);
				break;
			case 3:
				if (clientes.isEmpty())
					System.out.println("A fila está vazia!");
				else {
					System.out.println("Fila: ");
					System.out.println(clientes.poll());
					System.out.println("O cliente foi chamado!");
				}
				break;
			default:
				System.out.println("Programa finalizado!");
			}
		} while (opcao != 0);
	}
}
