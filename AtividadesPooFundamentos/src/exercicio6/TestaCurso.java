package exercicio6;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso ("Analise e desenvolovimento de Sistemas", "8h às 17h", "40", "MySQL, Spring Boot, Docker pt1", 8000.00);
		Curso curso2 = new Curso ("Inglês", "14h às 16h", "22", "Vocabulário, escrita, conersação", 2500.00);
		
		curso1.visualizar();
		System.out.println();
		curso2.visualizar();

	}

}
