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
			System.out.println("Nome do Assistente Técnico: " + super.getNome());
			System.out.println("Número de matrícula do Assistente Técnico: " + super.getMatricula());
			System.out.println("Salário do Assistente Técnico: " + super.getSalario());
			System.out.println("Bonus Salarial: " + getBonus());
			System.out.println("Salário com Bônus: " + addBonus());
			System.out.println("Ganho anual do Assistente Técnico: " + super.GanhoAnual());
		}

}
