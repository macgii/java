package exercicio1;

public class PessoaJuridica extends Cliente {

	private String CNPJ;

	public PessoaJuridica(String nome, int idade, String telefone, String endereco, String email, String cNPJ) {
		super(nome, idade, telefone, endereco, email);
		CNPJ = cNPJ;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.CNPJ);
	}

}
