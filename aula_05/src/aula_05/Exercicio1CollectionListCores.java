package aula_05;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Exercicio1CollectionListCores {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		ArrayList <String> cores = new ArrayList<String>();
		
		int i;
		String cor;
		
		for(i=0;i<5;i++) {
			System.out.println("Digite a cor: ");
			cor = entrada.nextLine();
			cores.add(cor);
			
		}
		
		System.out.println("Listar todas as cores: ");
		cores.forEach(System.out::println);
		Collections.sort(cores);
		
		System.out.println("Ordenar as cores: ");
		cores.forEach(System.out::println);
		
		

	}

}
