package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2PilhaMenu {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<String>();
		
		int opcao = 5;
		String nome;
		
		do {
			System.out.println("\n1- Adicionar livro \n2-Listar todos os livros \n3-Retirar livro da pilha \n0-Sair.");
			System.out.println("Digite uma opção: ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.println("Digite o nome: ");
				entrada.skip("\\R?");
				nome = entrada.nextLine();
				livros.push(nome);
				System.out.println("Pilha: ");
				livros.forEach(System.out::println);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				System.out.println("Lista de livros na pilha: ");
				livros.forEach(System.out::println);
				break;
			case 3:
				if(livros.isEmpty()) {
					System.out.println("A fila está vazia!");
				}else {
					System.out.println("Pilha: ");
					System.out.println(livros.pop()); 
					System.out.println("Um livro foi retirado da pilha!");
				}
				break;
				default:
					System.out.println("Programa finalizado!");
			}
		}while(opcao!=0);

	}

}
