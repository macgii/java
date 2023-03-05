package exercicio1;

public class PessoaFisica extends Cliente {

	public PessoaFisica(String nome, int idade, String telefone, String endereco, String email, String estadoCivil,
			String cpf) {
		super(nome, idade, telefone, endereco, email);
		this.estadoCivil = estadoCivil;
		this.CPF = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	private String estadoCivil;
	private String CPF;

	public String getCpf() {
		return CPF;
	}

	public void setCpf(String cpf) {
		this.CPF = cpf;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Estado Civil: " + this.estadoCivil);
		System.out.println("CPF: " + this.CPF);
	}
}
