package exercicio2;

public class Circulo implements FormaGeometrica{
	
	private int raio;
	
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return 3.14 * (raio * raio);
	}

	@Override
	public double comprimento() {
		return 2 * 3.14 * raio;
	}

}
