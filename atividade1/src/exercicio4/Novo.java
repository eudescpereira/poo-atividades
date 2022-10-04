package exercicio4;

public class Novo extends Imovel{
	
	private double adicional;
	
	public Novo(String endereco, double valor, double adicional) {
		super(endereco, valor);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public void valorFinal() {
		super.setValor(getValor() + adicional);
		System.out.println("O valor do imovel e: " + super.getValor());
	}
	
	

}
