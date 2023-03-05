package exercicio5;

public class Ingresso {
	
	private String show;
	private String local;
	private String horario;
	private String duracao;
	private double valor;
	
	public Ingresso(String show, String local, String horario, String duracao, double valor) {
		this.show = show;
		this.local = local;
		this.horario = horario;
		this.duracao = duracao;
		this.valor = valor;
	}
	
	public String getShow() {
		return show;
	}
	public void setShow(String show) {
		this.show = show;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		System.out.println("\nShow: " + show + "\nLocal: " + local + "\nHorario: " + horario + "\nDuração: " + duracao + String.format("\nValor do ingresso: %.2f", valor));
	}
	
}
