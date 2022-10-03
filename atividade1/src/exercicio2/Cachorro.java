package exercicio2;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, String raca) {
		super(nome, raca);
	}

	public String late() {
		return "\nO doguinho esta latindo.";
	}

	@Override
	public String caminha() {
		return "\nO doguinho esta andando.";
	}
	
}
