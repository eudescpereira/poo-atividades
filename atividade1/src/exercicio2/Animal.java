package exercicio2;

public class Animal {
		
		private String nome;
		private String raca;
		
		public Animal(String nome, String raca) {
			this.nome = nome;
			this.raca = raca;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public void animal(String nome) {
			System.out.println("O nome do animal e: " + nome);
		}
		
		public String caminha() {
			return "";
		}

}
