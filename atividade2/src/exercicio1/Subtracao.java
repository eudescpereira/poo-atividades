package exercicio1;

public class Subtracao extends OperacaoMatematica{
		
		@Override
		public void Calcula() {
			super.setResultado(this.getValor1() - this.getValor2());
			System.out.println("O resultado da subtracao e: " + super.getResultado());
		}

}
