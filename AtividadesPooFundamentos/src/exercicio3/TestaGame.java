package exercicio3;

public class TestaGame {

	public static void main(String[] args) {

		Produto produto1 = new Produto("Nintendo Switch", "Pokémon Scarlet", 2, "Livre", 299.00);
		Produto produto2 = new Produto("PlayStation 4", "God of War Ragnarok", 1, "+18", 230.00);

		produto1.visualizar();
		System.out.println();
		produto2.visualizar();

		Jogo jogo1 = new Jogo("Xbox One", "Red Dead Redemption 2", 1, "+18", 249.00, "Aventura");
		Jogo jogo2 = new Jogo("Xbox One", "Far Cry 6", 2, "+18", 100.00, "Ação");

		System.out.println();
		jogo1.visualizar();
		System.out.println();
		jogo2.visualizar();

		Console console1 = new Console("Pc", "Goose Goose Duck", 1, "+12", 00.00, "Física");
		Console console2 = new Console("Pc", "Minecraft", 1, "Livre", 25.00, "Física");

		System.out.println();
		console1.visualizar();
		System.out.println();
		console2.visualizar();

	}

}
