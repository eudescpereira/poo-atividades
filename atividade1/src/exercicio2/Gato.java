package exercicio2;

public class Gato extends Animal{
	
	public Gato(String nome, String raca) {
		super(nome, raca);
	}
	
	public String mia() {
		return "\nO gatinho esta miando.";
	}

	@Override
	public String caminha() {
		return "\nO gatinho esta andando.";
	}

}
