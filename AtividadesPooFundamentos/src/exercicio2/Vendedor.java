package exercicio2;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, String cpf, String cargo, String funcao, double salario, String CLT) {
		super(nome, cpf, cargo, funcao, salario);
		this.CLT = CLT;
	}

	public String getCLT() {
		return CLT;
	}

	public void setCLT(String cLT) {
		CLT = cLT;
	}

	private String CLT;

	public void visualizar() {
		super.visualizar();
		System.out.println("É CLT: " + this.CLT);
	}

}
