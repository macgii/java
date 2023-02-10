package aula_02;

import java.util.Scanner;

public class PlanoSaude {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int idade;
	
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		if(idade>=0 && idade<=10)
		{
			System.out.println("Valor do Plano de saúde: R$ 100,00");
		}
		else if(idade>10 && idade<=29)
		{
			System.out.println("Valor do Plano de saúde: R$ 200,00");
		}
		else if(idade>29 && idade<=45)
		{
			System.out.println("Valor do Plano de saúde: R$ 300,00");
		}
		else if(idade>45 && idade<=59)
		{
			System.out.println("Valor do Plano de saúde: R$ 500,00");
		}
		else if(idade>59 && idade<=65)
		{
			System.out.println("Valor do Plano de saúde: R$ 600,00");
		}
		else if(idade>65)
		{
			System.out.println("Valor do Plano de saúde: R$ 1000,00");
		}
		else
		{
			System.out.println("Idade inválida!");
		}
		
	}

}
