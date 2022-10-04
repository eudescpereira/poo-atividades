package exercicio1;

public class Gerente extends Funcionario {
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario() + (salario * 0.10));
		System.out.println("Novo Salario: " + super.getSalario());
	}
	
	

}
