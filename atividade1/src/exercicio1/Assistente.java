package exercicio1;

public class Assistente extends Funcionario{

	private int matricula;
	
	public Assistente(String nome, double salario, int matricula) {
		super(nome, salario);
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	void exibeDados() {
		System.out.println("Nome do Assistente: " + super.getNome());
		System.out.println("Numero de Matricula do Assistente: " + this.matricula);
		System.out.println("Salario do Assistente: " + super.getSalario());
		System.out.println("Ganho Anual: " + GanhoAnual());
	}
}
