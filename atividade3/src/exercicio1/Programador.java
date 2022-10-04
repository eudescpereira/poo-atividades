package exercicio1;

public class Programador extends Funcionario {
	
	public Programador(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario() + (salario * 0.20));
		System.out.println("Novo Salario: " + super.getSalario());
	}

}
