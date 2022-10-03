package exercicio2pt2;

public class Rica extends Pessoa{
	
	private double dinheiro;
	
	public Rica(String nome, int idade, double dinheiro) {
		super(nome, idade);
		this.dinheiro = dinheiro;
	}
	
	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public String fazCompras() {
		return "\nO rico esta fazendo compras.";
	}
	
}
