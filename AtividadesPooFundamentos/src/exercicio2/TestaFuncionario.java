package exercicio2;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Érica", "449.815.399-83", "Caixa", "Recebe pagamentos de clientes", 1200.00);
		
		Funcionario funcionario2 = new Funcionario("Rebeca", "870.362.866-32", "Advogada", "Defende os interesses de seus clientes", 15000.00);

		funcionario1.visualizar();
		System.out.println();
		funcionario2.visualizar();
		
		Gerente gerente1 = new Gerente("Clébio", "079.993.524-21", "Gerente", "responsável pela organização de um setor", 2500.00, 1);
		
		Gerente gerente2 = new Gerente("Antonio", "227.366.132-11", "Gerente", "responsável pelo planejamento de uma empresa", 2700.00, 3);
		
		System.out.println();
		gerente1.visualizar();
		System.out.println();
		gerente2.visualizar();
		
		Vendedor vendedor1 = new Vendedor("Jefferson", "643.751.356-75", "Vendedor", "Atendente de padaria", 1700.00, "Não");
		Vendedor vendedor2 = new Vendedor("Angela", "975.246.649-15", "Vendedora", "Auxilia clientes e vende roupas", 1900.00, "Sim");
		
		System.out.println();
		vendedor1.visualizar();
		System.out.println();
		vendedor2.visualizar();
				
	}

}
