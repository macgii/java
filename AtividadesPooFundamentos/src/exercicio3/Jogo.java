package exercicio3;

public class Jogo extends Produto {

	private String genero;

	public Jogo(String console, String jogos, int quantidade, String classificacao, double preco, String genero) {
		super(console, jogos, quantidade, classificacao, preco);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Gênero do jogo: " + this.genero);
	}

}
