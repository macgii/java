package aula_01;

import java.util.Scanner;

public class MediaFinal {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		
		float notaUm, notaDois, notaTres, notaQuatro, media;
		
		System.out.println("Primeira nota: ");
		notaUm = entrada.nextFloat();
		
		System.out.println("Segunda nota: ");
		notaDois = entrada.nextFloat(); 
		
		System.out.println("Terceira nota: ");
		notaTres = entrada.nextFloat();
		
		System.out.println("Quarta nota: ");
		notaQuatro = entrada.nextFloat();
		
		media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
		
		System.out.printf("Média final: %.1f", media);
		
		entrada.close();
	
	
	}
	
}
