package exercicio2;

public class Retangulo implements FormaGeometrica{
	
	private int largura, altura;
	
	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}

	@Override
	public double comprimento() {
		return (largura * 2) + (altura * 2);
	}

}
