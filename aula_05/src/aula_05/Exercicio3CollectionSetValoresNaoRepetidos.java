package aula_05;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3CollectionSetValoresNaoRepetidos {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String args[]) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		int i, numero;
		
		System.out.println("Digite um numero: ");
		
		for(i=0;i<10;i++) {
			numero = entrada.nextInt();
			numeros.add(numero);
		}
		System.out.println("Lista de dados do Set: ");
		Iterator<Integer> itera = numeros.iterator();
		
		while(itera.hasNext()) {
			System.out.println(itera.next());
		}

	}
}
