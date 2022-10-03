package exercicio3;

public class Vip extends Ingresso{

	private double adicional;
	
	public Vip(double valor, double adicional) {
		super(valor);
		this.adicional = adicional;
	}

	@Override
	public void imprimeValor() {
		super.setValor(super.getValor() + adicional);
		System.out.println("Valor do ingresso Vip: " + super.getValor());
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
}
