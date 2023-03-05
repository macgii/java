package exercicio3;

public class Produto {

	private String console;
	private String jogos;
	private int quantidade;
	private String classificacao;
	private double preco;
	
	public Produto(String console, String jogos, int quantidade, String classificacao, double preco) {
		this.console = console;
		this.jogos = jogos;
		this.quantidade = quantidade;
		this.classificacao = classificacao;
		this.preco = preco;
		
		
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getJogos() {
		return jogos;
	}

	public void setJogos(String jogos) {
		this.jogos = jogos;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		System.out.println("\nTipo de console: " + console + "\nJogo: " + jogos + "\nQuantidade de jogos: " + quantidade + "\nClassificação indicativa: " + classificacao + String.format("\nPreço: %.2f", preco));
	}
	
}
