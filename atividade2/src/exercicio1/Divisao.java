package exercicio1;

public class Divisao extends OperacaoMatematica{
	
	@Override
	public void Calcula() {
		super.setResultado(this.getValor1() / this.getValor2());
		System.out.println("O resultado da divisao e: " + super.getResultado());
	}
}
