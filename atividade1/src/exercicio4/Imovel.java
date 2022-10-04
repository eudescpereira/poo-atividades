package exercicio4;

public class Imovel {
	
	private String endereco;
	private double valor;
	
	public Imovel(String endereco, double valor) {
		this.endereco = endereco;
		this.valor = valor;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void valorFinal() {
		System.out.println("O valor do imovel e: " + getValor());
	}
	

}
