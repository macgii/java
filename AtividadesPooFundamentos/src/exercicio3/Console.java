package exercicio3;

public class Console extends Produto {

	private String midia;

	public Console(String console, String jogos, int quantidade, String classificacao, double preco, String midia) {
		super(console, jogos, quantidade, classificacao, preco);
		this.midia = midia;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo da mídia: " + midia);
	}
}
