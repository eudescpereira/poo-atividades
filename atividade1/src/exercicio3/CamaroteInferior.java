package exercicio3;

public class CamaroteInferior extends Vip{

	private String localizacao;

	public CamaroteInferior(double valor, double adicional) {
		super(valor, adicional);
	}
	
	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	

}
