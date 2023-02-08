package aula_01;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float salario, abono = 0, novoSalario;
		
		System.out.println("Valor do salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Valor do abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Valor total do salário: %.2f", novoSalario);
		leia.close();

	}

}
