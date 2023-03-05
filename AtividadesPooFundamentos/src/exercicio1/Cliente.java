package exercicio1;

public class Cliente {

	private String nome;
	private int idade;
	private String telefone;
	private String endereco;
	private String email;

	public Cliente(String nome, int idade, String telefone, String endereco, String email) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void visualizar() {
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nTelefone: " + telefone + "\nEndereço: " + endereco
				+ "\nEmail: " + email);
	}
}
