package exercicio1;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente ("Fávio", "322.907.358-73", "11 98598-3806","Av Paulista","fafamartins@gmail.com");
		
		Cliente cliente2 = new Cliente ("Joao", "877.253.058-43", "15 97844-5616", "Rua Pandora", "joaozinhodacunha@gmail.com");
		
		cliente1.visualizar();
		System.out.println();
		cliente2.visualizar();
	}

}
