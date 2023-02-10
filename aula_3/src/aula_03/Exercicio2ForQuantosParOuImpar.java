package aula_03;

import java.util.Scanner;

public class Exercicio2ForQuantosParOuImpar {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

			int i, numero = 0, impar = 0, par = 0;
			
			for(i=0;i<10;i++)
			{
				System.out.println("Digite um número: ");
				numero = entrada.nextInt();
				if(numero % 2 == 0)
				{
					par++;
				}
				else
				{
					 impar++;
				}
			}
			System.out.println("Total de números pares: " + par);
			System.out.println("Total de números ímpares: " + impar);
	}
}
