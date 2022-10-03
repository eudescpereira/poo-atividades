package exercicio1;

public class Funcionario {

	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void addAumento(double aumento) {
		this.salario += aumento;
	}

	public double GanhoAnual() {
		return this.salario * 13;
	}
	
	void exibeDados() {
		System.out.println("Nome do funcionário: " + this.nome);
		System.out.println("Salário do funcionário: " + this.salario);
		System.out.println("Ganho Anual: " + GanhoAnual());
	}
}
