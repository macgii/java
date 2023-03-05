package exercicio5;

public class TestaIngresso {

	public static void main(String[] args) {
		
		Ingresso ingresso1 = new Ingresso ("Coldplay", "Autódromo de Interlagos", "18:00", "3h", 2500.00);
		Ingresso ingresso2 = new Ingresso ("Maroon 5", "Villa mix", "22:00", "1h e 30 min", 1000.00);

		ingresso1.visualizar();
		System.out.println();
		ingresso2.visualizar();
	}

}
