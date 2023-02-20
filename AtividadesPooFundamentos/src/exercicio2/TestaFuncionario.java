package exercicio2;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Érica", "449.815.399-83", "Caixa", "Recebe pagamentos de clientes", 1200.00);
		
		Funcionario funcionario2 = new Funcionario("Rebeca", "870.362.866-32", "Advogada", "Defende os interesses de seus clientes", 15000.00);

		funcionario1.visualizar();
		System.out.println();
		funcionario2.visualizar();
		
	}

}
