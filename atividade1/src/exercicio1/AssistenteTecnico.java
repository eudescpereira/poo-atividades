package exercicio1;

public class AssistenteTecnico extends Assistente{

		private double bonus;
		
		public AssistenteTecnico(String nome, double salario, int matricula, double bonus) {
			super(nome, salario, matricula);
			this.bonus = bonus;
		}
		
		public double getBonus() {
			return bonus;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		
		public double addBonus() {
			return (getSalario() + bonus);
		}

		@Override
		public double GanhoAnual() {
			return (getSalario() + bonus)*13;
		}

		@Override
		void exibeDados() {
			System.out.println("Nome do Assistente Tecnico: " + super.getNome());
			System.out.println("Numero de matricula do Assistente Tecnico: " + super.getMatricula());
			System.out.println("Salario do Assistente Tecnico: " + super.getSalario());
			System.out.println("Bonus Salarial: " + getBonus());
			System.out.println("Salario com Bonus: " + addBonus());
			System.out.println("Ganho anual do Assistente Tecnico: " + super.GanhoAnual());
		}

}
