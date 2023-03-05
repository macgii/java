package exercicio3;

public class TestaGame {

	public static void main(String[] args) {

		Produto produto1 = new Produto("Nintendo Switch", "Pokémon Scarlet", 2, "Livre", 299.00);
		Produto produto2 = new Produto("PlayStation 4", "God of War Ragnarok", 1, "+18", 230.00);

		produto1.visualizar();
		System.out.println();
		produto2.visualizar();

	}

}
