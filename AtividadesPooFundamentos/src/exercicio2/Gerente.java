package exercicio2;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, String cargo, String funcao, double salario, int equipesACoordenar) {
		super(nome, cpf, cargo, funcao, salario);
		this.setEquipesACoordenar(equipesACoordenar);
	}

	public int getEquipesACoordenar() {
		return equipesACoordenar;
	}

	public void setEquipesACoordenar(int equipesACoordenar) {
		this.equipesACoordenar = equipesACoordenar;
	}

	private int equipesACoordenar;

	public void visualizar() {
		super.visualizar();
		System.out.println("Equipes a coordenar: " + this.equipesACoordenar);
	}

}
