package exercicio1;

public class AnalistaDeSistemas extends Funcionario {
	
	public AnalistaDeSistemas(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario());
		System.out.println("Novo Salario: " + super.getSalario());
	}
	
}
