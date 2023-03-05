package exercicio1;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Fávio", 45, "11 98598-3806", "Av Paulista", "fafamartins@gmail.com");

		Cliente cliente2 = new Cliente("Joao", 22, "15 97844-5616", "Rua Pandora", "joaozinhodacunha@gmail.com");

		cliente1.visualizar();
		System.out.println();
		cliente2.visualizar();

		PessoaFisica fisica1 = new PessoaFisica("Rafael", 27, "17 97752-9520", "Rua 7 cores", "rafaelmendx@gmail.com", "Casado", "404.566.720-66");

		PessoaFisica fisica2 = new PessoaFisica("Rui", 31, "21 91321-6617", "Av Celso Garcia", "ruizinhoalm@gmail.com", "Solteiro", "761.334.290-13");

		System.out.println();
		fisica1.visualizar();
		System.out.println();
		fisica2.visualizar();

		PessoaJuridica juridica1 = new PessoaJuridica("Giovana", 19, "11 98598-3808", "Rua Alto da compadecida", "gigi@gmail.com", "55.129.909/0001-36");
		PessoaJuridica juridica2 = new PessoaJuridica("Maiara", 20, "11 9822-3077", "Rua Baixo da lastima", "maizinha@gmail.com", "17.108.802/0001-12");

		System.out.println();
		juridica1.visualizar();
		System.out.println();
		juridica2.visualizar();
	}
}