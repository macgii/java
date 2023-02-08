package aula_01;

import java.util.Scanner;

public class SalarioLiquido {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		
		float salarioBruto, adicionalNoturno, horasExtra, descontos, salarioLiquido;
		
		System.out.println("Valor do salário bruto: ");
		salarioBruto = entrada.nextFloat();
		
		System.out.println("Valor adicional noturno: ");
		adicionalNoturno = entrada.nextFloat();
		
		System.out.println("Valor horas extras: ");
		horasExtra = entrada.nextFloat();
		
		System.out.println("Valor do desconto: ");
		descontos = entrada.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtra * 5) - descontos;
		
		System.out.printf("Salario líquido: %.2f", salarioLiquido);
		entrada.close();
		
		
	}
}
