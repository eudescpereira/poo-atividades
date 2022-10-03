package exercicio3;

public class CamaroteSuperior extends Vip {
	
	private int adicional;
	
	public CamaroteSuperior(double valor, double adicional) {
		super(valor, adicional);
	}
	
	@Override
	public void imprimeValor() {
		super.setValor((super.getValor() + super.getAdicional()) + adicional);
		System.out.println("Valor do ingresso Vip Camarote Superior: " + super.getValor());
	}

}
