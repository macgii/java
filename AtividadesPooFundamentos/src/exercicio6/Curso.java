package exercicio6;

public class Curso {

	private String tipoCurso;
	private String horario;
	private String quantidadeAlunos;
	private String materia;
	private double preco;

	public Curso(String tipoCurso, String horario, String quatidadeAlunos, String materia, double preco) {
		this.tipoCurso = tipoCurso;
		this.horario = horario;
		this.quantidadeAlunos = quatidadeAlunos;
		this.materia = materia;
		this.preco = preco;

	}

	public String getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getQuatidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuatidadeAlunos(String quatidadeAlunos) {
		this.quantidadeAlunos = quatidadeAlunos;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void visualizar() {
		System.out.println("\nTipo do curso: " + tipoCurso + "\nHorario: " + horario + "\nQuantidade de alunos: "
				+ quantidadeAlunos + "\nMateria: " + materia + String.format("\nPreço: %.2f", preco));
	}
}
