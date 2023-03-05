package exercicio2;

public class Funcionario {

	private String nome;
	private String cpf;
	private String cargo;
	private String funcao;
	private double salario;

	public Funcionario(String nome, String cpf, String cargo, String funcao, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void visualizar() {
		System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nCargo: " + cargo + "\nFunção: " + funcao
				+ String.format("\nSalario: RS%.2f", salario));
	}
}
