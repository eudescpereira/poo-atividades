package exercicio2;

public class Quadrado implements FormaGeometrica {
	
	private int lado;
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public double comprimento() {
		return lado * 4;
	}

}