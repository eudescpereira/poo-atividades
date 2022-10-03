package exercicio2pt2;

public class Pobre extends Pessoa{
	
	public Pobre(String nome, int idade) {
		super(nome, idade);
	}
	
	public String trabalha() {
		return "\nO pobre esta trabalhando.";
	}

}
