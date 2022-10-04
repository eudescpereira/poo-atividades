package exercicio4;

public class Velho extends Imovel{
	
	private double desconto;
	
	public Velho(String endereco, double valor, double desconto) {
		super(endereco, valor);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	@Override
	public void valorFinal() {
		super.setValor(getValor() - desconto);
		System.out.println("O valor do imovel e: " + super.getValor());
	}
}
